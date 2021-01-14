package com.company.teb12.web.screens.ruta;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Ruta;

@UiController("teb12_Ruta.edit")
@UiDescriptor("ruta-edit.xml")
@EditedEntityContainer("rutaDc")
@LoadDataBeforeShow
public class RutaEdit extends StandardEditor<Ruta> {
}