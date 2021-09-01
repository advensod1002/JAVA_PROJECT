-- JAVA 연동하면서 필요한 SQL 테스트
-- 사용자가 등록될때 입력한 ID 중복값이 있는지 검사

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
