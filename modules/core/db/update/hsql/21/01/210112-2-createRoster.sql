alter table TEB12_ROSTER add constraint FK_TEB12_ROSTER_ON_OPERADOR foreign key (OPERADOR_ID) references TEB12_UNIDAD_OPERADOR(ID);
alter table TEB12_ROSTER add constraint FK_TEB12_ROSTER_ON_RUTA foreign key (RUTA_ID) references TEB12_RUTA(ID);
create index IDX_TEB12_ROSTER_ON_OPERADOR on TEB12_ROSTER (OPERADOR_ID);
create index IDX_TEB12_ROSTER_ON_RUTA on TEB12_ROSTER (RUTA_ID);
