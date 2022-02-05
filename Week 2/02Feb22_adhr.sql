-- +++++++++++ JOINS ++++++++++


-- At first we will drop the branchno column from employee table because we don't need it anymore
-- Because we can get the branch no from the deprtment table with the help of department table

ALTER TABLE emp DROP COLUMN branchno;
SELECT * FROM emp;

-- Ename, Dname, Branch name
SELECT
    e.ename, d.dname, b.branchname
FROM
    emp e, dept d, branch b;
    
-- Problem with above query is it is working as a cross join and giving every combination as output
-- So we will use joins to get the correct output
-- Ename, Dname, Branch name
SELECT
    e.ename, d.dname, b.branchname
FROM
    emp e, dept d, branch b
WHERE
    e.deptno = d.deptno and d.branchno = b.branchno;

SELECT
    e.ename, d.dname, b.branchname
FROM
    emp e 
    JOIN dept d ON e.deptno = d.deptno 
    JOIN branch b on b.branchno = d.branchno;
    
-- ################################################################
-- INNER JOIN
-- 18.0 Display employee details such that ename,deptname and location of work is printed by the query
-- ################################################################
SELECT
    emp.ename,dept.dname,branch.location
FROM 
    emp,dept,branch
where 
    emp.deptno=dept.deptno and dept.branchno=branch.branchno;

SELECT
    emp.ename,dept.dname,branch.location
FROM 
    emp JOIN dept 
    ON emp.deptno=dept.deptno
    JOIN branch
    ON dept.branchno=branch.branchno;

-- ################################################################
-- INNER JOIN
-- 18.1 Display employee details such that ename, job, mgr, hiredate, sal, dname
-- here innner join will neglect the null entries
-- ################################################################
SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e join dept d
    on e.deptno = d.deptno;


-- ################################################################
-- We will use left outer join because it will also consider all the entries of table on left side
-- Display employee details such that ename, job, mgr, hiredate, sal, dname
-- ################################################################
SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e left outer join dept d
    ON e.deptno = d.deptno;

SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e, dept d
WHERE
    e.deptno = d.deptno(+);
-- ################################################################
-- We will use right outer join because it will consider aall the entries of table on right side
-- Display employee details such that ename, job, mgr, hiredate, sal, dname
-- ################################################################
SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e right outer join dept d
    ON e.deptno = d.deptno;


SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e, dept d
WHERE
    e.deptno(+) = d.deptno;
-- ################################################################
-- We will use full outer join because it will consider aall the entries of table on both right and left side
-- Display employee details such that ename, job, mgr, hiredate, sal, dname
-- ################################################################
SELECT
    e.ename, e.job, e.mgr, e.hiredate, e.sal, d.dname
FROM
    emp e full outer join dept d
    ON e.deptno = d.deptno;


-- ################################################################ 
-- list ename,job,sal,branchname
-- emp
-- branch
-- ################################################################ 
SELECT
    e.ename, e.job, e.sal, b.branchname 
FROM
    emp e join dept d
    on e.deptno = d.deptno
    join branch b
    on b.branchno = d.branchno;

-- ################################################################ 
-- list empname, job,sal,branchname,dname
-- ################################################################ 
SELECT
    e.ename, e.job, e.sal, b.branchname, d.dname 
FROM
    emp e join dept d
    on e.deptno = d.deptno
    join branch b
    on b.branchno = d.branchno;

-- ################################################################ 
-- LIST ALL DNAME AND EMP COUNT FOR EACH DEPT 
-- ################################################################ 
SELECT
    DNAME,COUNT(EMPNO)
FROM
    DEPT JOIN EMP
ON
    DEPT.DEPTNO=EMP.DEPTNO
GROUP BY 
    DNAME;

-- ################################################################ 
-- LIST ALL DNAME AND EMP COUNT FOR EACH branch 
-- ################################################################ 
SELECT 
    BRANCHNAME,COUNT(EMPNO)
FROM
    BRANCH JOIN DEPT
    ON BRANCH.BRANCHNO=DEPT.BRANCHNO
    JOIN EMP
    ON DEPT.DEPTNO=EMP.DEPTNO
GROUP BY
    branchname;
    
-- ################################################################ 
--LIST BRANCHNAME,DNAME,SUM OF SAL FOR THOSE BRANCH AND DEPT WHERE THE SUM IS >5000
-- ################################################################ 
SELECT 
    B.BRANCHNAME, D.DNAME, SUM(E.SAL)
FROM
    BRANCH B JOIN DEPT D
    ON B.BRANCHNO = D.BRANCHNO
    JOIN EMP E 
    ON E.DEPTNO = D.DEPTNO
GROUP BY
    B.BRANCHNAME, D.DNAME
HAVING
    SUM(E.SAL) > 5000;

-- ################################################################ 
-- List empno,ename,mgr,manger name 
-- here we will use the concept of self joins 
-- ################################################################ 
SELECT
    e.empno, e.ename, e.mgr, m.ename
FROM
    emp e join emp m
    on e.mgr = m.empno;
    
    
    


-- ################################################################
-- Text Literal Example ''
-- The text literal '10' has datatype CHAR. 
-- Oracle implicitly converts it to the NUMBER datatype if it appears in a numeric 
-- expression as in the following statement:
-- ################################################################
-- Display employees salary +10
select empno ,ename,sal ,sal+'10' from emp ;
select empno ,ename,sal ,sal+10 from emp ;
select empno ,ename ,sal ,sal+'0' from emp ;
-- ################################################################    

-- DATE 
-- DAY OF MONTH  DD
-- MONTH OF YEAR MM/MON/MMM
-- YEAR          YY/YYY/YYYY       
-- HH:MIN:ss:FF
-- ################################################################    
-- In the following statement, Oracle implicitly converts '03-MAR-97' 
-- to a DATE value using the default date format 'DD-MON-YY':
-- Display details of employees join on 3rd Dec'1981
-- ################################################################
select empno,ename,hiredate from emp where hiredate='03-dec-81';

select empno,ename,hiredate from emp where hiredate=to_date('3-12-1981','dd-mm-yyyy');



CREATE TABLE date_tab (
   ts_col      TIMESTAMP,
   tsltz_col   TIMESTAMP WITH LOCAL TIME ZONE,
   tstz_col    TIMESTAMP WITH TIME ZONE);

INSERT INTO date_tab VALUES (  
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00');

select * from date_tab;

ALTER SESSION SET TIME_ZONE = '-8:00';
INSERT INTO date_tab VALUES (  
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00');

select * from date_tab;

-- Timezone is -8:00
ALTER SESSION SET TIME_ZONE = '-8:00';
INSERT INTO date_tab VALUES (  
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00');

INSERT INTO date_tab VALUES (
   TIMESTAMP'1999-12-02 10:00:00 -8:00', 
   TIMESTAMP'1999-12-02 10:00:00 -8:00',
   TIMESTAMP'1999-12-02 10:00:00 -8:00');
SELECT * FROM DATE_TAB;   
-- Timezone is +5:30
ALTER SESSION SET TIME_ZONE = '+5:30';
INSERT INTO date_tab VALUES (  
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00',
   TIMESTAMP'1999-12-01 10:00:00');

INSERT INTO date_tab VALUES (
   TIMESTAMP'1999-12-02 10:00:00 -8:00', 
   TIMESTAMP'1999-12-02 10:00:00 -8:00',
   TIMESTAMP'1999-12-02 10:00:00 -8:00');
SELECT * FROM DATE_TAB;
	
