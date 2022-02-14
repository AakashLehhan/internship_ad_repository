--Oracle drop SYNONYMS

CREATE SYNONYM all_orders FOR C##ADUSER.orders; 
DROP SYNONYM all_orders;

CREATE PUBLIC SYNONYM all_orders FOR C##ADUSER.orders; 
DROP PUBLIC SYNONYM all_orders FORCE;