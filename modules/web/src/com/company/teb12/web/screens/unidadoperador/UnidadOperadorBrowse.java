package com.company.teb12.web.screens.unidadoperador;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.UnidadOperador;

@UiController("teb12_UnidadOperador.browse")
@UiDescriptor("unidad-operador-browse.xml")
@LookupComponent("unidadOperadorsTable")
@LoadDataBeforeShow
public class UnidadOperadorBrowse extends StandardLookup<UnidadOperador> {
}