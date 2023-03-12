


DROP TABLE IF EXISTS COORDENADAS;
CREATE TABLE IF NOT EXISTS COORDENADAS
(    DS_CAPACIDAD       INTEGER NULL
    ,DS_GEO             VARCHAR(20) NOT NULL
    ,DS_TIPO_ARSENAL    VARCHAR(20) NOT NULL
    ,DS_FECHA           VARCHAR(20) DEFAULT(datetime('now'))
);
------------------------------------------------------------------------
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (1, 'GPS1','bc');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (0, 'GPS0','ab');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (1, 'GPS1','bc');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (1, 'GPS1','bc');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (2, 'GPS2','ac');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (0, 'GPS0','ab');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (4, 'GPS4','acd');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (5, 'GPS5','bct');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (7, 'GPS7','aaabbct');
INSERT INTO COORDENADAS (DS_CAPACIDAD, DS_GEO, DS_TIPO_ARSENAL) VALUES (1, 'GPS1','bc');
------------------------------------------------------------------------
SELECT * FROM COORDENADAS;
