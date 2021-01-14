create table TEB12_LOCALIZACION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    CODIGO varchar(3) not null,
    MUNICIPIO varchar(255) not null,
    COLONIA varchar(255) not null,
    CALLE varchar(255) not null,
    NUMERO varchar(255) not null,
    LOCALIZACION VARCHAR(100) not null,
    --
    primary key (ID)
);