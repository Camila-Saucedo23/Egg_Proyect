SELECT * FROM personal.departamentos;
-- 1.
SELECT * FROM persoanl.empleados;
-- 2.
SELECT * FROM personal.departamentos;
-- 3.
select nombre_depto from personal.departamentos ;
-- 4.
select nombre, sal_emp from personal.empleados;
-- 5. 
select nombre, comision_emp from personal.empleados;
-- 6.
select * from personal.empleados where cargo_emp like 'Secretaria' ;
-- 7.
select * from personal.empleados where cargo_emp like 'Vendedor' order by nombre ; 
-- 8.
select nombre, cargo_emp, sal_emp from personal.empleados order by sal_emp ;
-- 9.
select ciudad, nombre_jefe_depto from personal.departamentos where ciudad like 'Ciudad real';
-- 10.
select nombre as nombretemp, cargo_emp as cargotemp from personal.empleados; 
-- 11.
select sal_emp , comision_emp, id_depto from personal.empleados where id_depto like 2000  order by comision_emp desc;
-- 12. 
select nombre, (sal_emp + comision_emp + 500) from personal.empleados where id_depto like 3000 order by nombre;
-- 13.
select nombre from personal.empleados where nombre like 'j%';
-- 14.
select sal_emp, comision_emp, (sal_emp + comision_emp), nombre from personal.empleados where comision_emp > 1000 ;
-- 15.
select nombre, sal_emp, comision_emp, (sal_emp + comision_emp) from personal.empleados where comision_emp = 0;
-- 16.
select nombre, sal_emp, comision_emp from personal.empleados where comision_emp > sal_emp;
-- 17. 
-- comision <= (sal *0.3)
select nombre, sal_emp, comision_emp from personal.empleados where comision_emp <= (sal_emp*0.3) ;
-- 19.
-- venta, investigacion, mantenimiento
select nombre_depto from personal.departamentos where nombre_depto in ('Ventas', 'Investigacion','mantenimiento');
-- 20.
-- no venta, investigacion, mantenimiento
select nombre_depto from personal.departamentos where nombre_depto not in ('Ventas', 'Investigacion','mantenimiento');
-- 18.
 select nombre from personal.empleados where nombre not like ('%MA%');
 -- 21.
 select max(sal_emp) from personal.empleados;
 -- 22.
 -- ordenar alf dec y mostrar el 1
 select nombre from personal.empleados order by nombre desc limit 1;
 -- SELECT  MAX(nombre) AS Nombre FROM empleados ORDER BY nombre DESC;
 -- 23.
 select max(sal_emp), min(sal_emp), (max(sal_emp)-min(sal_emp)) from personal.empleados;
 -- 24.
 select avg(sal_emp), id_depto from personal.empleados group by  id_depto ; 
 -- Having
 -- 25 Departamentos con mas de 3 empleados. mostrar el nro de empleados de esos departamentos.
 select id_depto, count(id_emp) as 'cantidad empleados' from personal.empleados group by id_depto having  count(id_emp) > 3 ;
 -- 26 departamentos sin empleados
 select id_depto, count(id_emp) as 'cantidad empleados' from personal.empleados group by id_depto having  count(id_depto) = null ;
 -- Multitabla
 -- 27 lista empleados con jefe y depto
 select nombre, nombre_jefe_depto, nombre_depto from personal.empleados inner join personal.departamentos on  personal.empleados.id_depto = personal.departamentos.id_depto;
 select nombre, nombre_jefe_depto, nombre_depto from personal.empleados left join personal.departamentos on  personal.empleados.id_depto = personal.departamentos.id_depto;
 select nombre, nombre_jefe_depto, nombre_depto from personal.empleados right join personal.departamentos on  personal.empleados.id_depto = personal.departamentos.id_depto;
 -- consulta SUBCONSULTA
 -- 28 Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento. promedio 2.115.384,615
select nombre, sal_emp, id_depto from personal.empleados where sal_emp >= (select avg(sal_emp) from personal.empleados) order by id_depto;
 select avg(sal_emp) from personal.empleados;
 