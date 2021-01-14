package com.company.teb12.web.screens.roster;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Roster;

@UiController("teb12_Roster.edit")
@UiDescriptor("roster-edit.xml")
@EditedEntityContainer("rosterDc")
@LoadDataBeforeShow
public class RosterEdit extends StandardEditor<Roster> {
}