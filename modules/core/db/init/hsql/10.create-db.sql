-- begin TEB12_OPERADOR
create table TEB12_OPERADOR (
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
    APELLIDOS varchar(255) not null,
    MUNICIPIO varchar(255) not null,
    COLONIA varchar(255) not null,
    CALLE varchar(255) not null,
    NUMERO varchar(255) not null,
    LOCALIZACION VARCHAR(100) not null,
    --
    primary key (ID)
)^
-- end TEB12_OPERADOR
-- begin TEB12_RUTA
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
)^
-- end TEB12_RUTA
-- begin TEB12_ROSTER
create table TEB12_ROSTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    OPERADOR_ID varchar(36),
    RUTA_ID varchar(36),
    --
    primary key (ID)
)^
-- end TEB12_ROSTER
-- begin TEB12_LOCALIZACION
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
)^
-- end TEB12_LOCALIZACION
-- begin TEB12_UNIDAD
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
)^
-- end TEB12_UNIDAD
-- begin TEB12_UNIDAD_OPERADOR
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
)^
-- end TEB12_UNIDAD_OPERADOR
