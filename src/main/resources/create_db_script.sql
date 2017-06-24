SET search_path TO lab9;

CREATE TABLE user_tb (
  id bigserial PRIMARY KEY,
  nickname varchar(32) NOT NULL,
  password varchar(16) NOT NULL,
  UNIQUE(nickname)
);

CREATE TABLE dot (
  id bigserial PRIMARY KEY,
  x real NOT NULL,
  y real NOT NULL,
  r real NOT NULL,
  result boolean,
	user_id bigserial NOT NULL,
  FOREIGN KEY(user_id) REFERENCES user_tb(id)
);