package com.cjm721.onlineuuid;

import net.minecraft.server.management.PlayerProfileCache;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

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
    
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        PlayerProfileCache.setOnlineMode(true);
    }
}
