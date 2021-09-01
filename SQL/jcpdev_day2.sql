-- 쇼핑몰 : 고객이 상품을 구매
-- 고객(CUSTOM) 테이블 생성 : 필드(컬럼) 구성은 이름과 데이터 형식 중요
CREATE TABLE CUSTOM(
	-- 고객 아이디(문자열, VAR : 가변적인, CHAR : 문자 2)
	-- 고객 이름(문자열)
	-- 이메일(문자열)
	-- 나이(정수, NUMBER) 3자리 * NUMBER : INT, LONG, FLOAT, DOUBLE
	-- 가입일자(날짜타입)
	CUSTOM_ID VARCHAR2(20), -- 바이트 지정
	NAME VARCHAR(20),
	EMAIL VARCHAR(20),
	AGE (3),NUMBER
	REG_DATE DATE
);

-- 상품(PRODUCT) 테이블 : 상품코드, 상품명, 가격, 카테고리
--											ㄴ 00 : 전자제품, 10 : 식품, 20: 생활용품...
CREATE TABLE PRODUCT(
	PCODE VARCHAR2(10),	-- 가능한 데이터 고려해서 적절하게 큰 사이즈 값
	CATEGORY CHAR(2),	-- 고정길이 2바이트
	PNAME VARCHAR2(50),	-- UTF-8 한글일떄 문자 6개
	PRICE NUMBER(9)
);

-- 구매(BUY) 테이블 : 고객 WHO, 상품 WHAT 구매했는가
CREATE TABLE BUY(
	CUSTOM_ID VARCHAR2(20),	-- WHO
	PCODE VARCHAR2(10),		-- WHAT
	QUANTITY NUMBER(5),		-- HOW MANY
	BUY_DATE DATE			-- WHEN
);

/*
 * 테이블 사이의 관계 설정과 테이블 각 컬럼에 여러가지 요구사항 적용 필요
 * 제약조건(CONSTRAINTS)을 설절 --> 데이터의 무결성 유지
 * NOT NULL, 기본값 설정 : 예를 들면 REG_DATE, BUY_DATE를 현내 날짜로 한다
 * 값의 제한 : QUANTITY(수량) 이 1보다 큰값으로 한다, 
 * 		ㄴ	유일한 값(UNIQUE) : CUSTOM_ID, PCODE(어떤 테이블에서 유니크 컬럼은 1개 이상)
 * 기본키(PRIAMRY KEY) : 검색, ROWS 식별 컬럼을 표시 -> UNIQUE 컬럼 중에서 고름, 
 * 		ㄴ	기본키는 2개 이상 컬럼을 그룹화 할 수 있음
 * 외래키(FOREIGN KEY) : 참조키, 다른 테이블의 어떤 컬럼 값을 참고하고 있는지, 
 * 		ㄴ	BUY 테이블의 CUSTOM_ID 값으로 CUSTOM 테이블을 참조,
 * 		ㄴ 데이터의 중복제거/일관성 유지하는 방법
 */ 

-- INSERT DML 형식 : 테이블에 새로운 데이터 추가
-- INSERT INTO 스키마이름 테이블이름 (컬럼1, 컬럼2,,,,) VALUES (컬럼1값, 컬럼2값)
INSERT INTO CUSTOM (CUSTOM_ID,NAME,EMAIL,AGE,REG_DATE)
	VALUES ('MINA','김미나','KIM@GMAIL.COM',20,'2020-05-23');

SELECT * FROM CUSTOM;

-- 스키마이름 같으면 생략가능
INSERT INTO CUSTOM (CUSTOM_ID) VALUES ('DAHYEON');
INSERT INTO CUSTOM (REG_DATE) VALUES ('2021-08-10');
INSERT INTO CUSTOM (REG_DATE) VALUES (SYSDATE);
INSERT INTO CUSTOM (CUSTOM_ID,NAME,EMAIL)
	VALUES('SOON1234','도봉순','TEST@DAUM.NET');
-- 문자열'', 수치값은 기호없이 작성
INSERT INTO CUSTOM (AGE) VALUES (33);
-- 모든 컬럼값을 추가할 때 테이블 이름 뒤에 컬럼이름 생략
INSERT INTO CUSTOM
	VALUES('MINA2014','이미나','LEE@GMAIL.COM',21,'2020-05-23');


/*
 * 테이블에 저장된 데이터 변경 : UPDATE(수정), DELETE(삭제)
 * UPDATE 테이블이름 SET 컬럼이름1 = 수정할 값1, 컬럼이름2 = 수정할값2,,,
 * 		WHERE 조건;
 */
-- WHERE 조건없는 UPDATE : 모든 ROW 들에 적용 --> 매우 위험한 작업
UPDATE CUSTOM SET REG_DATE = SYSDATE;
UPDATE CUSTOM SET AGE = 25 WHERE CUSTOM_ID = 'DAHYEON';

