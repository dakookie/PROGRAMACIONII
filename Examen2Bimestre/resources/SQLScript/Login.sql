/* Copyright (C) 2K23, pat_mic
------------------------------
Creacion de la tabla Localidad con datos
30.ene.2k23
Version 1.0
*/

DROP TABLE IF EXISTS LOGIN;
CREATE TABLE IF NOT EXISTS LOGIN
(    DS_ID_USUARIOS        INTEGER PRIMARY KEY AUTOINCREMENT
    ,DS_USUARIOS           VARCHAR(20) NOT NULL
    ,DS_CONTRASENIA        VARCHAR(20)NOT NULL
);
-----------------------------------------------------------------------------------------------------
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('damaris.suquillo@epn.edu.ec', '1754021101');
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('profe', '1234');
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('usuario', '5678');
------------------------------------------------------------------------
SELECT * FROM LOGIN;
-------------------------------------------------------------------------------------------------------
