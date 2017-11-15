package com.cjm721.onlineuuid.mixins;


import com.mojang.authlib.GameProfile;
import net.minecraft.network.login.INetHandlerLoginServer;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.server.FMLServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.UUID;

@Mixin(NetHandlerLoginServer.class)
public abstract class OnlineUUIDMixin implements INetHandlerLoginServer, ITickable {
    /**
     * @author CJ
     * @reason Change how MC choses the UUID for a player while in offline mode. (Who point of this mod.)
     */
    @Redirect(method = "getOfflineProfile", at = @At("HEAD"))
    protected GameProfile getOfflineProfile(GameProfile original)
    {
        UUID uuid = FMLServerHandler.instance().getServer().getPlayerProfileCache().getGameProfileForUsername(original.getName()).getId();
        return new GameProfile(uuid, original.getName());
    }
}
