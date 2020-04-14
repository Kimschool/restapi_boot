DROP table if exists kimschool;

CREATE TABLE kimschool (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO kimschool (name) VALUES
  ('name1'),
  ('name2'),
  ('name3');