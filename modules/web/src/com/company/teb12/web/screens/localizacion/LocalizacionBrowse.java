package com.company.teb12.web.screens.localizacion;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Localizacion;

@UiController("teb12_Localizacion.browse")
@UiDescriptor("localizacion-browse.xml")
@LookupComponent("localizacionsTable")
@LoadDataBeforeShow
public class LocalizacionBrowse extends StandardLookup<Localizacion> {
}