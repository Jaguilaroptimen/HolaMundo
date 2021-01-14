alter table TEB12_UNIDAD_OPERADOR add constraint FK_TEB12_UNIDAD_OPERADOR_ON_OPERADOR foreign key (OPERADOR_ID) references TEB12_OPERADOR(ID);
alter table TEB12_UNIDAD_OPERADOR add constraint FK_TEB12_UNIDAD_OPERADOR_ON_UNIDAD foreign key (UNIDAD_ID) references TEB12_UNIDAD(ID);
create index IDX_TEB12_UNIDAD_OPERADOR_ON_OPERADOR on TEB12_UNIDAD_OPERADOR (OPERADOR_ID);
create index IDX_TEB12_UNIDAD_OPERADOR_ON_UNIDAD on TEB12_UNIDAD_OPERADOR (UNIDAD_ID);
