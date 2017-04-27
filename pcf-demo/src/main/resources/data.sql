DROP TABLE IF EXISTS user;
CREATE TABLE user (id int NOT NULL, username varchar(255), PRIMARY KEY (id));

INSERT INTO user VALUES 
(1, 'root'),
(2, 'admin');
