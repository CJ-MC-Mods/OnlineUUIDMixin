package com.cjm721.onlineuuid;

import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = OnlineUUID.MOD_ID,
        name = OnlineUUID.MOD_NAME,
        version = OnlineUUID.VERSION,
        serverSideOnly = true,
        acceptedMinecraftVersions = "[1.12,1.13)",
        acceptableRemoteVersions = "*"
)
public class OnlineUUID {

    public static final String MOD_ID = "onlineuuid";
    public static final String MOD_NAME = "OnlineUUID";
    public static final String VERSION = "${mod_version}";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static OnlineUUID INSTANCE;
}
