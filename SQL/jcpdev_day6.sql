-- JAVA �����ϸ鼭 �ʿ��� SQL �׽�Ʈ
-- ����ڰ� ��ϵɶ� �Է��� ID �ߺ����� �ִ��� �˻�

SELECT  COUNT(*) FROM CUSTOM# WHERE CUSTOM_ID = 'nana';
SELECT  COUNT(*) FROM CUSTOM# WHERE CUSTOM_ID = 'nana2';

SELECT  * FROM CUSTOM# WHERE CUSTOM_ID = 'nana';
SELECT  * FROM CUSTOM# WHERE CUSTOM_ID = 'nana2';

SELECT * FROM PRODUCT#;

SELECT * FROM CUSTOM#;

SELECT  * FROM BUY#;

UPDATE CUSTOM# SET EMAIL = 'momo3@gmail.com', REG_DATE = SYSDATE WHERE CUSTOM_ID = 'momo';

ALTER TABLE BUY# ADD (DEL_DATE DATE);

SELECT sysdate + 3 FROM dual;

SELECT buy_seq.nextval FROM dual;
