package com.company.teb12.web.screens.unidad;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Unidad;

@UiController("teb12_Unidad.edit")
@UiDescriptor("unidad-edit.xml")
@EditedEntityContainer("unidadDc")
@LoadDataBeforeShow
public class UnidadEdit extends StandardEditor<Unidad> {
}