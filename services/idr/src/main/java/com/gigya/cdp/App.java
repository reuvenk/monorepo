package com.gigya.cdp;

import com.gigya.cdp.common.CdpLogger;
import com.gigya.cdp.profilecombiner.api.IProfileCombiner;
import com.gigya.cdp.profilecombiner.logic.ProfileCombiner;

/**
 * Hello world!
 *
 */
public class App
{
    static IProfileCombiner profileCombiner = new ProfileCombiner();
    static CdpLogger logger = new CdpLogger();
    public static void main( String[] args )
    {
        logger.log("Starting IDR");

        profileCombiner.HandleProfileUpdate("from IDR 7");
    }
}
