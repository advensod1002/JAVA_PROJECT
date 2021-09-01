-- 동물 보호소에 들어온 모든 동물의 정보를 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요
SELECT * FROM ANIMAL_INS;

-- 동물 보호소에 들어온 모든 동물의 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요.
-- 이때 결과는 ANIMAL_ID 역순으로 보여주세요.
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC;

-- 동물 보호소에 들어온 동물 중 아픈 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 
-- 이때 결과는 아이디 순으로 조회해주세요.
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick';

-- 동물 보호소에 들어온 동물 중 젊은 동물1의 아이디와 이름을 조회하는 SQL 문을 작성해주세요. 
-- 이때 결과는 아이디 순으로 조회해주세요.
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION != 'Aged' ORDER BY ANIMAL_ID;

-- 동물 보호소에 들어온 모든 동물의 아이디와 이름을 ANIMAL_ID순으로 조회하는 SQL문을 작성해주세요. 
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID;

-- 동물 보호소에 들어온 모든 동물의 아이디와 이름, 보호 시작일을 이름 순으로 조회하는 SQL문을 작성해주세요. 
-- 단, 이름이 같은 동물 중에서는 보호를 나중에 시작한 동물을 먼저 보여줘야 합니다.
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY NAME, DATETIME DESC;


-- 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.
SELECT NAME From ANIMAL_INS ORDER BY DATETIME LIMIT 1;
SELECT NAME FROM (SELECT * FROM ANIMAL_INS ORDER BY DATETIME) WHERE rownum = 1;

------------------------------------------------------------------------------------------------------

-- 가장 최근에 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT MAX(DATETIME) FROM ANIMAL_INS;

-- 동물 보호소에 가장 먼저 들어온 동물은 언제 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT MIN(DATETIME) FROM ANIMAL_INS;


-- 동물 보호소에 동물이 몇 마리 들어왔는지 조회하는 SQL 문을 작성해주세요.
SELECT COUNT(*) FROM ANIMAL_INS;

-- 동물 보호소에 들어온 동물의 이름은 몇 개인지 조회하는 SQL 문을 작성해주세요. 
-- 이때 이름이 NULL인 경우는 집계하지 않으며 중복되는 이름은 하나로 칩니다.
SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS WHERE NAME IS NOT NULL;

------------------------------------------------------------------------------------------------------

-- 동물 보호소에 들어온 동물 중 고양이와 개가 각각 몇 마리인지 조회하는 SQL문을 작성해주세요. 
-- 이때 고양이를 개보다 먼저 조회해주세요.
SELECT ANIMAL_TYPE, COUNT(*) FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE;

-- 동물 보호소에 들어온 동물 이름 중 두 번 이상 쓰인 이름과 해당 이름이 쓰인 횟수를 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 이름이 없는 동물은 집계에서 제외하며, 결과는 이름 순으로 조회해주세요.
-- 코드를 입력하세요
SELECT NAME, COUNT(NAME) FROM ANIMAL_INS GROUP BY NAME HAVING COUNT(NAME) > 1 ORDER BY NAME;

-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 
-- 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 시간대 순으로 정렬해야 합니다
SELECT HOUR, COUNT(*)
FROM (SELECT TO_CHAR(DATETIME, 'HH24') HOUR FROM ANIMAL_OUTS)
WHERE HOUR >= 9 and HOUR < 20
GROUP BY HOUR
ORDER BY HOUR;

-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 
-- 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 시간대 순으로 정렬해야 합니다. ***********
SELECT l.hour, nvl(count, 0) AS count
FROM (SELECT TO_CHAR(datetime, 'HH24') AS hour, count(*) AS count 
        FROM animal_outs 
        GROUP BY TO_CHAR(datetime, 'HH24') 
        ORDER BY hour) O, 
        (SELECT LEVEL-1 AS hour FROM dual CONNECT BY LEVEL<=24) L
WHERE L.hour = O.hour(+)
ORDER BY L.hour;

------------------------------------------------------------------------------------------------------

-- 동물 보호소에 들어온 동물 중, 이름이 없는 채로 들어온 동물의 ID를 조회하는 SQL 문을 작성해주세요. 
-- 단, ID는 오름차순 정렬되어야 합니다.
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NULL ORDER BY ANIMAL_ID;

-- 동물 보호소에 들어온 동물 중, 이름이 있는 동물의 ID를 조회하는 SQL 문을 작성해주세요. 
-- 단, ID는 오름차순 정렬되어야 합니다.
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NOT NULL ORDER BY ANIMAL_ID;

