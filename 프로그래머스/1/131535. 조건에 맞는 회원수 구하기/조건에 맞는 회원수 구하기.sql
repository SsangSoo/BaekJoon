-- 코드를 입력하세요
-- GENDER 컬럼은 비어있거나 0 또는 1의 값을 가지며 0인 경우 남자를, 1인 경우는 여자를 나타냅니다.
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO 
WHERE JOINED LIKE '2021%' AND 
      AGE BETWEEN 20 AND 29 