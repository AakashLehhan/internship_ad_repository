--########################################################################
-- Display the employee details (empno,ename,dname,job,sal,location).
-- emp (empno,ename,job,sal)
-- dept(dname)
-- branch(location)
--########################################################################
SELECT
    e.empno,e.ename,e.job,e.sal,d.dname,b.location
FROM
    emp e join dept d
    on
    e.deptno=d.deptno
    join branch b
    on 
    b.branchno=d.branchno
Order by 
    d.deptno;

--########################################################################
-- View
--########################################################################
CREATE VIEW vw_empdetails
AS
SELECT
e.empno,e.ename,e.job,e.sal,d.dname,b.location
FROM
emp e join dept d
on
e.deptno=d.deptno
join branch b
on b.branchno=d.branchno
Order by d.deptno;

SELECT * FROM vw_empdetails;

-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Display employee name and manager name for all the departments
SELECT e.ename employee, m.ename manager, e.deptno deptno
FROM emp e JOIN emp m ON e.mgr = m.empno;

-- view for the same
CREATE VIEW 
    vw_mgrdetails AS
SELECT 
    e.ename employee, m.ename manager, e.deptno deptno
FROM 
    emp e JOIN emp m 
    ON 
    e.mgr = m.empno;
    
-- OR
CREATE VIEW 
    vw_mgrdetails(ename, mgrname, deptno) AS
SELECT 
    e.ename, m.ename, e.deptno
FROM 
    emp e JOIN emp m 
    ON 
    e.mgr = m.empno;
    
SELECT * FROM vw_mgrdetails;
SELECT * FROM vw_mgrdetails WHERE deptno = 30;

-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Display employee details and order by deptno and empno
SELECT
DEPTNO,EMPNO,ENAME,JOB,SAL,COMM
FROM
EMP
ORDER BY DEPTNO,EMPNO;

CREATE VIEW vw_dept_wise_emp_details
(DEPTNO,EMPNO,ENAME,JOB,SAL,COMM)
AS
SELECT 
    DEPTNO,EMPNO,ENAME,JOB,SAL,COMM
    FROM
        EMP
    ORDER BY DEPTNO,EMPNO;

SELECT * FROM VW_DEPT_WISE_EMP_DETAILS;
SELECT * FROM VW_DEPT_WISE_EMP_DETAILS WHERE DEPTNO=30;
SELECT * FROM VW_DEPT_WISE_EMP_DETAILS WHERE DEPTNO=10;
UPDATE vw_dept_wise_emp_details
    SET COMM=0
    WHERE DEPTNO=10;

SELECT * FROM VW_DEPT_WISE_EMP_DETAILS WHERE DEPTNO=10;

INSERT INTO VW_DEPT_WISE_EMP_DETAILS VALUES(10,2345,'JASMIN','CLERK',1300,0);

-- Create view for displaying employee details as follows
-- deptno,empno,ename,sal,comm(if null -o),totalsalary(sal+comm[comm=null=>0])
CREATE VIEW 
    vw_sample_emp_view AS
SELECT 
    deptno, empno, ename, sal, nvl(comm, 0) comm, sal + nvl(comm, 0) totalsalary 
FROM
    emp;

SELECT * FROM vw_sample_emp_view;

-- get employees in first 5 rows
-- 1 getting empdetails(deptno,empno,ename,job,sal) sorted on deptno,sal
SELECT
deptno,empno,ename,job,sal
FROM
emp
ORDER BY deptno,sal;
-- 2. create an inline view to show first 5 records
-- getting top 5 records based on sal in desceding order
SELECT
*
FROM
( SELECT
deptno,empno,ename,job,sal
FROM
emp
ORDER BY sal desc
)
WHERE
ROWNUM <= 5;

-- branch(branchname), dept(dname)
-- Using Lateral keyword on inline view
SELECT
DNAME,
BRANCHNAME
From
dept d,
Lateral( select * from branch b where b.branchno=d.branchno)
order by
dname;