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

CREATE TABLE PERSONA
(
    ID         INTEGER PRIMARY KEY,
    NOMBRE     VARCHAR(10),
    APELLIDO   VARCHAR(10)
);
-- DROP TABLE PERSONA;
-- DROP TABLE PET;


INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (1, "Pepe Lucho", "Perez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (2, "Ana", "Suarez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO)  VALUES  (3, "Juan", "Sanchez");

SELECT * FROM PERSONA;
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




