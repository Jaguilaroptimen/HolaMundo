create table TEB12_RUTA (
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
    PUNTO_INICIO_ID varchar(36),
    PUNTO_FIN_ID varchar(36) not null,
    FECHA_INICIO timestamp not null,
    FECHA_FIN timestamp not null,
    --
    primary key (ID)
);