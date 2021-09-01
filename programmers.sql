-- ���� ��ȣ�ҿ� ���� ��� ������ ������ ANIMAL_ID������ ��ȸ�ϴ� SQL���� �ۼ����ּ���
SELECT * FROM ANIMAL_INS;

-- ���� ��ȣ�ҿ� ���� ��� ������ �̸��� ��ȣ �������� ��ȸ�ϴ� SQL���� �ۼ����ּ���.
-- �̶� ����� ANIMAL_ID �������� �����ּ���.
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC;

-- ���� ��ȣ�ҿ� ���� ���� �� ���� ����1�� ���̵�� �̸��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. 
-- �̶� ����� ���̵� ������ ��ȸ���ּ���.
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick';

-- ���� ��ȣ�ҿ� ���� ���� �� ���� ����1�� ���̵�� �̸��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. 
-- �̶� ����� ���̵� ������ ��ȸ���ּ���.
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION != 'Aged' ORDER BY ANIMAL_ID;

-- ���� ��ȣ�ҿ� ���� ��� ������ ���̵�� �̸��� ANIMAL_ID������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID;

-- ���� ��ȣ�ҿ� ���� ��� ������ ���̵�� �̸�, ��ȣ �������� �̸� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- ��, �̸��� ���� ���� �߿����� ��ȣ�� ���߿� ������ ������ ���� ������� �մϴ�.
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY NAME, DATETIME DESC;


-- ���� ��ȣ�ҿ� ���� ���� ���� ������ �̸��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.
SELECT NAME From ANIMAL_INS ORDER BY DATETIME LIMIT 1;
SELECT NAME FROM (SELECT * FROM ANIMAL_INS ORDER BY DATETIME) WHERE rownum = 1;

------------------------------------------------------------------------------------------------------

-- ���� �ֱٿ� ���� ������ ���� ���Դ��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.
SELECT MAX(DATETIME) FROM ANIMAL_INS;

-- ���� ��ȣ�ҿ� ���� ���� ���� ������ ���� ���Դ��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.
SELECT MIN(DATETIME) FROM ANIMAL_INS;


-- ���� ��ȣ�ҿ� ������ �� ���� ���Դ��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.
SELECT COUNT(*) FROM ANIMAL_INS;

-- ���� ��ȣ�ҿ� ���� ������ �̸��� �� ������ ��ȸ�ϴ� SQL ���� �ۼ����ּ���. 
-- �̶� �̸��� NULL�� ���� �������� ������ �ߺ��Ǵ� �̸��� �ϳ��� Ĩ�ϴ�.
SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS WHERE NAME IS NOT NULL;

------------------------------------------------------------------------------------------------------

-- ���� ��ȣ�ҿ� ���� ���� �� ����̿� ���� ���� �� �������� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- �̶� ����̸� ������ ���� ��ȸ���ּ���.
SELECT ANIMAL_TYPE, COUNT(*) FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE;

-- ���� ��ȣ�ҿ� ���� ���� �̸� �� �� �� �̻� ���� �̸��� �ش� �̸��� ���� Ƚ���� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- �̶� ����� �̸��� ���� ������ ���迡�� �����ϸ�, ����� �̸� ������ ��ȸ���ּ���.
-- �ڵ带 �Է��ϼ���
SELECT NAME, COUNT(NAME) FROM ANIMAL_INS GROUP BY NAME HAVING COUNT(NAME) > 1 ORDER BY NAME;

-- ��ȣ�ҿ����� �� �ÿ� �Ծ��� ���� Ȱ���ϰ� �Ͼ���� �˾ƺ��� �մϴ�. 
-- 09:00���� 19:59����, �� �ð��뺰�� �Ծ��� �� ���̳� �߻��ߴ��� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- �̶� ����� �ð��� ������ �����ؾ� �մϴ�
SELECT HOUR, COUNT(*)
FROM (SELECT TO_CHAR(DATETIME, 'HH24') HOUR FROM ANIMAL_OUTS)
WHERE HOUR >= 9 and HOUR < 20
GROUP BY HOUR
ORDER BY HOUR;

-- ��ȣ�ҿ����� �� �ÿ� �Ծ��� ���� Ȱ���ϰ� �Ͼ���� �˾ƺ��� �մϴ�. 
-- 0�ú��� 23�ñ���, �� �ð��뺰�� �Ծ��� �� ���̳� �߻��ߴ��� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- �̶� ����� �ð��� ������ �����ؾ� �մϴ�. ***********
SELECT l.hour, nvl(count, 0) AS count
FROM (SELECT TO_CHAR(datetime, 'HH24') AS hour, count(*) AS count 
        FROM animal_outs 
        GROUP BY TO_CHAR(datetime, 'HH24') 
        ORDER BY hour) O, 
        (SELECT LEVEL-1 AS hour FROM dual CONNECT BY LEVEL<=24) L
WHERE L.hour = O.hour(+)
ORDER BY L.hour;

------------------------------------------------------------------------------------------------------

-- ���� ��ȣ�ҿ� ���� ���� ��, �̸��� ���� ä�� ���� ������ ID�� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. 
-- ��, ID�� �������� ���ĵǾ�� �մϴ�.
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NULL ORDER BY ANIMAL_ID;

-- ���� ��ȣ�ҿ� ���� ���� ��, �̸��� �ִ� ������ ID�� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. 
-- ��, ID�� �������� ���ĵǾ�� �մϴ�.
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NOT NULL ORDER BY ANIMAL_ID;

