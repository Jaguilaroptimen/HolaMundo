package com.company.teb12.web.screens.operador;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Operador;

@UiController("teb12_Operador.edit")
@UiDescriptor("operador-edit.xml")
@EditedEntityContainer("operadorDc")
@LoadDataBeforeShow
public class OperadorEdit extends StandardEditor<Operador> {
}