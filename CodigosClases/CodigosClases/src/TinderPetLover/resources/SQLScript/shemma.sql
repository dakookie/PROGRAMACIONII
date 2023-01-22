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
--DROP TABLE PERSONA;

INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO) 
            VALUES  (1, "Pepe Lucho", "Perez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO) 
            VALUES  (2, "Ana", "Suarez");
INSERT INTO PERSONA (ID,   NOMBRE,   APELLIDO) 
            VALUES  (3, "Juan", "Sanchez");

SELECT * FROM PERSONA




