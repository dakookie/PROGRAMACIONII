


DROP TABLE IF EXISTS LOGIN;
CREATE TABLE IF NOT EXISTS LOGIN
(    DS_ID_USUARIOS        INTEGER PRIMARY KEY AUTOINCREMENT
    ,DS_USUARIOS           VARCHAR(20) NOT NULL
    ,DS_CONTRASENIA        VARCHAR(20)NOT NULL
);
------------------------------------------------------------------------
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('damaris.suquillo@epn.edu.ec', '1975e85a14bb5d6c726a7c344d409784');
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('profe', '81dc9bdb52d04dc20036dbd8313ed055');
INSERT INTO LOGIN (DS_USUARIOS, DS_CONTRASENIA) VALUES ('usuario', '674f3c2c1a8a6f90461e8a66fb5550ba');
------------------------------------------------------------------------
SELECT * FROM LOGIN;
