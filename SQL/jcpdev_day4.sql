-- ����Ŭ �����ͺ��̽���ü : ������ - ������ n~m ���� +/- k ��ŭ ���� ����ؼ�
-- �Ϸù�ȣ ���� ���� �ڵ����� ����(nextval �Լ�)
-- �������� ���� ������ ���� �� �����Ƿ� ���� �̸�����
-- 1���� �����ϰ� ������ drop sequence �̸� �����ϰ� �ٽû���

CREATE SEQUENCE test_seq;	-- n�� 1����, k�� +1�� �⺻������ ����
CREATE SEQUENCE buy_seq;
CREATE TABLE tblseq#(column1 number(3)); 
INSERT INTO tblseq#(column1) values(test_seq.nextval);
SELECT * FROM tblseq#;
DROP SEQUENCE test_seq;
TRUNCATE TABLE tblseq#;

CREATE TABLE CUSTOM#(
	CUSTOM_ID VARCHAR2(20) CONSTRAINT CUSTOM#_PK PRIMARY KEY,
	NAME VARCHAR2(20) NOT NULL,
	EMAIL VARCHAR2(20),
	AGE NUMBER(3),
	REG_DATE DATE DEFAULT SYSDATE
);

CREATE TABLE PRODUCT#(
	PCODE VARCHAR2(10) CONSTRAINT PRODUCT#_PK PRIMARY KEY,	
	CATEGORY CHAR(2) CHECK (CATEGORY IN ('10','11','12')),	
	PNAME VARCHAR2(50) NOT NULL,	
	PRICE NUMBER(9) CHECK (PRICE > 0)
);

CREATE TABLE BUY#(
	BUY_NO NUMBER(9) CONSTRAINT BUY#_PK PRIMARY KEY,
	CUSTOM_ID VARCHAR2(20) NOT NULL,	
	PCODE VARCHAR2(10) NOT NULL,		
	QUANTITY NUMBER(5) CHECK(QUANTITY >0),		
	BUY_DATE DATE DEFAULT SYSDATE,
	CONSTRAINT CUSTOM_ID_FK FOREIGN KEY (CUSTOM_ID) REFERENCES CUSTOM#(CUSTOM_ID),
	CONSTRAINT PCODE_FK FOREIGN KEY (PCODE) REFERENCES PRODUCT#(PCODE)
);
DROP TABLE CUSTOM# CASCADE CONSTRAINT;
INSERT INTO CUSTOM#(CUSTOM_ID, NAME, EMAIL, AGE) VALUES ('nayeon','�ӳ���','na@korea.com','25');
INSERT INTO CUSTOM#(CUSTOM_ID, NAME, EMAIL, AGE) VALUES ('jungYu','������','jung@daum.net','27');
INSERT INTO CUSTOM#(CUSTOM_ID, NAME, EMAIL, AGE) VALUES ('momo','�����̸��','momo@gmail.com','24');
INSERT INTO CUSTOM#(CUSTOM_ID, NAME, EMAIL, AGE) VALUES ('dahyeon','�����','da@naver.com','33');
SELECT * FROM CUSTOM#;

DROP TABLE PRODUCT#  CASCADE CONSTRAINT;
INSERT INTO PRODUCT# VALUES ('SAV1245-01',10,'����ũ û�ұ�',176000);
INSERT INTO PRODUCT# VALUES ('ACH991',11,'�����е����� 5',270000);
INSERT INTO PRODUCT# VALUES ('H49452',12,'�������������',90400);
INSERT INTO PRODUCT# VALUES ('LG98T2',10,'��Ʈ��',392300);
INSERT INTO PRODUCT# VALUES ('MU98',12,'USB 1TB',14000);
SELECT * FROM PRODUCT#;

DROP TABLE BUY# CASCADE CONSTRAINT;
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'jungYu','H49452',1);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'momo','MU98',3);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'dahyeon','SAV1245-01',2);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'nayeon','MU98',2);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'dahyeon','ACH991',3);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'jungYu','LG98T2',2);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'nayeon','LG98T2',2);
INSERT INTO BUY#(BUY_NO, CUSTOM_ID, PCODE, QUANTITY) VALUES (buy_seq.nextval,'jungYu','ACH991',4);
SELECT * FROM BUY#;