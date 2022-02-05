-- SUBQUERIES IN DML
SELECT * FROM emp;

-- First we'll create a copy of emp table
CREATE TABLE
    emp_dummy
AS
    SELECT * FROM emp;

SELECT * FROM emp_dummy;

-- Performing DML Operations
DELETE FROM emp_dummy;
-- We can rollback our changes if made mistakenly
ROLLBACK;
SELECT
    * FROM emp_dummy;

-- +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Insert, Delete, Update
-- Using subquery
-- +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
INSERT INTO emp_dummy (SELECT * FROM emp WHERE deptno = 30);
SELECT * FROM emp_dummy ORDER BY empno;

-- TRUNCATE IS USED TO DELETE THE TABLE DATA
-- IT KEEPS THE STRUCTURE BUT DELETES THE DATA IN IT
TRUNCATE TABLE emp_dummy;
SELECT * FROM emp_dummy;

--  EMP WHERE EMP IS WORKING IN NEW YORK LOCATION