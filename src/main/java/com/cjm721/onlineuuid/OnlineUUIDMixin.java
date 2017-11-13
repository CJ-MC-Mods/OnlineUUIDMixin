package com.cjm721.onlineuuid;


import net.minecraft.network.login.INetHandlerLoginServer;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.util.ITickable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(NetHandlerLoginServer.class)
public abstract class OnlineUUIDMixin implements INetHandlerLoginServer, ITickable {

    //@Redirect(method = "getOfflineProfile", at = @At("HEAD"))
//    protected GameProfile getOfflineProfile(GameProfile original)
//    {
//        UUID uuid = FMLServerHandler.instance().getServer().getPlayerProfileCache().getGameProfileForUsername(original.getName()).getId();
//        return new GameProfile(uuid, original.getName());
//    }
}
