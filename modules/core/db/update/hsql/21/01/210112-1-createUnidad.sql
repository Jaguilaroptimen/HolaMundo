create table TEB12_UNIDAD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    UNIDAD varchar(12) not null,
    MATRICULA varchar(13) not null,
    TIPO varchar(255) not null,
    --
    primary key (ID)
);