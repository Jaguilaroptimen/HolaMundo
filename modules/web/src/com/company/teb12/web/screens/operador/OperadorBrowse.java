package com.company.teb12.web.screens.operador;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Operador;

@UiController("teb12_Operador.browse")
@UiDescriptor("operador-browse.xml")
@LookupComponent("operadorsTable")
@LoadDataBeforeShow
public class OperadorBrowse extends StandardLookup<Operador> {
}