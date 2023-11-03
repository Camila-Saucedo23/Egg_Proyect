use nba;
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
select Nombre FROM jugadores ORDER BY Nombre ;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
SELECT Nombre as 'Jugadores que son Pivots y pesan mas de 200 libras' FROM jugadores WHERE Posicion = 'C'  AND Peso >= 20 ORDER BY Nombre asc;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT Nombre FROM equipos ORDER BY Nombre asc;
-- 4. Mostrar el nombre de los equipos del este (East).
select Nombre from equipos where Conferencia like 'East' ; 
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select * from equipos where Ciudad like 'C%' order by Nombre;
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select * from jugadores where Nombre_equipo order by Nombre_equipo ;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select Nombre, Nombre_equipo from jugadores where Nombre_equipo like 'Raptors';
-- 8. Mostrar lo s puntos por partido del jugador ‘Pau Gasol’.
select  Puntos_por_partido from estadisticas where jugador = (select Codigo from jugadores where codigo = (select Codigo from jugadores where Nombre = 'Pau Gasol'));
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select Puntos_por_partido from estadisticas where (temporada = '04/05') and jugador = (select Codigo from jugadores where codigo = (select Codigo from jugadores where nombre = 'Pau Gasol'));
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT jugadores.nombre AS 'Jugador',(SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS 'Puntos Totales' FROM jugadores;
-- 11. Mostrar el número de jugadores de cada equipo.
select nombre_equipo, count(nombre_equipo) as 'Cantidad' from jugadores group  by nombre_equipo;
SELECT nombre_equipo AS 'Equipo', COUNT(nombre_equipo) AS 'Cantidad' FROM jugadores GROUP BY nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
 select nombre, (select sum(puntos_por_partido) from estadisticas where jugador = codigo ) as puntos from jugadores order by puntos desc limit 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select nombre,conferencia, division from equipos where nombre = (select nombre_equipo from jugadores order by altura desc limit 1);
-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT equipo_local AS 'Local', ROUND(AVG(puntos_local)) AS 'Media de puntos' 
FROM partidos INNER JOIN equipos ON partidos.equipo_local = equipos.nombre WHERE equipos.division = 'Pacific' GROUP BY partidos.equipo_local;
-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local, equipo_visitante, (puntos_local - puntos_visitante) as 'diferencia_puntos' from partidos where  (puntos_local - puntos_visitante) = ( select max(puntos_local-puntos_visitante) from partidos);
-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- tiene error
select equipo_local, avg(puntos_local) from partidos where equipo_local = (select Nombre from equipos where division = 'Pacific');
-- sin error
SELECT equipo_local AS 'Local', ROUND(AVG(puntos_local)) AS 'Media de puntos' 
FROM partidos INNER JOIN equipos ON partidos.equipo_local = equipos.nombre WHERE equipos.division = 'Pacific' GROUP BY partidos.equipo_local;
-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. 
select equipo_local, puntos_local, equipo_visitante, puntos_visitante from partidos ;
-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null
SELECT codigo, equipo_local AS 'Local', puntos_local AS 'Puntos Local', puntos_visitante AS 'Puntos Visitante', equipo_visitante AS 'Visitante', 
(SELECT CASE WHEN (puntos_local> puntos_visitante) THEN equipo_local WHEN (puntos_local< puntos_visitante) THEN equipo_visitante ELSE 'Empate' END) AS 'Equipo Ganador'
FROM partidos;