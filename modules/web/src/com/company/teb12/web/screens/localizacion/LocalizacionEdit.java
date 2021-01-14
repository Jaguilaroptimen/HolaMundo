package com.company.teb12.web.screens.localizacion;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Localizacion;

@UiController("teb12_Localizacion.edit")
@UiDescriptor("localizacion-edit.xml")
@EditedEntityContainer("localizacionDc")
@LoadDataBeforeShow
public class LocalizacionEdit extends StandardEditor<Localizacion> {
}