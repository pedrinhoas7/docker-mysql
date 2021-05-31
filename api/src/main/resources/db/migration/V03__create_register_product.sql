CREATE TABLE product (
	code BIGINT PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(100) NOT NULL,
	amount INTEGER NOT NULL,
	short_price DECIMAL(10,2) NOT NULL,
	sale_price DECIMAL(10,2) NOT NULL,
	note VARCHAR(500),
	code_category BIGINT NOT NULL,
	FOREIGN KEY (code_category) REFERENCES category(code),
	code_company BIGINT NOT NULL,
	FOREIGN KEY (code_company) REFERENCES company(code)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;



INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company) values ('TV Philco 32"', 10, 500, 870, 'Tv 32 Polegadas Philco Led Hd Conv. Digital Ptv32b51d', 1,1);
INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company) values ('AOC Smart TV 43"', 10, 1250, 1623.20, 'Smart Tv Led 43 Polegadas Aoc Le43s5970s Full Hd Wi-fi 2 Usb', 1,2);
INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company) values ('Sansung HD TV 32"', 10, 729, 1073.36, 'Tv Led 32 Samsung Un32n4000', 1,2);
INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company)  values ('Celular Moto G7 Plus', 25, 1200.50, 1899, 'Celular Motorola Moto G7 Plus Indigo 64gb 4gb Ram Xt1965', 1,2);
INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company)  values ('Smartphone Samsung Galaxy S9', 15, 2750, 3299, 'Smartphone Samsung Galaxy S9+ Tela 6.2 128gb 6gb De Ram', 1,2);
INSERT INTO product (description, amount, short_price, sale_price, note, code_category, code_company)  values ('Piscina', 10, 500, 700, 'Piscina 10 mil listros', 3,2);