-- �Ծ� �Խ��ǿ� ���� ������ �Խ��Ϸ� �մϴ�. 
-- ������ ���� ��, �̸�, ���� �� �߼�ȭ ���θ� ���̵� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���.
-- �̶� ���α׷����� �𸣴� ������� NULL�̶�� ��ȣ�� �𸣱� ������, 
-- �̸��� ���� ������ �̸��� "No name"���� ǥ���� �ּ���.
SELECT ANIMAL_TYPE, NVL(NAME, 'No name'), SEX_UPON_INTAKE 
FROM ANIMAL_INS ORDER BY ANIMAL_ID;

-- õ���������� ���� �Ϻ� �����Ͱ� ���ǵǾ����ϴ�. �Ծ��� �� ����� �ִµ�, 
-- ��ȣ�ҿ� ���� ����� ���� ������ ID�� �̸��� ID ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���.
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_OUTS AO LEFT OUTER JOIN ANIMAL_INS AI
ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE AI.ANIMAL_ID IS NULL
ORDER BY AO.ANIMAL_ID;

------------------------------------------------------------------------------------------------------

-- �������� �Ǽ��� �Ϻ� ������ �Ծ����� �߸� �ԷµǾ����ϴ�.
-- ��ȣ �����Ϻ��� �Ծ����� �� ���� ������ ���̵�� �̸��� ��ȸ�ϴ� SQL���� �ۼ����ּ���.
-- �̶� ����� ��ȣ �������� ���� ������ ��ȸ�ؾ��մϴ�.
SELECT AO.ANIMAL_ID,AO.NAME
FROM ANIMAL_OUTS AO LEFT OUTER JOIN ANIMAL_INS AI
ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE AO.DATETIME < AI.DATETIME
ORDER BY AI.DATETIME;

-- ���� �Ծ��� �� �� ���� ��, ���� ���� ��ȣ�ҿ� �־��� ���� 3������ 
-- �̸��� ��ȣ �������� ��ȸ�ϴ� SQL���� �ۼ����ּ���. 
-- �̶� ����� ��ȣ ������ ������ ��ȸ�ؾ� �մϴ�. ***********
SELECT *
FROM (SELECT AI.NAME, AI.DATETIME
      FROM ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO 
      ON AI.ANIMAL_ID =AO.ANIMAL_ID
      WHERE AO.ANIMAL_ID IS NULL
      ORDER BY AI.DATETIME
     )
WHERE ROWNUM < 4;

-- ��ȣ�ҿ��� �߼�ȭ ������ ��ģ ���� ������ �˾ƺ��� �մϴ�.
-- ��ȣ�ҿ� ���� ��ÿ��� �߼�ȭ1���� �ʾ�����,
-- ��ȣ�Ҹ� ���� ��ÿ��� �߼�ȭ�� ������ ���̵�� ���� ��,
-- �̸��� ��ȸ�ϴ� ���̵� ������ ��ȸ�ϴ� SQL ���� �ۼ����ּ���. ***********
SELECT AO.ANIMAL_ID, AO.ANIMAL_TYPE, AO.NAME
FROM ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO
ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE (AI.SEX_UPON_INTAKE='Intact Male' AND AO.SEX_UPON_OUTCOME='Neutered Male')
OR (AI.SEX_UPON_INTAKE='Intact Female' AND AO.SEX_UPON_OUTCOME='Spayed Female')
ORDER BY AO.ANIMAL_ID;

-- ���� ��ȣ�ҿ� ���� ���� �� �̸��� Lucy, Ella,
-- Pickle, Rogan, Sabrina, Mitty�� ������ ���̵�� �̸�,
-- ���� �� �߼�ȭ ���θ� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN('Lucy','Ella','Pickle','Rogan','Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;

------------------------------------------------------------------------------------------------------

-- ��ȣ�ҿ� ���ư��� �ҸӴϰ� �⸣�� ���� ã�� ����� ã�ƿԽ��ϴ�.
-- �� ����� ���ϱ� �ҸӴϰ� �⸣�� ���� �̸��� 'el'�� ���ٰ� �մϴ�.
-- ���� ��ȣ�ҿ� ���� ���� �̸� ��, �̸��� "EL"�� ���� ���� ���̵��
-- �̸��� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ����� �̸� ������ ��ȸ���ּ���.
-- ��, �̸��� ��ҹ��ڴ� �������� �ʽ��ϴ�.
-- �ڵ带 �Է��ϼ���
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE LOWER(NAME) LIKE '%el%' AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;

-- ��ȣ���� ������ �߼�ȭ�Ǿ����� �ƴ��� �ľ��Ϸ� �մϴ�.
-- �߼�ȭ�� ������ SEX_UPON_INTAKE �÷��� 'Neutered' �Ǵ� 'Spayed'��� �ܾ ����ֽ��ϴ�.
-- ������ ���̵�� �̸�, �߼�ȭ ���θ� ���̵� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���.
-- �̶� �߼�ȭ�� �Ǿ��ִٸ� 'O', �ƴ϶�� 'X'��� ǥ�����ּ���.
SELECT ANIMAL_ID, NAME, DECODE((INSTR(SEX_UPON_INTAKE, 'Neutered',1,1)
+ INSTR(SEX_UPON_INTAKE, 'Spayed',1,1)), 0, 'X', 'O') AS "�߼�ȭ"
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID

-- https://programmers.co.kr/learn/challenges
