-- updatable views

CREATE TABLE brands(
	brand_id NUMBER GENERATED BY DEFAULT AS IDENTITY,
	brand_name VARCHAR2(50) NOT NULL,
	PRIMARY KEY(brand_id)
);

CREATE TABLE cars (
	car_id NUMBER GENERATED BY DEFAULT AS IDENTITY,
	car_name VARCHAR2(255) NOT NULL,
	brand_id NUMBER NOT NULL,
	PRIMARY KEY(car_id),
	FOREIGN KEY(brand_id) 
	REFERENCES brands(brand_id) ON DELETE CASCADE
);

INSERT INTO brands(brand_name)
VALUES('Audi');


INSERT INTO brands(brand_name)
VALUES('BMW');


INSERT INTO brands(brand_name)
VALUES('Ford');


INSERT INTO brands(brand_name)
VALUES('Honda');


INSERT INTO brands(brand_name)
VALUES('Toyota');


INSERT INTO cars (car_name,brand_id)
VALUES('Audi R8 Coupe',
       1);


INSERT INTO cars (car_name,brand_id)
VALUES('Audi Q2',
       1);


INSERT INTO cars (car_name,brand_id)
VALUES('Audi S1',
       1);


INSERT INTO cars (car_name,brand_id)
VALUES('BMW 2-serie Cabrio',
       2);


INSERT INTO cars (car_name,brand_id)
VALUES('BMW i8',
       2);


INSERT INTO cars (car_name,brand_id)
VALUES('Ford Edge',
       3);


INSERT INTO cars (car_name,brand_id)
VALUES('Ford Mustang Fastback',
       3);


INSERT INTO cars (car_name,brand_id)
VALUES('Honda S2000',
       4);


INSERT INTO cars (car_name,brand_id)
VALUES('Honda Legend',
       4);


INSERT INTO cars (car_name,brand_id)
VALUES('Toyota GT86',
       5);


INSERT INTO cars (car_name,brand_id)
VALUES('Toyota C-HR',
       5);
       
-- creating a view
CREATE VIEW cars_master AS 
SELECT
    car_id,
    car_name
FROM
    cars;

-- deleting a row from cars with the help of cars view
DELETE
FROM
    cars_master
WHERE
    car_id = 1;

-- And you can update any column values exposed to the cars_master view:
UPDATE
    cars_master
SET
    car_name = 'Audi RS7 Sportback'
WHERE
    car_id = 2;

--We could do insert and update data from the cars table via cars_master view because Oracle can translate the INSERT and UPDATE statements to the corresponding statements and execute them against the cars table.
--However, insert a new row into the cars table via the cars_master view is not possible. Because the cars table has a not null column ( brand_id) without a default value.
--The below line will throw an error
INSERT INTO cars_master
VALUES('Audi S1 Sportback');



--############################################################################
--Updatable join view
--############################################################################

CREATE VIEW all_cars AS 
SELECT
    car_id,
    car_name,
    c.brand_id,
    brand_name
FROM
    cars c
INNER JOIN brands b ON
    b.brand_id = c.brand_id; 

--The following statement inserts a new row into the cars table via the call_cars view:
INSERT INTO all_cars(car_name, brand_id )
VALUES('Audi A5 Cabriolet', 1);

--The following statement deletes all Honda cars from the cars table via the all_cars view:
DELETE
FROM
    all_cars
WHERE
    brand_name = 'Honda';
    
--To find which column can be updated, inserted, or deleted, you use the user_updatable_columns view. The following example shows which column of the all_cars view is updatable, insertable, and deletable:

SELECT
    *
FROM
    USER_UPDATABLE_COLUMNS
WHERE
    TABLE_NAME = 'ALL_CARS';