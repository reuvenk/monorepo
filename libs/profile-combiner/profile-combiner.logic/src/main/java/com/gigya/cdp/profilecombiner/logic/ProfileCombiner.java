package com.gigya.cdp.profilecombiner.logic;

import com.gigya.cdp.common.CdpLogger;
import com.gigya.cdp.profilecombiner.api.IProfileCombiner;

public class ProfileCombiner implements IProfileCombiner {
    private CdpLogger cdpLogger = new CdpLogger();

    @Override
    public void HandleProfileUpdate(String source) {
        cdpLogger.log("-> HandleProfileUpdate from " + source);
        cdpLogger.log("<- HandleProfileUpdate");
    }
}
