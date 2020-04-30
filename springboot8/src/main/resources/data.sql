DROP TABLE IF EXISTS user;
CREATE TABLE user(id bigint auto_increment, first_name varchar(255), last_name varchar(255), email varchar(255));

INSERT INTO user (first_name, last_name, email) VALUES
  ('Mark', 'Zuckerberg','mark_zuckerbreg@facebook.com'),
  ('Bill', 'Gates','bill_gates@microsoft.com'),
  ('Larry', 'Page','larry_page@google.com');