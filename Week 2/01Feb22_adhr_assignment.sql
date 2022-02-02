-- Q1: Display all the information of the EMP table?
SELECT * FROM emp;

-- Q2: Display unique Jobs from EMP table?
SELECT
    DISTINCT job
FROM
    emp;

-- Q3: List the emps in the asc order of their Salaries?
SELECT 
    *
FROM
    emp
ORDER BY
    sal;

-- Q4: List the details of the emps in asc order of the Dptnos and desc of Jobs? ##Ambiguous##
SELECT 
    * 
FROM
    emp
ORDER BY
    deptno, job desc;

-- Q5: Display all the unique job groups in the descending order? ##Ambiguous##
SELECT
    DISTINCT job
FROM
    emp
ORDER BY
    job desc;

-- Q6: Display all the details of all ‘Mgrs’
SELECT 
    *
FROM 
    emp
WHERE
    job = 'MANAGER';

--Q7: List the emps who joined before 1981
SELECT 
    * 
FROM 
    emp 
WHERE
    hiredate < ('01-01-1981');

--Q8: List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal
SELECT
    empno, ename, sal, round(sal/30) as daily_sal
FROM
    emp 
ORDER BY
    sal;

-- Q9: Display the Empno, Ename, job, Hiredate, Exp of all Mgrs
SELECT
    empno, ename, job, hiredate, round(MONTHS_BETWEEN(SYSDATE, hiredate)/12) as exp
FROM
    emp
WHERE
    job = 'MANAGER';

-- Q10: List the Empno, Ename, Sal, Exp of all emps working for Mgr 7369
SELECT
    empno, ename, sal, round(MONTHS_BETWEEN(SYSDATE, hiredate)/12) as exp
FROM
    emp
WHERE
    mgr = 7369;

-- Q11: Display all the details of the emps whose Comm  Is more than their Sal
SELECT
    *
FROM
    emp
WHERE
    comm > sal;

-- Q13: List the emps along with their Exp and Daily Sal is more than Rs 100
SELECT
    empno, ename, round(MONTHS_BETWEEN(SYSDATE, hiredate)/12) as exp, round(sal/30) as daily_sal
FROM
    emp
WHERE
    round(sal/30) > 100;

-- Q14: List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order
SELECT
    * 
FROM
    emp
WHERE
    job = 'CLERK' or job = 'ANALYST'
ORDER BY
    job desc;

-- Q15: List the emps who joined on 1-MAY-81,3-DEC-81,17-DEC-81,19-JAN-80 in asc order of seniority
SELECT
    *
FROM
    emp
WHERE
    hiredate IN ('1-MAY-81', '3-DEC-81', '17-DEC-81', '19-JAN-80')
ORDER BY
    hiredate;

-- Q16: List the emp who are working for the Deptno 10 or 20
SELECT
    *
FROM
    emp
WHERE
    deptno IN (10, 20);

-- Q17: List the emps who are joined in the year 81
SELECT
    *
FROM
    emp
WHERE
    hiredate LIKE '______81';

-- Q19: List the emps Who Annual sal ranging from 22000 and 45000
SELECT
    *
FROM 
    emp
WHERE
    sal * 12 BETWEEN 22000 and 45000;

-- Q20: List the Enames those are having five characters in their Names
SELECT
    ename
FROM 
    emp
WHERE
    ename LIKE '_____';

-- Q21: List the Enames those are starting with ‘S’ and with five characters
SELECT
    ename
FROM 
    emp
WHERE
    ename LIKE 'S____';

-- Q22: List the emps those are having four chars and third character must be ‘r’
SELECT
    ename
FROM 
    emp
WHERE
    ename LIKE '__R_';

-- Q23: List the Five character names starting with ‘S’ and ending with ‘H’
SELECT
    ename
FROM 
    emp
WHERE
    ename LIKE 'S___H';

-- Q24: List the emps who joined in January
SELECT
    *
FROM 
    emp
WHERE
    hiredate LIKE '___01___';

-- Q27: List the emps whose names having a character set ‘ll’ together
SELECT
    *
FROM 
    emp
WHERE
    ename LIKE '%LL%';

-- Q29: List the emps who does not belong to Deptno 20
SELECT
    *
FROM
    emp
WHERE 
    deptno != 20;

-- Q30: List all the emps except ‘PRESIDENT’ & ‘MGR” in asc order of Salaries
SELECT
    *
FROM
    emp
WHERE
    job NOT IN ('PRESIDENT', 'MANAGER')
ORDER BY
    sal;

-- Q31:  List the emps whose Empno not starting with digit78
SELECT
    *
FROM
    emp
WHERE
    empno NOT LIKE '78%';

-- Q33: List the emps who are working under ‘MGR’
SELECT
    *
FROM
    emp
WHERE
    mgr IN (
        SELECT
            empno
        FROM
            emp
        WHERE
            job = 'MANAGER'
    );

-- Q34: List the emps who joined in any year but not belongs to the month of March
SELECT
    *
FROM 
    emp
WHERE
    hiredate NOT LIKE '___03___';
    
-- Q35:  List all the Clerks of Deptno 20
SELECT
    *
FROM
    emp
WHERE
    job = 'CLERK' and deptno = 20;

-- Q36:  List the emps of Deptno 30 or 10 joined in the year 1981
SELECT
    *
FROM
    emp
WHERE
    hiredate LIKE '______81' and deptno IN (30, 10);

-- Q37:  Display the details of SMITH
SELECT
    *
FROM
    emp
WHERE
    ename = 'SMITH';


-- Q38:  Display the location of SMITH
SELECT
    location
FROM
    branch
WHERE
    branchno = (
        SELECT
            branchno
        FROM
            emp
        WHERE
            ename = 'SMITH'
    );