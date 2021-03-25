create table products
(
    id         bigserial primary key,
    title      varchar(255),
    price      int,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

insert into products (title, price)
values ('Bread', 24),
       ('Milk', 65),
       ('Cheese', 320),
       ('Cheese2', 322),
       ('Cheese3', 323),
       ('Cheese4', 324),
       ('Cheese5', 325),
       ('Cheese6', 326),
       ('Cheese7', 327),
       ('Cheese8', 328),
       ('Cheese9', 328),
       ('Cheese10', 328),
       ('Cheese11', 328),
       ('Cheese12', 328),
       ('Cheese13', 328),
       ('Cheese14', 328),
       ('Cheese15', 328);

create table role
(
    id  serial not null
        constraint role_table_pk
        primary key,
    name varchar(20) not null
);

create table user
(
    id       serial not null
             constraint user_table_pk
             primary key,
    login    varchar(50),
    password varchar(500),
    role_id  integer
             constraint user_table_role_table_id_fk
             references role
);

create
unique index user_table_login_uindex
    on user (login);

insert into role(name) values ('ROLE_ADMIN');
insert into role(name) values ('ROLE_USER');