-- 입양 게시판에 동물 정보를 게시하려 합니다. 
-- 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성해주세요.
-- 이때 프로그래밍을 모르는 사람들은 NULL이라는 기호를 모르기 때문에, 
-- 이름이 없는 동물의 이름은 "No name"으로 표시해 주세요.
SELECT ANIMAL_TYPE, NVL(NAME, 'No name'), SEX_UPON_INTAKE 
FROM ANIMAL_INS ORDER BY ANIMAL_ID;

-- 천재지변으로 인해 일부 데이터가 유실되었습니다. 입양을 간 기록은 있는데, 
-- 보호소에 들어온 기록이 없는 동물의 ID와 이름을 ID 순으로 조회하는 SQL문을 작성해주세요.
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_OUTS AO LEFT OUTER JOIN ANIMAL_INS AI
ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE AI.ANIMAL_ID IS NULL
ORDER BY AO.ANIMAL_ID;

------------------------------------------------------------------------------------------------------

-- 관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다.
-- 보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요.
-- 이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
SELECT AO.ANIMAL_ID,AO.NAME
FROM ANIMAL_OUTS AO LEFT OUTER JOIN ANIMAL_INS AI
ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE AO.DATETIME < AI.DATETIME
ORDER BY AI.DATETIME;

-- 아직 입양을 못 간 동물 중, 가장 오래 보호소에 있었던 동물 3마리의 
-- 이름과 보호 시작일을 조회하는 SQL문을 작성해주세요. 
-- 이때 결과는 보호 시작일 순으로 조회해야 합니다. ***********
SELECT *
FROM (SELECT AI.NAME, AI.DATETIME
      FROM ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO 
      ON AI.ANIMAL_ID =AO.ANIMAL_ID
      WHERE AO.ANIMAL_ID IS NULL
      ORDER BY AI.DATETIME
     )
WHERE ROWNUM < 4;

-- 보호소에서 중성화 수술을 거친 동물 정보를 알아보려 합니다.
-- 보호소에 들어올 당시에는 중성화1되지 않았지만,
-- 보호소를 나갈 당시에는 중성화된 동물의 아이디와 생물 종,
-- 이름을 조회하는 아이디 순으로 조회하는 SQL 문을 작성해주세요. ***********
SELECT AO.ANIMAL_ID, AO.ANIMAL_TYPE, AO.NAME
FROM ANIMAL_INS AI LEFT JOIN ANIMAL_OUTS AO
ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE (AI.SEX_UPON_INTAKE='Intact Male' AND AO.SEX_UPON_OUTCOME='Neutered Male')
OR (AI.SEX_UPON_INTAKE='Intact Female' AND AO.SEX_UPON_OUTCOME='Spayed Female')
ORDER BY AO.ANIMAL_ID;

-- 동물 보호소에 들어온 동물 중 이름이 Lucy, Ella,
-- Pickle, Rogan, Sabrina, Mitty인 동물의 아이디와 이름,
-- 성별 및 중성화 여부를 조회하는 SQL 문을 작성해주세요.
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN('Lucy','Ella','Pickle','Rogan','Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;

------------------------------------------------------------------------------------------------------

-- 보호소에 돌아가신 할머니가 기르던 개를 찾는 사람이 찾아왔습니다.
-- 이 사람이 말하길 할머니가 기르던 개는 이름에 'el'이 들어간다고 합니다.
-- 동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와
-- 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 이름 순으로 조회해주세요.
-- 단, 이름의 대소문자는 구분하지 않습니다.
-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE LOWER(NAME) LIKE '%el%' AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;

-- 보호소의 동물이 중성화되었는지 아닌지 파악하려 합니다.
-- 중성화된 동물은 SEX_UPON_INTAKE 컬럼에 'Neutered' 또는 'Spayed'라는 단어가 들어있습니다.
-- 동물의 아이디와 이름, 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성해주세요.
-- 이때 중성화가 되어있다면 'O', 아니라면 'X'라고 표시해주세요.
SELECT ANIMAL_ID, NAME, DECODE((INSTR(SEX_UPON_INTAKE, 'Neutered',1,1)
+ INSTR(SEX_UPON_INTAKE, 'Spayed',1,1)), 0, 'X', 'O') AS "중성화"
FROM ANIMAL_INS 
ORDER BY ANIMAL_ID

-- https://programmers.co.kr/learn/challenges
