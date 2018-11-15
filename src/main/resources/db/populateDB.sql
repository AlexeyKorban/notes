DELETE FROM notes;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO notes (content) VALUES
  ('Тесты это прекрасно'),
  ('Тесты это отлично');