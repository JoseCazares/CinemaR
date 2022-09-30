create database cinemar;

--Se creo un usuario sin privilegios llamado cinemar
--Contraseña: 8lU041kc*NDO o cualquier otra que desee

create table m_pelicula(
    id serial primary key,
    nombrepelicula varchar(80) not null,
    imagen varchar(80) not null,
    duracion varchar(4) not null,
    clasificacion varchar(6) not null
)

create table m_horarios(
    id serial primary key,
    horainicio time not null
)

create table m_pelicula_horarios(
    id_pelicula int references m_pelicula(id),
    id_horarios int references m_horarios(id)
)

