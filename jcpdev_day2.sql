-- ���θ� : ���� ��ǰ�� ����
-- ��(CUSTOM) ���̺� ���� : �ʵ�(�÷�) ������ �̸��� ������ ���� �߿�
CREATE TABLE CUSTOM(
	-- �� ���̵�(���ڿ�, VAR : ��������, CHAR : ���� 2)
	-- �� �̸�(���ڿ�)
	-- �̸���(���ڿ�)
	-- ����(����, NUMBER) 3�ڸ� * NUMBER : INT, LONG, FLOAT, DOUBLE
	-- ��������(��¥Ÿ��)
	CUSTOM_ID VARCHAR2(20), -- ����Ʈ ����
	NAME VARCHAR(20),
	EMAIL VARCHAR(20),
	AGE (3),NUMBER
	REG_DATE DATE
);

-- ��ǰ(PRODUCT) ���̺� : ��ǰ�ڵ�, ��ǰ��, ����, ī�װ�
--											�� 00 : ������ǰ, 10 : ��ǰ, 20: ��Ȱ��ǰ...
CREATE TABLE PRODUCT(
	PCODE VARCHAR2(10),	-- ������ ������ ����ؼ� �����ϰ� ū ������ ��
	CATEGORY CHAR(2),	-- �������� 2����Ʈ
	PNAME VARCHAR2(50),	-- UTF-8 �ѱ��ϋ� ���� 6��
	PRICE NUMBER(9)
);

-- ����(BUY) ���̺� : �� WHO, ��ǰ WHAT �����ߴ°�
CREATE TABLE BUY(
	CUSTOM_ID VARCHAR2(20),	-- WHO
	PCODE VARCHAR2(10),		-- WHAT
	QUANTITY NUMBER(5),		-- HOW MANY
	BUY_DATE DATE			-- WHEN
);

/*
 * ���̺� ������ ���� ������ ���̺� �� �÷��� �������� �䱸���� ���� �ʿ�
 * ��������(CONSTRAINTS)�� ���� --> �������� ���Ἲ ����
 * NOT NULL, �⺻�� ���� : ���� ��� REG_DATE, BUY_DATE�� ���� ��¥�� �Ѵ�
 * ���� ���� : QUANTITY(����) �� 1���� ū������ �Ѵ�, 
 * 		��	������ ��(UNIQUE) : CUSTOM_ID, PCODE(� ���̺��� ����ũ �÷��� 1�� �̻�)
 * �⺻Ű(PRIAMRY KEY) : �˻�, ROWS �ĺ� �÷��� ǥ�� -> UNIQUE �÷� �߿��� ��, 
 * 		��	�⺻Ű�� 2�� �̻� �÷��� �׷�ȭ �� �� ����
 * �ܷ�Ű(FOREIGN KEY) : ����Ű, �ٸ� ���̺��� � �÷� ���� �����ϰ� �ִ���, 
 * 		��	BUY ���̺��� CUSTOM_ID ������ CUSTOM ���̺��� ����,
 * 		�� �������� �ߺ�����/�ϰ��� �����ϴ� ���
 */ 

-- INSERT DML ���� : ���̺� ���ο� ������ �߰�
-- INSERT INTO ��Ű���̸� ���̺��̸� (�÷�1, �÷�2,,,,) VALUES (�÷�1��, �÷�2��)
INSERT INTO CUSTOM (CUSTOM_ID,NAME,EMAIL,AGE,REG_DATE)
	VALUES ('MINA','��̳�','KIM@GMAIL.COM',20,'2020-05-23');

SELECT * FROM CUSTOM;

-- ��Ű���̸� ������ ��������
INSERT INTO CUSTOM (CUSTOM_ID) VALUES ('DAHYEON');
INSERT INTO CUSTOM (REG_DATE) VALUES ('2021-08-10');
INSERT INTO CUSTOM (REG_DATE) VALUES (SYSDATE);
INSERT INTO CUSTOM (CUSTOM_ID,NAME,EMAIL)
	VALUES('SOON1234','������','TEST@DAUM.NET');
-- ���ڿ�'', ��ġ���� ��ȣ���� �ۼ�
INSERT INTO CUSTOM (AGE) VALUES (33);
-- ��� �÷����� �߰��� �� ���̺� �̸� �ڿ� �÷��̸� ����
INSERT INTO CUSTOM
	VALUES('MINA2014','�̹̳�','LEE@GMAIL.COM',21,'2020-05-23');


/*
 * ���̺� ����� ������ ���� : UPDATE(����), DELETE(����)
 * UPDATE ���̺��̸� SET �÷��̸�1 = ������ ��1, �÷��̸�2 = �����Ұ�2,,,
 * 		WHERE ����;
 */
-- WHERE ���Ǿ��� UPDATE : ��� ROW �鿡 ���� --> �ſ� ������ �۾�
UPDATE CUSTOM SET REG_DATE = SYSDATE;
UPDATE CUSTOM SET AGE = 25 WHERE CUSTOM_ID = 'DAHYEON';

