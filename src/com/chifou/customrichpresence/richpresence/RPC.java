package com.chifou.customrichpresence.richpresence;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import com.chifou.customrichpresence.utils.RpcReferences;

public class RPC {

    public static void displayRPC() {

        DiscordRPC lib = DiscordRPC.INSTANCE;
        String applicationId = RpcReferences.appId;
        String steamId = "SteamID";
        DiscordEventHandlers handlers = new DiscordEventHandlers();
        handlers.ready = (user) -> System.out.println("Ready!");
        lib.Discord_Initialize(applicationId, handlers, true, steamId);
        DiscordRichPresence presence = new DiscordRichPresence();
        presence.startTimestamp = System.currentTimeMillis() / 1000; // epoch second
        presence.details = "";
        presence.largeImageText = RpcReferences.flavionName;
        presence.smallImageText = "Rogue - Level 100";
        presence.partyId = RpcReferences.partyId;
        presence.largeImageKey = "flavion";
        presence.joinSecret = RpcReferences.token;
        lib.Discord_UpdatePresence(presence);
        // in a worker thread
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                lib.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignored) {}
            }
        }, "RPC-Callback-Handler").start();

    }
}