-- NAME 값이 NULL 인 경우 NAME = "GUEST" 으로 UPDATE
UPDATE CUSTOM SET NAME = 'GUEST' WHERE NAME IS NULL;

-- CUSTOM_ID 값이 NULL 인 경우 CUSTOM_ID = 'GUEST' 로 UPDATE 
UPDATE CUSTOM SET CUSTOM_ID = 'GUEST' WHERE CUSTOM_ID IS NULL;

-- AGE 값이 20보다 작으면 AGE = 99로 UPDATE
UPDATE CUSTOM SET AGE = 99 WHERE AGE < 20;

-- AND, OR --> 값을 범위로 검사
-- 값을 개별적으로 검사 --> IN
UPDATE CUSTOM SET AGE = 98 WHERE AGE IN(20,25); 
UPDATE CUSTOM SET AGE = 97 WHERE AGE = 98 OR AGE = 99;

-- SET 뒤에 여러개의 컬럼 변경 할 수 있음
UPDATE CUSTOM SET AGE = 37, EMAIL = 'KOREAIT@KOREA.COM' WHERE AGE IS NULL AND EMAIL IS NULL;

-- DELETE 형식
DELETE FROM CUSTOM WHERE EMAIL IS NULL;
DELETE FROM CUSTOM WHERE AGE = 99;

SELECT * FROM CUSTOM;
INSERT INTO CUSTOM (CUSTOM_ID,NAME,AGE,REG_DATE)
	VALUES ('MINA','김미나',20,'2020-05-23');

-- 테이블의 데이터를 모두 삭제
TRUNCATE TABLE CUSTOM;

INSERT INTO CUSTOM VALUES('MINA','미나','MINA@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('SANA','사나','SANA@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('MOMO','모모','MOMO@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('JUNGHYEON','정연','JUNGHYEON@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('DAHYEON','다현','DAHYEON@GMAIL.COM',20, SYSDATE);

INSERT INTO PRODUCT VALUES('IPAD','00','아이패드',880000);
INSERT INTO PRODUCT VALUES('GALAXYTAP','00','갤럭시탭',880000);
INSERT INTO PRODUCT VALUES('SNACK','10','과자',2000);
INSERT INTO PRODUCT VALUES('DESK','20','책상',200000);

INSERT INTO BUY VALUES('MINA','IPAD',2,SYSDATE);
INSERT INTO BUY VALUES('MINA','GALAXYTAP',2,SYSDATE);
INSERT INTO BUY VALUES('MINA','SNACK',1,SYSDATE);
INSERT INTO BUY VALUES('MINA','DESK',1,SYSDATE);

SELECT * FROM CUSTOM;
SELECT * FROM PRODUCT;
SELECT * FROM BUY;

-- 지금까지의 SELECT는 테이블의 모든 값을 보여줌
-- 1. 특정 컬럼만 보고싶다
SELECT CUSTOM_ID,AGE FROM CUSTOM;
-- 2. 특정 ROW (검색조건에 맞는) --> WHERE
-- 나이 조건으로 조회 : 40세 미만
SELECT * FROM CUSTOM WHERE AGE < 40;

SELECT * FROM CUSTOM WHERE IN ( 37, 97);

SELECT * FROM CUSTOM WHERE NOT IN ( 37, 97);

-- 이름 조건으로 검색
SELECT * FROM CUSTOM WHERE NAME = '손님';
SELECT * FROM CUSTOM WHERE NAME NOT IN '손님';
-- 유사 비교
SELECT * FROM CUSTOM WHERE CUSTOM_ID LIKE '%MINA';
SELECT * FROM CUSTOM WHERE CUSTOM_ID LIKE '%MINA%';
-- 오라클에서 테이블명 컬럼명 등등 객체식별자 이름은 대소문자 구분 안합니다
-- 저장된 데이터 문자열은 대소문자 구별

-- DUAL 테이블 : 어떤 권한에서나 사용이 가능한 임시 테이블
SELECT 22*233 FROM DUAL;
SELECT LOWER('MiNa') FROM DUAL;
SELECT UPPER('MiNa') FROM DUAL;
SELECT SYSDATE FROM DUAL;
-- 3. 보여주는 순서 : ORDER BY 컬럼이름 [ASC/DESC]
SELECT * FROM CUSTOM ORDER BY NAME;
-- 나이 많은 사람 -> 적은사람 순서 : 내림 차순 DESC(DSESCENDING)
SELECT * FROM CUSTOM ORDER BY AGE DESC;
SELECT * FROM CUSTOM ORDER BY AGE DESC, NAME; -- 정렬 기준이 AGE 먼저 2차기준(AGE 같을때) NAME

