alter table TEB12_RUTA add constraint FK_TEB12_RUTA_ON_PUNTO_INICIO foreign key (PUNTO_INICIO_ID) references TEB12_LOCALIZACION(ID);
alter table TEB12_RUTA add constraint FK_TEB12_RUTA_ON_PUNTO_FIN foreign key (PUNTO_FIN_ID) references TEB12_LOCALIZACION(ID);
create index IDX_TEB12_RUTA_ON_PUNTO_INICIO on TEB12_RUTA (PUNTO_INICIO_ID);
create index IDX_TEB12_RUTA_ON_PUNTO_FIN on TEB12_RUTA (PUNTO_FIN_ID);
