USE nba;
-- CANDADO 1
-- CLAVE = 14043
SELECT sum(j.peso) from jugadores j  inner join equipos e on e.Nombre = j.Nombre_equipo where e.conferencia like 'east' and j.Posicion like '%C%' ;
-- POSICION = 2
SELECT count(es.Asistencias_por_partido) from estadisticas es where es.Asistencias_por_partido = (SELECT max(Asistencias_por_partido) from estadisticas);
-- CANDADO 2
-- CLAVE = 3480
SELECT count(es.Asistencias_por_partido) from estadisticas es where es.Asistencias_por_partido = (SELECT max(Asistencias_por_partido) from estadisticas);
-- POSICION = 3
SELECT count(*) from jugadores ju inner join estadisticas es on ju.codigo = es.jugador where es.Asistencias_por_partido > (SELECT count(*) from jugadores where nombre_equipo like 'Heat');
-- CANDADO 3 
-- CLAVE = 631
SELECT floor(avg(es.puntos_por_partido)+count(es.asistencias_por_partido)+sum(es.tapones_por_partido)) from estadisticas es inner join jugadores ju on ju.codigo = es.jugador inner join equipos eq on  eq.nombre = ju.nombre_equipo where Division like 'central';
-- POSICION = 1 
SELECT round(((SELECT count(*) from jugadores ju inner join equipos eq on eq.Nombre = ju.Nombre_equipo where ju.Procedencia like 'Michigan' and eq.Conferencia like 'west') / (select count(*) from jugadores where peso >= 195 ) + 0.9945));
-- CANDADO 4 
-- CLAVE = 191
SELECT floor(sum(puntos_por_partido)) from estadisticas inner join jugadores on codigo = jugador where Procedencia like 'Argentina';
-- POSICION = 4
SELECT round(es.tapones_por_partido) from estadisticas es where temporada like '%00/01%' and jugador = (select codigo from jugadores where nombre like 'corey maggette');