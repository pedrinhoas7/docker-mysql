CREATE TABLE company (
	code BIGINT PRIMARY KEY AUTO_INCREMENT,
    cnpj VARCHAR(50) NOT NULL,
	name VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

INSERT INTO company (cnpj,name) values ('00','São Bras');
INSERT INTO company (cnpj,name) values ('00','Softcom');
INSERT INTO company (cnpj,name) values ('00','Mercadinho Tambia');