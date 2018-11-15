DROP TABLE IF EXISTS notes;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE notes
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  content          VARCHAR                 NOT NULL,
  created          TIMESTAMP DEFAULT now() NOT NULL,
  done             BOOL DEFAULT TRUE       NOT NULL
);