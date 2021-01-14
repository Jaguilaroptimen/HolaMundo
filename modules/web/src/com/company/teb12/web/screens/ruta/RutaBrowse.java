package com.company.teb12.web.screens.ruta;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Ruta;

@UiController("teb12_Ruta.browse")
@UiDescriptor("ruta-browse.xml")
@LookupComponent("rutasTable")
@LoadDataBeforeShow
public class RutaBrowse extends StandardLookup<Ruta> {
}