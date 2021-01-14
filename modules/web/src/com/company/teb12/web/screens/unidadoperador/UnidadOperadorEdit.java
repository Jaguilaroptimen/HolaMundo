package com.company.teb12.web.screens.unidadoperador;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.UnidadOperador;

@UiController("teb12_UnidadOperador.edit")
@UiDescriptor("unidad-operador-edit.xml")
@EditedEntityContainer("unidadOperadorDc")
@LoadDataBeforeShow
public class UnidadOperadorEdit extends StandardEditor<UnidadOperador> {
}