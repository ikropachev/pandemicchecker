DROP TABLE IF EXISTS patient;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 100000;

CREATE TABLE patient
(
    id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name             VARCHAR                            NOT NULL,
    disease          VARCHAR                            NOT NULL,
    pandemic         BOOL                DEFAULT false  NOT NULL
);