-- ################################################################
-- 12.1 Display all emp working in deptno 10
-- ################################################################
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno = 10;
-- ################################################################
-- 12.3 Display all emp working in deptno 10 and 20
    -- using OR and IN
-- ################################################################
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno = 10 OR deptno = 20;
    
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno in (10, 20);
    
-- ################################################################
-- 12.4 Display all emp working not in deptno 10 and 20
    -- using AND and NOT IN
-- ################################################################
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno != 10 AND deptno <> 20;
    
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno NOT IN (10, 20);

-- ################################################################
-- 12.4 Display all emp working not in deptno 10, 20, and 30
    -- using IS NULL 
-- ################################################################    
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno IS NULL;

-- ################################################################
-- 12.4 Display all emp where dept no is not null
    -- using IS NOT NULL 
-- ################################################################    
SELECT
   empno, ename, job, mgr, hiredate, sal, comm, deptno, branchno
FROM
    emp
WHERE
    deptno IS NOT NULL;

-- ################################################################
-- 12.4 Display empno, name, comm of employees working in dept 30
-- ################################################################    
SELECT
   empno, ename, comm
FROM
    emp
WHERE
    deptno = 30 AND comm IS NOT NULL AND comm > 0
ORDER BY
    comm;

-- ################################################################
-- 12.4 Display empno, name, comm of employees not earning any commission
-- ################################################################    
SELECT
   empno, ename, comm
FROM
    emp
WHERE
    comm IS NULL OR comm = 0
ORDER BY
    comm;

-- ################################################################
-- 12.4 Display all employees earning salary in range 1000 to 3000 including boundary values
-- ################################################################    
SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal >= 1000 AND sal <= 3000
ORDER BY
    sal;

SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal BETWEEN 1000 AND 3000
ORDER BY
    sal;

-- ################################################################
-- 12.4 Display all employees not earning salary in range 1000 to 3000 including boundary values
-- ################################################################    
SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal < 1000 OR sal > 3000
ORDER BY
    sal;

SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal NOT BETWEEN 1000 AND 3000
ORDER BY
    sal;
    
-- ################################################################
-- 12.4 Display all employees earning salary 5000 including boundary values
-- ################################################################
SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal = 5000
ORDER BY
    sal;

-- ################################################################
-- 12.4 Display all employees not earning salary 5000 including boundary values
-- ################################################################
SELECT
   empno, ename, sal
FROM
    emp
WHERE
    sal != 5000
ORDER BY
    sal;


-- ################################################################
-- 13 Where clause with like
--    Where with escape clause

--    Display all details of smith or employee whose name starts with s
-- ################################################################
SELECT
   *
FROM
    emp
WHERE
    ename = 'SMITH';
    
SELECT
   *
FROM
    emp
WHERE
    ename like 'S%';

-- ################################################################
-- 13 Where clause with like
--    Where with escape clause

--    Display all details employees whose name ends with s
-- ################################################################
SELECT
   *
FROM
    emp
WHERE
    ename like '%S';

-- ################################################################
-- 13 Where clause with like
--    Where with escape clause

--    Display all details employees whose name contains ll
-- ################################################################
SELECT
   *
FROM
    emp
WHERE
    ename like '%LL%';

-- ################################################################
-- 13 Where clause with like
--    Where with escape clause

--    Display all details employees whose name contains _
--    Since _ is a special character so we have to use ESCAPE character and use ESCAPE keyword to declare the escape character
-- ################################################################
SELECT
   *
FROM
    emp
WHERE
    ename like '%\_%' ESCAPE '\';


-- ################################################################
-- 14 Aggregate functions MIN, MAX, COUNT, SUM, AVG
-- ################################################################
SELECT 
    COUNT(*), COUNT(EMPNO), COUNT(DEPTNO)
FROM
    emp;

-- ################################################################
-- 14 COUNT excludes null value
-- ################################################################
SELECT 
    COUNT(DEPTNO)
FROM
    emp;

-- ################################################################
-- 14 MIN(), MAX(), AVG()
-- ################################################################
SELECT 
    MIN(SAL), MAX(SAL), AVG(SAL), COUNT(SAL), SUM(SAL)
FROM
    emp;

-- ################################################################
-- 15 Aggregate functions and grouping
--    Display department wise count of employees
-- ################################################################
SELECT 
    deptno, count(empno)
FROM
    emp
GROUP BY
    deptno
ORDER BY
    deptno;

-- ################################################################
-- 15 Aggregate functions and grouping
--    Display job wise count of employees and order by count of empno
-- ################################################################
SELECT 
    job, count(empno)
FROM
    emp
GROUP BY
    job
ORDER BY
    count(empno);

-- ################################################################
-- 15 Aggregate functions and grouping
--    Display department wise min and max and avg of employees and order by count of empno
-- ################################################################
SELECT 
    deptno, min(sal), max(sal), round(avg(sal)) 
FROM
    emp
GROUP BY
    deptno
ORDER BY
    deptno;

-- ################################################################
-- 15 Aggregate functions and grouping with having
--    Display department wise min and max and avg of employees where avg(sal)>2500
-- ################################################################
SELECT 
    deptno, min(sal), max(sal), round(avg(sal)) 
FROM
    emp
GROUP BY
    deptno
HAVING 
    avg(sal) > 2500
ORDER BY
    deptno;

-- ################################################################
-- 16. Special functions nvl() 
-- If comm is null display 0
-- Display empno,ename,sal,comm and total sal=sal+comm for all employees 
-- ################################################################    
SELECT
    empno, ename, sal, comm, sal + comm, sal + nvl(comm, 0) 
FROM
    emp
ORDER BY
    comm;

SELECT
    empno, ename, sal, comm,
    case
        when comm is null or comm = 0
            then sal
        when comm > 0
            then sal + comm
    end as with_comm
FROM
    emp
ORDER BY
    comm;

SELECT
    empno, ename, sal, comm,
    case
        when comm is null or comm = 0
            then 100
        when comm > 0
            then comm
    end as updated_comm,
    sal + case 
        when comm is null or comm = 0
            then 100
        when comm > 0
            then comm
    end as updated_sal
FROM
    emp
ORDER BY
    comm;


-- ################################################################
-- 17. Distinct values  
-- ################################################################    
SELECT 
    distinct deptno
from
    emp;

-- ################################################################
-- 18. Sub queries
-- display the employees details such as empno,ename and sal, who are earning more than avg salary
-- ################################################################
SELECT 
    empno, ename, sal
FROM 
    emp
WHERE
    sal > (
    SELECT 
        AVG(sal)
    FROM
        emp
    );


-- ################################################################
-- 18. Sub queries
-- display the employees details such as empno,ename and deptno, who are working in 'ACCOUNTING'
-- ################################################################

SELECT 
    empno, ename, deptno
FROM 
    emp
WHERE
    deptno = (
    SELECT 
        deptno
    FROM
        dept
    WHERE 
        dname = 'ACCOUNTING'
    );
    
-- ################################################################
-- 18. Sub queries
-- display the employees details such as empno,ename and deptno from department having employee earning max salary
-- ################################################################

SELECT 
    empno, ename, deptno
FROM 
    emp
WHERE
    sal = (
    SELECT 
        max(sal)
    FROM
        emp 
    );