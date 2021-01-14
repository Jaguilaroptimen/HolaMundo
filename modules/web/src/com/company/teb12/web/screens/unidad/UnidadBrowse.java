package com.company.teb12.web.screens.unidad;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Unidad;

@UiController("teb12_Unidad.browse")
@UiDescriptor("unidad-browse.xml")
@LookupComponent("unidadsTable")
@LoadDataBeforeShow
public class UnidadBrowse extends StandardLookup<Unidad> {
}