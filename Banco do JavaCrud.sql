/* Criando o Banco */
create database cadastros;

/*Usando o banco*/
use cadastros;

/*Criando a tabela*/
create table clientes (
codCliente int primary key auto_increment not null,
nome varchar (100) not null,
email varchar (100),
cpf int not null,
municipio varchar (50),
sexo varchar(10));

alter table clientes modify cpf varchar(15); 


/*Comando para mostrar a tabela*/
select* from clientes;
desc clientes;
SELECT * FROM clientes WHERE codCliente=3