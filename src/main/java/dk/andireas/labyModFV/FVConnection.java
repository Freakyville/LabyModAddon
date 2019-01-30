package dk.andireas.labyModFV;

import com.google.gson.JsonObject;
import net.labymod.api.events.TabListEvent;
import net.labymod.servermanager.ChatDisplayAction;
import net.labymod.servermanager.Server;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Material;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.PacketBuffer;

import java.util.List;

public class FVConnection extends Server {
    private boolean displayElo = false;
    public FVConnection(){
        super( "FreakyVille", "mc.freakyville.net");
    }
    @Override
    public void onJoin(ServerData serverData) {
        Main.setAddonState(true);
    }

    @Override
    public ChatDisplayAction handleChatMessage(String s, String s1) throws Exception {
        return null;
    }

    @Override
    public void handlePluginMessage(String s, PacketBuffer packetBuffer) throws Exception {

    }

    @Override
    public void handleTabInfoMessage(TabListEvent.Type type, String s, String s1) throws Exception {

    }


    @Override
    public void fillSubSettings(List<SettingsElement> subSettings) {
        //subSettings.add( new BooleanElement( "Display Elo", this, new ControlElement.IconData( Material.DIAMOND_SWORD ), "displayElo" ) );
    }
}
