--Oracle Function Based Index

--The following statement creates an index on the last_name column of the members table:
CREATE INDEX members_last_name_i 
ON members_new(last_name);
--If you use the last name column in the WHERE clause, the query optimizer will definitely use the index:
SELECT * FROM members_new
WHERE last_name = 'Sans';
--However, if you use a function on the indexed column last_name as follows:
SELECT * FROM members_new
WHERE UPPER(last_name) = 'SANS';
--the query optimizer could not leverage the index.
--The following statements show the execution plan of the query above:
EXPLAIN PLAN FOR
SELECT * FROM members_new
WHERE UPPER(last_name) = 'SANS';

SELECT 
    PLAN_TABLE_OUTPUT 
FROM 
    TABLE(DBMS_XPLAN.DISPLAY());


--The following statement creates a function-based index based on the UPPER function:
CREATE INDEX members_last_name_fi
ON members(UPPER(last_name));
--In this example, Oracle converted all values in the last_name column to uppercase and stored these results in the members_last_name_fi index.
--Now, if you find members by the last name, the query optimizer will consider the index as shown in the following query plan:
EXPLAIN PLAN FOR
SELECT * FROM members
WHERE UPPER(last_name) = 'SANS';

SELECT 
    PLAN_TABLE_OUTPUT 
FROM 
    TABLE(DBMS_XPLAN.DISPLAY());