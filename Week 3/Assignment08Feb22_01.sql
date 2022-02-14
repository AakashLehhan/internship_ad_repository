--The members_new table has a primary key column, therefore,member_id Oracle created a new index for this column. To view all indexes of a table, you query from the all_indexes view:
SELECT 
    index_name, 
    index_type, 
    visibility, 
    status 
FROM 
    all_indexes
WHERE 
    table_name = 'MEMBERS_NEW';

--Creating an index on one column example
CREATE INDEX members_last_name_i 
ON members_new(last_name);

SELECT 
    index_name, 
    index_type, 
    visibility, 
    status 
FROM 
    all_indexes
WHERE 
    table_name = 'MEMBERS_NEW';
    
--The following statement finds members whose last name is Harse:
SELECT * FROM members
WHERE last_name = 'Harse';

--To check if a query uses the index for lookup or not
--First, add the EXPLAIN PLAN FOR clause immediately before the SQL statement:
EXPLAIN PLAN FOR
SELECT * FROM members
WHERE last_name = 'Harse';
--This explains the execution plan into the plan_table table.
--Then, use the DBMS_XPLAN.DISPLAY() procedure to show the content of the plan_table:
SELECT 
    PLAN_TABLE_OUTPUT 
FROM 
    TABLE(DBMS_XPLAN.DISPLAY());

--Removing an index
DROP INDEX members_last_name_i;


--Creating an index on multiple columns
CREATE INDEX members_name_i
ON members(last_name,first_name);
--The following query finds members whose last name starts with the letter A and first name starts with the letter M:
SELECT * 
FROM members
WHERE last_name LIKE 'A%' 
    AND first_name LIKE 'M%';
--This statement definitely uses the members_name_i index as shown in the execution plan below:
EXPLAIN PLAN FOR
SELECT * 
FROM members
WHERE last_name LIKE 'A%' 
    AND first_name LIKE 'M%';
    
SELECT 
    PLAN_TABLE_OUTPUT 
FROM 
    TABLE(DBMS_XPLAN.DISPLAY());