package com.insurgencedev.rivalrodsboost;

import com.insurgencedev.rivalrodsboost.listeners.RivalRodsEventListener;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;
import org.insurgencedev.insurgencesets.libs.fo.Common;

@ISetsAddon(name = "RivalRodsBoost", version = "1.0.0", author = "Insurgence Dev Team", description = "RivalFishingRods Support")
public class RivalRodsBoost extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Common.doesPluginExist("RivalFishingRods")) {
            registerEvent(new RivalRodsEventListener());
        }
    }
}
