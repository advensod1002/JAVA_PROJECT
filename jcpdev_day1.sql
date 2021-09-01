CREATE TABLE tblTest(
	col1 varchar2(20),  -- 20바이트
	col2 number(6)    -- 6자리 정수
); 
-- 같은 테이블이름으로 2개를 생성못합니다.
--(왼쪽탐색기에서 f5 새로고침)

--만들어지 tbltest 테이블의 내용 좀 보자.
SELECT * FROM TBLTEST;
-- 컬럼

-- VARCHAR2 는 문자열 길이가 20까지
-- NUMBER 숫자 -> 6자리 까지 100000

