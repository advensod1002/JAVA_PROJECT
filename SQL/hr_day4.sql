/*
SQL : select ����
1. JOBS ���̺�
2. LOCATIONS ���̺�
3. DEPARTMENTS ���̺�
4. JOB_HISTORY ���̺�
*/
SELECT * FROM jobs;
-- 1.1)min_salary �ʵ尪�� 10000�̻��� Job_title ��ȸ
SELECT JOB_TITLE FROM JOBS WHERE MIN_SALARY>=10000;
-- 1.2)job_id �ʵ尪�� CLERK �� ���Ե� ���ڵ� ��ȸ(��� �ʵ� ��ȸ)
SELECT * FROM JOBS WHERE JOB_ID LIKE '%CLERK%';
-- �߰� : count �Լ� -> ���ǿ� �´�(��ȸ) ���ڵ� ����
SELECT count(*) FROM JOBS;
SELECT count(*) FROM JOBS WHERE JOB_ID LIKE '%CLERK%';
-- 1.3) job_title �ʵ尪�� programmer �� ���ڵ� ��ȸ
SELECT * FROM JOBS WHERE JOB_TITLE ='Programmer';
SELECT * FROM jobs WHERE LOWER(JOB_TITLE)='programmer'; 

SELECT * FROM LOCATIONS;
-- 2.1) city �ʵ尪�� London �� postal_code ��ȸ
SELECT POSTAL_CODE FROM LOCATIONS WHERE CITY='London';
-- 2.2) country_id �ʵ尪�� CA�� ���ڵ� ��ȸ
SELECT * FROM LOCATIONS WHERE COUNTRY_ID='CA';

SELECT * FROM DEPARTMENTS ;
-- 3.1) LOCATION_ID ���� 1700 �� department_name ��ȸ
SELECT DEPARTMENT_NAME FROM DEPARTMENTS WHERE LOCATION_ID=1700;
-- �߰� : LOCATION_ID ���� 1700 �̰� manager_id �� null�� �ƴ� department_name ��ȸ
SELECT DEPARTMENT_NAME FROM DEPARTMENTS 
	WHERE LOCATION_ID=1700 AND MANAGER_ID IS NOT NULL;

-- 3.2) department_name �ʵ尪�� IT�� �����ϴ� location_id ��ȸ
SELECT LOCATION_ID FROM DEPARTMENTS 
	WHERE DEPARTMENT_NAME LIKE '%IT%';
-- �߰� : ��ȸ�� ��� �߿� �ߺ� ���� -> distinct
SELECT DISTINCT LOCATION_ID FROM DEPARTMENTS 
	WHERE DEPARTMENT_NAME LIKE '%IT%';

SELECT * FROM JOB_HISTORY ;
-- 4.1) start_date �� 2005�⵵ ������ ���ڵ� ��ȸ
-- ���� date Ÿ���� ���ڿ����� 'yyyy-mm-dd' �������� ��ȯ�Ͽ� �� -> to_char �Լ�
SELECT * FROM JOB_HISTORY WHERE TO_CHAR(START_DATE,'yyyy-mm-dd') >'2005-01-01' ;
-- ��¥ date Ÿ�� �����ʹ� ���ڿ� ����(��-��-��,��/��/��..),���� �� �����մϴ�.
SELECT * FROM JOB_HISTORY WHERE START_DATE>='20050101';
-- 4.2) department_id �ʵ尪��  80�� ���ڵ� ��ȸ
SELECT * FROM JOB_HISTORY WHERE DEPARTMENT_ID=80;

-- ������ ���� ��ȯ �Լ�
-- ��  to_char �Լ��� date , number Ÿ�Ե� ���ڿ��� ��ȯ�մϴ�.
-- ��  to_number �Լ��� char, varchar2 ���ڿ� Ÿ���� ��ġ����(number)�� ��ȯ

-- ����(���) �Լ� : �׷� �Լ�, ������ �Ǵ� ��� �࿡ ���� �Լ��� ����ǰ� ������� �� ��
--      ��  count(����) , sum(��ġ�� �հ�) , avg(��ġ�� ���), max ,min 

SELECT * FROM EMPLOYEES ;

SELECT count(*) FROM EMPLOYEES ;	-- ���� ���?
SELECT sum(SALARY) FROM EMPLOYEES ;   -- �������� �޿� �հ�
SELECT avg(SALARY) FROM EMPLOYEES ;   -- �������� ��� �հ�
SELECT max(SALARY) FROM EMPLOYEES ;   -- �������� �ְ� �޿� �ݾ�
SELECT min(SALARY) FROM EMPLOYEES ;   -- �������� �ּ� �޿� �ݾ�

SELECT avg(SALARY) FROM EMPLOYEES WHERE JOB_ID ='IT_PROG';  -- ���� ����

-- SELECT JOB_ID , avg(SALARY) FROM EMPLOYEES WHERE JOB_ID ='IT_PROG';  -- ����
--  �� �� �׷�ȭ �ʿ��մϴ�. 

