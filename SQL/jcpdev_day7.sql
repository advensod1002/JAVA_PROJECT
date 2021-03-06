CREATE SEQUENCE MEM_SEQ;

CREATE TABLE MEMBER(
	IDX NUMBER(5) PRIMARY KEY,
	STUNAME VARCHAR2(20) NOT NULL,
	EMAIL VARCHAR2(20) NOT NULL,
	TEL VARCHAR2(20),
	PASSWORD VARCHAR2(10)
);

CREATE TABLE BOOK(
	BCODE CHAR(5) PRIMARY KEY,
	TITLE VARCHAR2(30) NOT NULL,
	WRITER VARCHAR2(20),
	PUBLISHER VARCHAR2(20),
	CDATE DATE

);

CREATE TABLE BOOKRENT(
	IDX NUMBER(5) NOT NULL,
	BCODE CHAR(5) NOT NULL,
	RENT_DATE DATE NOT NULL,
	EXP_DATE DATE NOT NULL,
	STATE CHAR(1) DEFAULT 'F',
	RETURN_DATE DATE,
	CONSTRAINT BOOKRENT_PK PRIMARY KEY(IDX, BCODE)
	-- CONSTRAINT IDX_FK FOREIGN KEY(IDX) REFERENCES MEMBER(IDX),
	-- CONSTRAINT BCODE_FK FOREIGN KEY(BCODE) REFERENCES BOOK(BCODE)
);
ALTER TABLE BOOKRENT ADD CHECK (STATE IN ('F','T'));
ALTER TABLE BOOKRENT ADD CONSTRAINT RENT_IDX_FK FOREIGN KEY (IDX) REFERENCES MEMBER(IDX);
ALTER TABLE BOOKRENT ADD CONSTRAINT RENT_BCODE_FK FOREIGN KEY (BCODE) REFERENCES BOOK(BCODE);

-- 시퀀스 이름변경
-- 
-- bookrent 데이터 변경

SELECT * FROM MEMBER;
INSERT INTO MEMBER VALUES (MEM_SEQ.NEXTVAL,'이하니','honey@naver.com','010-9889-0567','1122');
INSERT INTO MEMBER VALUES (MEM_SEQ.NEXTVAL,'이세종','jong@daum.net','010-2354-6773','2345');
INSERT INTO MEMBER VALUES (MEM_SEQ.NEXTVAL,'최행운','lucky@korea.com','010-5467-8792 ','9876');
INSERT INTO MEMBER VALUES (MEM_SEQ.NEXTVAL,'나길동','nadong@kkk.net','010-3456-8765','3456');
INSERT INTO MEMBER VALUES (MEM_SEQ.NEXTVAL,'강감찬','haha@korea.net','010-3987-9087','1234');

SELECT * FROM BOOK;
INSERT INTO BOOK VALUES ('A1101','코스모스','칼세이건','사이언스북스','2006-12-01');
INSERT INTO BOOK VALUES ('B1101','해커스토익','이해커','해커스랩','2018-07-10');
INSERT INTO BOOK VALUES ('C1101','푸른 사자 와니니','이현','창비','2015-06-20');
INSERT INTO BOOK VALUES ('A1102','페스트','알베르트 까위','민음사','2011-03-01');

SELECT * FROM BOOKRENT;
INSERT INTO BOOKRENT (IDX, BCODE, RENT_DATE, EXP_DATE)
VALUES ('1','A1101','2020-10-11','2020-10-25');
INSERT INTO BOOKRENT (IDX, BCODE, RENT_DATE, EXP_DATE,RETURN_DATE)
VALUES ('1','B1101','2020-09-01','2020-09-15','2020-09-14');
INSERT INTO BOOKRENT 
VALUES ('2','C1101','2020-09-12','2020-09-26','T','2020-09-29');
INSERT INTO BOOKRENT (IDX, BCODE, RENT_DATE, EXP_DATE)
VALUES ('3','A1102','2020-10-04','2020-10-18');
INSERT INTO BOOKRENT (IDX, BCODE, RENT_DATE, EXP_DATE,RETURN_DATE)
VALUES ('3','B1101','2020-09-03','2020-09-17','2020-09-17');
INSERT INTO BOOKRENT (IDX, BCODE, RENT_DATE, EXP_DATE)
VALUES ('4','C1101','2020-10-02','2020-10-16');

---------------------------------------------------------------------------------
UPDATE BOOKRENT SET STATE = 'T'
WHERE EXP_DATE < '2020-10-19' AND RETURN_DATE IS NULL;

SELECT BR.IDX, B.BCODE, B.TITLE, B.PUBLISHER, BR.RENT_DATE, BR.EXP_DATE,
DECODE (STATE, 'T' , '연체중') STATE
FROM BOOK B, BOOKRENT BR
WHERE BR.RETURN_DATE IS NULL AND B.BCODE = BR.BCODE(+)
GROUP BY BR.IDX, B.BCODE, B.TITLE, B.PUBLISHER, BR.RENT_DATE, BR.EXP_DATE, BR.STATE
ORDER BY BR.IDX;
---------------------------------------------------------------------------------
SELECT M.IDX, STUNAME, NVL(CNT,0) AS "대여건수"
FROM MEMBER M,(SELECT IDX, COUNT(*) CNT FROM BOOKRENT BR GROUP BY IDX) BR_CNT
WHERE M.IDX = BR_CNT.IDX(+) ORDER BY IDX;

SELECT M.IDX, M.STUNAME, COUNT(BR.IDX) AS "대여건수"
FROM MEMBER M, BOOKRENT BR WHERE M.IDX = BR.IDX(+) 
GROUP BY M.IDX , M.STUNAME, BR.IDX ORDER BY M.IDX ASC;
---------------------------------------------------------------------------------
SELECT M.IDX, STUNAME, NVL(CNT,0) AS "대여건수"
FROM MEMBER M,(SELECT IDX, COUNT(*) CNT FROM BOOKRENT BR 
			   WHERE STATE = 'T' GROUP BY IDX) BR_CNT
WHERE M.IDX = BR_CNT.IDX(+) ORDER BY IDX;

SELECT M.IDX, M.STUNAME, COUNT(BR.STATE) AS "연체건수"
FROM MEMBER M, BOOKRENT BR
WHERE M.IDX = BR.IDX(+) AND BR.STATE(+) = 'T'
GROUP BY M.IDX, M.STUNAME, BR.STATE
ORDER BY M.IDX;


