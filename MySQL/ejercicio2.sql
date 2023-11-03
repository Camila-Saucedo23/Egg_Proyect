use tienda ; 
-- 1
select nombre from producto;
-- 2
select nombre, precio from producto;
-- 3
select * from producto;
-- 4
select nombre, round(precio) from producto;
-- 5 l (izq), r (der) 
select fabricante.nombre , codigo_fabricante  from fabricante inner join producto on producto.codigo_fabricante = fabricante.codigo;
-- 6 
select distinct fabricante.nombre , codigo_fabricante  from fabricante inner join producto on producto.codigo_fabricante = fabricante.codigo;
-- 7
select nombre from fabricante order by nombre;
-- 8
select nombre, precio from producto order by precio desc;
-- 9 
select * from fabricante limit 5 ;
-- 10
select nombre, precio from producto order by precio limit 1;
-- 11 
select nombre, precio from producto order by precio desc limit 1;
-- 12
select nombre, precio from producto where precio <= 120;
-- 13
select * from producto where precio  between 60 and 120;
-- 14
select * from producto where codigo_fabricante in (1,3,5);
-- 15 
select nombre from producto where nombre like '%portatil%';
-- CONSULTAS MULTITABLA
-- 1
select producto.codigo, producto.nombre, fabricante.codigo, fabricante.nombre  from fabricante inner join producto on  producto.codigo_fabricante = fabricante.codigo  ;
-- 2
select producto.nombre, precio, fabricante.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo order by fabricante.nombre;
-- 3
select producto.nombre, precio, fabricante.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo order by precio limit 1;
-- 5
select precio, fabricante.nombre, producto.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre like 'crucial' and precio > 200; 
-- 4
select fabricante.nombre, producto.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre like 'Lenovo';
-- 6 
select fabricante.nombre, producto.nombre from producto  inner join fabricante  on producto.codigo_fabricante = fabricante.codigo where fabricante.nombre in ('Asus','Hewlett-Packard') ;
-- 7
select producto.nombre, precio, fabricante.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where precio >= 180 order by precio desc;
select producto.nombre, precio, fabricante.nombre from producto inner join fabricante on producto.codigo_fabricante = fabricante.codigo where precio >= 180 order by producto.nombre;
-- CONSULTAS MULTITABLA
-- 1
select fabricante.nombre as 'fabricante', producto.nombre as 'producto' from fabricante left join producto on fabricante.codigo = producto.codigo_fabricante ; 
-- 2
select fabricante.nombre as 'fabricante', producto.nombre as 'producto' from fabricante left join producto on fabricante.codigo = producto.codigo_fabricante order by producto.nombre limit 2 ;
-- SUBCONSULTAS (WHERE)
-- con operadores basicos de comparacion
-- 1 
select * from producto where producto.codigo_fabricante = (select fabricante.codigo from fabricante WHERE fabricante.nombre like 'lenovo');
-- SELECT *FROM tienda.producto  WHERE codigo_fabricante  = (SELECT codigo FROM tienda.fabricante WHERE nombre = 'Lenovo');
-- SELECT tienda.producto.*,fabricante.nombre FROM tienda.producto,fabricante WHERE producto.codigo_fabricante = fabricante.codigo AND fabricante.nombre='Lenovo';
-- 2
select * from producto where producto.precio = (select max(precio) from producto where producto.codigo_fabricante = (select fabricante.codigo from fabricante where fabricante.nombre like 'lenovo'));
-- 3  Lista el nombre del producto más caro del fabricante Lenovo
-- SELECT nombre FROM producto WHERE codigo_fabricante = (SELECT codigoFROM fabricante WHERE nombre = 'Lenovo')ORDER BY precio DESC LIMIT 1;
select producto.nombre from producto where producto.precio = (select max(precio) from producto where producto.codigo_fabricante = ( select fabricante.codigo from fabricante where fabricante.nombre like 'lenovo'));
-- 4 Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos
select * from producto where producto.codigo_fabricante = (select codigo from fabricante where fabricante.nombre like 'asus') and precio > ( select avg(precio) from producto where producto.codigo_fabricante = ( select fabricante.codigo from fabricante where fabricante.nombre like 'asus')); 
-- subconsultas con in y not in 
-- 1 Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN)
select * from fabricante where fabricante.codigo in (select producto.codigo_fabricante from producto);
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select * from fabricante where fabricante.codigo not in ( select producto.codigo_fabricante from producto);
-- Subconsultas (En la cláusula HAVING)
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
--  select id_depto, count(id_emp) as 'cantidad empleados' from personal.empleados group by id_depto having  count(id_emp) > 3 ;
select fabricante.nombre from fabricante where fabricante.codigo in (select producto.codigo_fabricante from producto group by producto.codigo_fabricante having count(*) = (SELECT codigo FROM fabricante WHERE nombre = 'Lenovo' ));  
