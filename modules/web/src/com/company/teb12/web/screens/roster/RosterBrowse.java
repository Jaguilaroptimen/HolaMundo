package com.company.teb12.web.screens.roster;

import com.haulmont.cuba.gui.screen.*;
import com.company.teb12.entity.Roster;

@UiController("teb12_Roster.browse")
@UiDescriptor("roster-browse.xml")
@LookupComponent("rostersTable")
@LoadDataBeforeShow
public class RosterBrowse extends StandardLookup<Roster> {
}