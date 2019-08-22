package com.cjm721.onlineuuid.mixins;


import com.mojang.authlib.GameProfile;
import net.minecraft.network.login.INetHandlerLoginServer;
import net.minecraft.server.network.NetHandlerLoginServer;
import net.minecraft.util.ITickable;
import net.minecraftforge.fml.server.FMLServerHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.UUID;

@Mixin(value = NetHandlerLoginServer.class, remap = true)
public abstract class OnlineUUIDMixin implements INetHandlerLoginServer, ITickable {
    /**
     * @author CJ
     * @reason Because its the whole point of this mod
     */
    @Overwrite
    protected GameProfile getOfflineProfile(GameProfile original)
    {
        UUID uuid = FMLServerHandler.instance().getServer().getPlayerProfileCache().getGameProfileForUsername(original.getName()).getId();
        return new GameProfile(uuid, original.getName());
    }
}
