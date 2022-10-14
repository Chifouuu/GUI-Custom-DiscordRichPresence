package com.chifou.customrichpresence.events;

import com.chifou.customrichpresence.gui.GuiChooseRPC;
import com.chifou.customrichpresence.gui.RunningGui;
import com.chifou.customrichpresence.richpresence.RPC;
import com.chifou.customrichpresence.utils.Log;
import com.chifou.customrichpresence.utils.RpcReferences;

public class EventSendButton {
    public static void eventListener(String appId, String partyId, String token, String flavionName) {

        RpcReferences.appId = appId;
        RpcReferences.partyId = partyId;
        RpcReferences.token = token;
        RpcReferences.flavionName = flavionName;

        /*Log.sendLog("appId = " + RpcReferences.appId);
        Log.sendLog("partyId = " + RpcReferences.partyId);
        Log.sendLog("token = " + RpcReferences.token);
        Log.sendLog("flavionName = " + RpcReferences.flavionName);*/

        GuiChooseRPC.dispose();

        RunningGui.display();
        RPC.displayRPC();
    }
}
