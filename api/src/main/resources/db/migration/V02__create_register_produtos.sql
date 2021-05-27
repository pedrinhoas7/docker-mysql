CREATE TABLE produto (
	codigo BIGINT PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(100) NOT NULL,
	quantidade INTEGER NOT NULL,
	preco_curto DECIMAL(10,2) NOT NULL,
	preco_venda DECIMAL(10,2) NOT NULL,
	observacao VARCHAR(500),
	codigo_categoria BIGINT NOT NULL,
	FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;



INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('TV Philco 32"', 10, 500, 870, 'Tv 32 Polegadas Philco Led Hd Conv. Digital Ptv32b51d', 1);
INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('AOC Smart TV 43"', 10, 1250, 1623.20, 'Smart Tv Led 43 Polegadas Aoc Le43s5970s Full Hd Wi-fi 2 Usb', 1);
INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('Sansung HD TV 32"', 10, 729, 1073.36, 'Tv Led 32 Samsung Un32n4000', 1);
INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('Celular Moto G7 Plus', 25, 1200.50, 1899, 'Celular Motorola Moto G7 Plus Indigo 64gb 4gb Ram Xt1965', 1);
INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('Smartphone Samsung Galaxy S9', 15, 2750, 3299, 'Smartphone Samsung Galaxy S9+ Tela 6.2 128gb 6gb De Ram', 1);
INSERT INTO produto (descricao, quantidade, preco_curto, preco_venda, observacao, codigo_categoria) values ('Piscina', 10, 500, 700, 'Piscina 10 mil listros', 3);