--Oracle UNIQUE index on single column

CREATE UNIQUE INDEX members_email_i
ON members_new(email);

--By having this members_email_i index, you cannot have two rows with the same value in the email column.
--The following statement will fail because it attempts to insert a new row whose email already exists:
INSERT INTO members_new(first_name, last_name, gender, dob, email)
VALUES('Pegpa','Elce','F',DATE '1990-01-02','pelce0@trellian.com');

--Oracle UNIQUE index on multiple column
--The following example creates a new table named unq_idx_demo with two columns a and b:
CREATE TABLE unq_idx_demo(
    a INT,
    b INT
);   

--To create a unique index on the two columns a and b, you use the following statement:
CREATE UNIQUE INDEX unq_idx_demo_ab_i
ON unq_idx_demo(a,b);

--The following statement inserts a new row into the unq_idx_demo table:
INSERT INTO unq_idx_demo(a,b)
VALUES(1,1);

--Because we have a unique index on the a and b columns, the combination of values in both columns are used for evaluating duplicate.
--The following statement works because the pair (1,2) does not exist:
INSERT INTO unq_idx_demo(a,b)
VALUES(1,2);
--However, the following statement does not work because (1,1) already exists:
INSERT INTO unq_idx_demo(a,b)
VALUES(1,1);

--#############################################################################
--Oracle UNIQUE index, Primary Key constraint, and Unique constraint

--When you define a PRIMARY KEY or a UNIQUE constraint for a table, Oracle automatically creates a unique index on the primary key or unique key columns to enforce the uniqueness.
--The unique index associated with the constraint always has the name of the constraint, unless specify it explicitly otherwise.
--The following statement creates a table named t1 with a primary key:
CREATE TABLE t1 (
    pk1 INT PRIMARY KEY,
    c1 INT
);
--To show the indexes of the t1 table, you use the following statement:
SELECT 
    index_name, 
    index_type, 
    visibility, 
    status 
FROM 
    all_indexes
WHERE 
    table_name = 'T1';
    
--To specify the name for the primary key column, you use the UNIQUE index as shown in the following query:
CREATE TABLE t2 (
    pk2 INT PRIMARY KEY 
        USING INDEX (
            CREATE INDEX t1_pk1_i ON t2 (pk2)
    ),
    c2 INT
);
--In this example, we explicitly specified the name of the unique index.
SELECT 
    index_name, 
    index_type, 
    visibility, 
    status 
FROM 
    all_indexes
WHERE 
    table_name = 'T2';