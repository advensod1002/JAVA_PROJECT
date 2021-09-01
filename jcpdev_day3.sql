CREATE TABLE tbl# (
	col1 varchar2(30) CONSTRAINT tbl#_notnull1 NOT NULL,
	col2 varchar2(10) NOT NULL,  -- CONSTRAINT Ű���� ���� 
	col3 varchar2(10),
	col4 number(3)
);   -- CREATE �� 1���� �����մϴ�.

INSERT INTO tbl#(col1) VALUES ('test1');  -- ���� : �������� ����
INSERT INTO tbl#(col1,col2) VALUES ('test1','test2');  --���� ����

-- DML �߿��� insert, update,delete �� ������ ���� ���� Ȯ��
SELECT * FROM tbl#;

-- alter table   ���̺�� [���泻��Ű����]  (���泻��)  
-- 1)�÷� �̸� ����                 �����̸� to ���ο� �̸�
-- ALTER TABLE tbl# RENAME COLUMN co12 TO col3;  

-- 2) �Ʒ� �÷� �߰��ϸ� ���� row(��)�鵵 ���� �߰��� �÷�5 �� �� 100
ALTER TABLE tbl# ADD (column5 NUMBER(5) DEFAULT 100); -- �� : �⺻�� 100
-- 2) �� �����Ŀ� ������ �߰��մϴ�.
INSERT INTO tbl#(col1,col2) VALUES ('�׽�Ʈ11','�׽�Ʈ');

-- ���� : col2 10����Ʈ �ʰ� -> �ѱ� 3����Ʈ �׿� 1����Ʈ 
-- INSERT INTO tbl#(col1,col2) VALUES ('�׽�Ʈ11','�׽�Ʈ22');

-- �÷��߰� : column6 �������ڿ�(20) �⺻�� 'guest' �� �����غ�����.
ALTER  TABLE tbl# ADD (column6 VARCHAR(20) DEFAULT 'guest');
-- �Ʒ� ������ �߰� �� Ȯ��
INSERT INTO tbl#(col1,col2) VALUES ('�Խ�Ʈ1','�Խ�Ʈ2');

-- 4) ���� �÷� ���� ����
ALTER TABLE tbl# MODIFY (col2 varchar2(50)); 

-- 5) �������� �߰� : ������ ����� ������ ������ ������ ���� �� �ִ� �����Դϴ�.
--    col3 ���� ������ �� null �� ������ �������� �����Ͽ� ����
ALTER TABLE tbl# ADD CONSTRAINT tbl#_notnull2 CHECK (col3 IS NOT NULL);
--    ���� ? or ����? -> col4 ���������Ͱ� �������ǿ� �´� ���̴�.
ALTER TABLE tbl# ADD CONSTRAINT tbl#_notnull3 CHECK (col4 IS NOT NULL);

-- 7) �������� ����
ALTER TABLE tbl# DROP CONSTRAINT tbl#_notnull3;

-- �������� Ű������� not null �� null�� ������ ��
ALTER TABLE tbl# MODIFY COL2 VARCHAR2(50) NULL;

-- col3 ������ ��� ä�� �Ŀ� ����Ȯ�� �غ�����. null -> not null�� ����
ALTER TABLE tbl# MODIFY COL3 VARCHAR2(50) NOT NULL;

-- ((����))���̺��� �������� �̸� Ȯ���ϱ� : ����Ŭ�� �ý��� ���̺�
SELECT CONSTRAINT_NAME FROM USER_CONSTRAINTS;
SELECT * FROM USER_CONSTRAINTS;
ALTER TABLE tbl# DROP CONSTRAINT SYS_C0010623;

SELECT * FROM tbl#;
-- [���泻��Ű����] : 
-- 1) *�÷� �̸� ���� : rename column 
-- 2) ���̺� �̸� ���� : rename to 
-- 3) *���ο� �÷� �߰� : add
-- 4) *�÷� ������ ���� ���� : modify
-- 5) *���� ���� �߰� : add constraint  
-- 6) ���� �÷� ���� : drop
-- 7) ���� ���� ���� ���� : drop constraint ���������̸�

