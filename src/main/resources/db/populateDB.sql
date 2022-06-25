DELETE FROM patient;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO patient (name, disease)
VALUES ('Иванов Иван Иванович', 'Ветрянка'),
       ('Сидоров Валерий Петрович', 'Насморк');