-- NAME ���� NULL �� ��� NAME = "GUEST" ���� UPDATE
UPDATE CUSTOM SET NAME = 'GUEST' WHERE NAME IS NULL;

-- CUSTOM_ID ���� NULL �� ��� CUSTOM_ID = 'GUEST' �� UPDATE 
UPDATE CUSTOM SET CUSTOM_ID = 'GUEST' WHERE CUSTOM_ID IS NULL;

-- AGE ���� 20���� ������ AGE = 99�� UPDATE
UPDATE CUSTOM SET AGE = 99 WHERE AGE < 20;

-- AND, OR --> ���� ������ �˻�
-- ���� ���������� �˻� --> IN
UPDATE CUSTOM SET AGE = 98 WHERE AGE IN(20,25); 
UPDATE CUSTOM SET AGE = 97 WHERE AGE = 98 OR AGE = 99;

-- SET �ڿ� �������� �÷� ���� �� �� ����
UPDATE CUSTOM SET AGE = 37, EMAIL = 'KOREAIT@KOREA.COM' WHERE AGE IS NULL AND EMAIL IS NULL;

-- DELETE ����
DELETE FROM CUSTOM WHERE EMAIL IS NULL;
DELETE FROM CUSTOM WHERE AGE = 99;

SELECT * FROM CUSTOM;
INSERT INTO CUSTOM (CUSTOM_ID,NAME,AGE,REG_DATE)
	VALUES ('MINA','��̳�',20,'2020-05-23');

-- ���̺��� �����͸� ��� ����
TRUNCATE TABLE CUSTOM;

INSERT INTO CUSTOM VALUES('MINA','�̳�','MINA@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('SANA','�糪','SANA@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('MOMO','���','MOMO@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('JUNGHYEON','����','JUNGHYEON@GMAIL.COM',20, SYSDATE);
INSERT INTO CUSTOM VALUES('DAHYEON','����','DAHYEON@GMAIL.COM',20, SYSDATE);

INSERT INTO PRODUCT VALUES('IPAD','00','�����е�',880000);
INSERT INTO PRODUCT VALUES('GALAXYTAP','00','��������',880000);
INSERT INTO PRODUCT VALUES('SNACK','10','����',2000);
INSERT INTO PRODUCT VALUES('DESK','20','å��',200000);

INSERT INTO BUY VALUES('MINA','IPAD',2,SYSDATE);
INSERT INTO BUY VALUES('MINA','GALAXYTAP',2,SYSDATE);
INSERT INTO BUY VALUES('MINA','SNACK',1,SYSDATE);
INSERT INTO BUY VALUES('MINA','DESK',1,SYSDATE);

SELECT * FROM CUSTOM;
SELECT * FROM PRODUCT;
SELECT * FROM BUY;

-- ���ݱ����� SELECT�� ���̺��� ��� ���� ������
-- 1. Ư�� �÷��� ����ʹ�
SELECT CUSTOM_ID,AGE FROM CUSTOM;
-- 2. Ư�� ROW (�˻����ǿ� �´�) --> WHERE
-- ���� �������� ��ȸ : 40�� �̸�
SELECT * FROM CUSTOM WHERE AGE < 40;

SELECT * FROM CUSTOM WHERE IN ( 37, 97);

SELECT * FROM CUSTOM WHERE NOT IN ( 37, 97);

-- �̸� �������� �˻�
SELECT * FROM CUSTOM WHERE NAME = '�մ�';
SELECT * FROM CUSTOM WHERE NAME NOT IN '�մ�';
-- ���� ��
SELECT * FROM CUSTOM WHERE CUSTOM_ID LIKE '%MINA';
SELECT * FROM CUSTOM WHERE CUSTOM_ID LIKE '%MINA%';
-- ����Ŭ���� ���̺�� �÷��� ��� ��ü�ĺ��� �̸��� ��ҹ��� ���� ���մϴ�
-- ����� ������ ���ڿ��� ��ҹ��� ����

-- DUAL ���̺� : � ���ѿ����� ����� ������ �ӽ� ���̺�
SELECT 22*233 FROM DUAL;
SELECT LOWER('MiNa') FROM DUAL;
SELECT UPPER('MiNa') FROM DUAL;
SELECT SYSDATE FROM DUAL;
-- 3. �����ִ� ���� : ORDER BY �÷��̸� [ASC/DESC]
SELECT * FROM CUSTOM ORDER BY NAME;
-- ���� ���� ��� -> ������� ���� : ���� ���� DESC(DSESCENDING)
SELECT * FROM CUSTOM ORDER BY AGE DESC;
SELECT * FROM CUSTOM ORDER BY AGE DESC, NAME; -- ���� ������ AGE ���� 2������(AGE ������) NAME