-- ���̺� : ��ü/���踦 �����ͷ� ����. �ʵ�(��ü/������ �Ӽ�)�� ����
-- student ��ü�� �䱸���׿� ���� �ʵ�(�Ӽ�) ����
-- 			�� �ʵ� : �й�, �̸�, �ּ�, ����, ����
--			�� 	  : �������ڿ�/�������ڿ�/��ġ/...
CREATE TABLE STUDENT(
	stu_no char(6) NOT NULL,
	stu_name varchar2(20) NOT NULL,
	address varchar(50),
	age number(3) CHECK (age BETWEEN 16 AND 20),
	gender char(1) CHECK (gender IN ('M','F'))	-- Male, Female
);
-- INSERT  ���� �������� ���� �߻��ϴ� ��� �����ؼ� 10�� �׽�Ʈ �غ���
-- �й� : 2021A1
INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES ('2021A1','�ֻ糪');
-- INSERT INTO STUDENT(STU_NO,STU_NAME,AGE,GENDER) VALUES ('2021B2','��̳�',15,'F');
INSERT INTO STUDENT VALUES ('2021B2','��̳�','����� ������ ���ﵿ',17,'F');
INSERT INTO STUDENT VALUES ('2021B5','����ȣ','��⵵ ������',19,'M');
-- �̸� �ֻ糪 �л��� �ּҸ� '��⵵ ����' �� ����
UPDATE STUDENT SET ADDRESS = '��⵵ ����' WHERE STU_NAME = '�ֻ糪';
-- STUDEN ���̺��� �л��̸� ���� ����
SELECT STU_NAME, AGE, GENDER FROM STUDENT;
-- DECODE(�˻��ʵ�,'�񱳰�','��°�','�񱳰�',...,ELSE '��°�') �Լ� ���
-- NVL(�ʵ�,'NULL��ü��')
SELECT STU_NAME, NVL(AGE,0), DECODE(GENDER,'M','����','F','����','UNKNOWN') FROM STUDENT;
-- �⺻Ű ���� ���� : NULL �� ��� X, ������ ��(UNIQUE) -> ��ü�ν��Ͻ�(ROW) �ĺ�(����)
ALTER TABLE STUDENT ADD CONSTRAINT student_pk PRIMARY KEY(stu_no);

-- SCORE ���̺�
-- 		�� �ʵ� : �й�, SUBJECT_ID, MID_SCORE, FINAL_SCORE, GRADE
--						���� 5����Ʈ ����3�ڸ� / ���� 3�ڸ� / ���� 1����Ʈ
-- 		�� �������� : �⺻Ű��(�й�,subject_id), �߰�/�⸻ ������ not null 
CREATE TABLE SCORE(
	stu_no char(6) NOT NULL ,		-- PK ������ �÷��� �ڵ����� NOT NULL, UNIQUE ����
	subject_id char (5) NOT NULL,
	mid_score NUMBER(3) NOT NULL,
	final_score NUMBER(3) NOT NULL,
	grade char(1),
	-- create table�� pk,fk �����Ҷ��� �Ʒ��� ���� ����
	CONSTRAINT score_pk PRIMARY KEY(stu_no, subject_id),
	-- �ܷ�Ű(���̺� ������ �������踦 ����)
	CONSTRAINT stuno_fk FOREIGN KEY (stu_no)	-- stu_no�� score ���̺� �÷�
		REFERENCES student(stu_no)				-- �����ϴ� ü�̺�(�÷�)
);

-- insert, update : FK �������� ���� �߻��� �� ���� -> ���� ����
INSERT INTO SCORE(STU_NO, SUBJECT_ID, MID_SCORE, FINAL_SCORE, GRADE) 
VALUES ('2021A1','KO211',85,88,'B');
INSERT INTO SCORE(STU_NO, SUBJECT_ID, MID_SCORE, FINAL_SCORE, GRADE) 
VALUES ('2021B2','EN211',94,91,'A');
INSERT INTO SCORE(STU_NO, SUBJECT_ID, MID_SCORE, FINAL_SCORE, GRADE) 
VALUES ('2021A1','PR211',78,83,'B');

-- 1) integrity constraint (JCPDEV.STUNO_FK) violated - parent key not found
-- INSERT INTO SCORE(STU_NO, SUBJECT_ID, MID_SCORE, FINAL_SCORE, GRADE) 
-- VALUES ('2021A4','KO211',85,88,'B');		FK ����

-- 2) integrity constraint (JCPDEV.STUNO_FK) violated - child record found
-- DELETE FROM STUDENT WHERE STU_NAME = '�ֻ糪';

DELETE FROM STUDENT WHERE STU_NO  = '2021B5';	-- �������� �ʴ� ���� ���� ����

-- ��� : ������ ������ ALTER TABLE �� �������� PK FK