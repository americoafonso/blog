CREATE TABLE usuario(
	id bigint NOT NULL CONSTRAINT pk_id PRIMARY KEY,
	nome varchar(40) NOT NULL,
	email varchar(40) NOT NULL,
	password varchar(255) NOT NULL
);
