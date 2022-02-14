--Oracle SEQUENCE

--The CREATE SEQUENCE statement allows you to create a new sequence object in your own schema.
--For example, this statement uses the CREATE SEQUENCE statement to create a new sequence object named item_seq:
CREATE SEQUENCE item_seq;

--Using a sequence
--To access the next available value for a sequence, you use the NEXTVAL pseudo-column:
SELECT item_seq.NEXTVAL
FROM orders;
--Once, you acquire the sequence number through the NEXTVAL pseudo-column, you can access it repeatedly using the CURRVAL pseudo-column:
SELECT item_seq.CURRVAL
FROM orders;
--The following statement uses the item_seq sequence repeatedly in an SQL statement:
SELECT item_seq.NEXTVAL
FROM   orders
CONNECT BY level <= 5;

--This example uses the item_seq sequence in the INSERT statements to populate values for the item_id column of the items table:
CREATE TABLE items(
    item_id NUMBER
);
INSERT INTO items(item_id) VALUES(item_seq.NEXTVAL);
INSERT INTO items(item_id) VALUES(item_seq.NEXTVAL);
COMMIT;
SELECT item_id FROM items;

--From Oracle 11g onward, you can use sequences in PL/SQL. Behind the scenes, Oracle still uses a query from the dual table, but it makes the code cleaner:
SET SERVEROUTPUT ON;
DECLARE
    v_seq NUMBER;
BEGIN
    v_seq  := item_seq.NEXTVAL;
    DBMS_OUTPUT.put_line('v_seq=' || v_seq);
END;

--Modifying a sequence
ALTER SEQUENCE item_seq MAXVALUE 1000;

--Removing a SEQUENCE
DROP SEQUENCE item_seq;


--Oracle sequence privilages
CREATE SEQUENCE sample_sequence;

GRANT CREATE ANY SEQUENCE, 
    ALTER ANY SEQUENCE, 
    DROP ANY SEQUENCE, 
    SELECT ANY SEQUENCE 
TO user_one;

GRANT SELECT ON user_one.sample_sequence 
TO user_two;