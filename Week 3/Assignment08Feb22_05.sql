--Oracle FETCH

--The following query uses the LIMIT clause to get the top 5 products with the highest inventory level:
SELECT
	product_name,
	quantity
FROM
	inventories
INNER JOIN products
		USING(product_id)
ORDER BY
	quantity DESC 
LIMIT 5;
--By using the row limiting clause, you can rewrite the query that uses the LIMIT clause above as follows:
SELECT
    product_name,
    quantity
FROM
    inventories
INNER JOIN products
        USING(product_id)
ORDER BY
    quantity DESC 
FETCH NEXT 5 ROWS ONLY;

--A) Top N rows example
--The following statement returns the top 10 products with the highest inventory level:
SELECT
    product_name,
    quantity
FROM
    inventories
INNER JOIN products
        USING(product_id)
ORDER BY
    quantity DESC 
FETCH NEXT 10 ROWS ONLY;

--B) WITH TIES example
--The following query uses the row limiting clause with the WITH TIES option:
SELECT
	product_name,
	quantity
FROM
	inventories
INNER JOIN products
		USING(product_id)
ORDER BY
	quantity DESC 
FETCH NEXT 10 ROWS WITH TIES;

--C) Limit by percentage of rows example
--The following query returns top 5% products with the highest inventory level:
SELECT
    product_name,
    quantity
FROM
    inventories
INNER JOIN products
        USING(product_id)
ORDER BY
    quantity DESC 
FETCH FIRST 5 PERCENT ROWS ONLY;

--D) OFFSET example
--The following query skips the first 10 products with the highest level of inventory and returns the next 10 ones:
SELECT
	product_name,
	quantity
FROM
	inventories
INNER JOIN products
		USING(product_id)
ORDER BY
	quantity DESC 
OFFSET 10 ROWS 
FETCH NEXT 10 ROWS ONLY;

