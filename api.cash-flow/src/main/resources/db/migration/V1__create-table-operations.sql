create table operations(

    id bigint not null auto_increment,
    account varchar(100) not null,
    amount decimal(15,2) not null,
    typed varchar(6) not null,

    primary key(id)

);