-- �׷�ȭ : group by �÷��̸�
SELECT JOB_ID , count(*) AS "�ο���", avg(SALARY) AS "��ձ޿���"  
	FROM EMPLOYEES
	GROUP BY JOB_ID ;

-- java ���α׷��ֿ��� ����ϱ� ���ؼ� ��������
SELECT JOB_ID , count(*) CNT, avg(SALARY) SAL_AVG  
	FROM EMPLOYEES
	GROUP BY JOB_ID ;

-- job_id 'IT_PROG' �� ��ȸ�ϰ� �ʹٸ�...
-- where �׷�ȭ �� �÷��� ������ �ۼ� (����) �ϰ� -> group by
SELECT JOB_ID , count(*) CNT, avg(SALARY) SAL_AVG  
	FROM EMPLOYEES
	WHERE JOB_ID ='IT_PROG'
	GROUP BY JOB_ID ;

-- sal_avg 9000 �̻��� ���� ����ϰ� �ʹٸ�....
-- �׷�ȭ ����� ���� ��ȸ -> having
SELECT JOB_ID , count(*) CNT, avg(SALARY) SAL_AVG  
	FROM EMPLOYEES
	GROUP BY JOB_ID 
	HAVING avg(SALARY) > 9000;

-- ���� ����� sal_avg ������� �������� ����
SELECT JOB_ID , count(*) CNT, avg(SALARY) SAL_AVG  
	FROM EMPLOYEES
	GROUP BY JOB_ID 
	HAVING avg(SALARY) > 9000
	ORDER BY count(*) DESC ,JOB_ID  ;
--	ORDER BY avg(SALARY);

-- ��� : �׷�ȭ ���� from -> where -> group by -> having -> order by

-- Employees ���̺��� �׷�ȭ�� ������ �÷� : job_id, manager_id, department_id
--        -> �ٸ� �÷� 2���� group by �����ϼ���. 4�� select ���� ���弼��. 
--		  -> ������ ����(query-> select) ȭ�� ĸ���ؼ� �÷��ּ���> 


-- 2���� ���̺��κ��� �����͸� ��ȸ�ϴ� ���

select department_id, max(salary) from employees 
	where department_id=100 
	group by department_id;

SELECT * FROM EMPLOYEES ;

-- 1) ��������   : () �ȿ� �ۼ��մϴ�.�������� ����� 1�� �÷�����.

-- �μ�ID�� 100���� �ְ��޿����� �޴� ���//�� �̸�,�޿�,�μ�ID�� ��ȸ�Ͽ���.
--  �Ʒ��������� 12008 �����մϴ�.
SELECT last_name, salary, department_id FROM EMPLOYEES 
	WHERE SALARY = (SELECT max(salary) FROM EMPLOYEES WHERE DEPARTMENT_ID =100 
							GROUP BY DEPARTMENT_ID )
		AND DEPARTMENT_ID =100;
	
SELECT last_name , salary, department_id FROM EMPLOYEES 
	WHERE SALARY <= ALL ( SELECT SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID =100)
	ORDER BY SALARY ;

SELECT SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID = 100;
	
	SELECT last_name, salary, department_id FROM EMPLOYEES 
	WHERE SALARY >= (SELECT max(salary) FROM EMPLOYEES WHERE DEPARTMENT_ID =100 
							GROUP BY DEPARTMENT_ID )
	ORDER BY SALARY ;	

-- 	job_id �� st_clerk �� ��� �������� �޿�(�ִ밪) ���� ���� �����					
SELECT last_name , salary, department_id FROM EMPLOYEES 
	WHERE SALARY > ALL ( SELECT SALARY FROM EMPLOYEES WHERE JOB_ID ='ST_CLERK' );

SELECT last_name , salary, department_id FROM EMPLOYEES 
	WHERE SALARY >= ALL ( SELECT SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID =100)
	ORDER BY SALARY ;  

SELECT last_name , salary, department_id FROM EMPLOYEES 
	WHERE SALARY <= ALL ( SELECT SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID =100)
	ORDER BY SALARY ;  -- �μ�ID 100�� �ּұ޿��׺��� �۰ų� ���� ����� ��ȸ
	
SELECT LAST_NAME, SALARY, DEPARTMENT_ID FROM EMPLOYEES
WHERE SALARY <= ALL( SELECT MIN(SALARY) FROM EMPLOYEES WHERE DEPARTMENT_ID = 100 GROUP BY DEPARTMENT_ID) ORDER BY SALARY;


-- ����ID(�������̺�)�� 100�� ����� �μ� ����(�μ����̺��� ��� �ʵ�)�� ��ȸ
select * from departments 
	where department_id = 
		(select department_id from employees where employee_id=140);  -- �� 90���� ��ȸ
	
SELECT * FROM EMPLOYEES ;	

-- 2) join
--   -> ���� ���� �ð���....