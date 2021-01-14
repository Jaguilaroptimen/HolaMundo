create table TEB12_UNIDAD_OPERADOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OPERADOR_ID varchar(36) not null,
    UNIDAD_ID varchar(36),
    --
    primary key (ID)
);