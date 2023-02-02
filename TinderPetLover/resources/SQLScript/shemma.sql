/*
* @ author: dakookie: 20-ene-2023
* Script de base de datos
*/
-- database: TinderPet.db
//-- database: /path/to/database.db

.version
.database
.show
.tables


DROP TABLE MascotaTipo

CREATE TABLE Sexo 
(
    IdSexo INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    Nombre VARCHAR (100);
    Estado          VARCHAR(1) NOT NULL DEFAULT('A')
);

-- JOSUE PERALTA LLENE TABLA SEXO
INSERT INTO Sexo (NOMBRE) VALUES ("HEMBRA");
INSERT INTO Sexo (NOMBRE) VALUES ("MACHO");
INSERT INTO Sexo (NOMBRE) VALUES ("SIN SEXO");

--Jonathan.Luzuriaga
CREATE TABLE Mascota
(
    IdMascota       INTEGER PRIMARY KEY AUTOINCREMENT,
    IdMascotaTipo   INTEGER NOT NULL,
    IdSexo          INTEGER NOT NULL,
    Nombre          VARCHAR (100) NOT NULL,
    Edad            INTEGER NOT NULL,
    Estado          VARCHAR(1) NOT NULL DEFAULT('A')
)
INSERT INTO Mascota VALUES ( IdMascota,   IdMascotaTipo,   IdSexo,  Nombre,  Edad,  Estado)
VALUES ()





CREATE TABLE MascotaTipo
(
    IdMascotaTipo     INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre            VARCHAR(10) NOT NULL,
    Estado            VARCHAR(1) NOT NULL DEFAULT('A')
);

INSERT INTO MascotaTipo ( Nombre, Estado)  VALUES ( "Perros", "A");
INSERT INTO MascotaTipo ( Nombre)  VALUES      ( "Gatos");
INSERT INTO MascotaTipo ( Nombre)  VALUES      ( "Peces");
INSERT INTO MascotaTipo ( Nombre)  VALUES      ( "Cuyes");
INSERT INTO MascotaTipo ( Nombre)  VALUES      ( "León");

--- DELETE FROM MascotaTipo WHERE IdMascotaTipo > 9

SELECT * FROM MascotaTipo;

UPDATE MascotaTipo SET Estado = "X"
WHERE IdMascotaTipo in (6,12);

SELECT * from MascotaTipo
WHERE Nombre like '%e%';





CREATE TABLE PERSONA
(
    ID         INTEGER PRIMARY KEY,
    NOMBRE     VARCHAR(10),
    APELLIDO   VARCHAR(10)
);
---DROP TABLE PERSONA;
---DROP TABLE PET;


INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (1, "Pepe Lucho", "Perez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (2, "Ana", "Suarez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (3, "Juan", "Sanchez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (4, "Lucas Juan", "Montalvo");

SELECT ID,   NOMBRE,   APELLIDO FROM PERSONA;

SELECT ID,   NOMBRE,   APELLIDO 
FROM PERSONA
WHERE ID = 2;

SELECT ID,   NOMBRE,   APELLIDO 
FROM PERSONA
WHERE NOMBRE LIKE '%JUAN%';
----------------------------------------------------------
CREATE TABLE PET
(
    ID         INTEGER PRIMARY KEY,
    NOMBRE     VARCHAR(10),
    EDAD       INTEGER
);
--DROP TABLE PET;
INSERT INTO PET (ID,   NOMBRE,   EDAD)  VALUES  (1, "VALUMA", 1);
INSERT INTO PET (ID,   NOMBRE,   EDAD)  VALUES  (2, "JUANA", 2);
INSERT INTO PET (ID,   NOMBRE,   EDAD)  VALUES  (3, "COMOTU", 3);
SELECT * FROM PET;
------------------------------------------------------------------




