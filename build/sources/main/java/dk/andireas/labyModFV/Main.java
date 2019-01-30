package dk.andireas.labyModFV;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Material;

import java.util.List;

public class Main extends LabyModAddon {
    private static boolean enabled;
    private static boolean enabled2;
    private static boolean enabled3;

    @Override
    public void onEnable() {
        this.getApi().registerServerSupport( this, new FVConnection());
        enabled = false;
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void loadConfig() {
        this.enabled = getConfig().has( "enabled" ) ? getConfig().get( "enabled" ).getAsBoolean() : true; // <- default value 'true'
    }

    @Override
    protected void fillSettings(List<SettingsElement> subSettings) {
        BooleanElement be = new BooleanElement( "Aktiveret", this, new ControlElement.IconData( Material.LEVER ), "enabled", enabled );
        be.setBlocked(true);
        subSettings.add(be);
        BooleanElement be2 = new BooleanElement( "Aktiveret2", this, new ControlElement.IconData( Material.LEVER ), "enabled2", enabled2 );
        be2.setHoverable(false);
        subSettings.add(be2);
        BooleanElement be3 = new BooleanElement( "Aktiveret3", this, new ControlElement.IconData( Material.LEVER ), "enabled3", enabled3 );
        be3.setVisible(false);
        subSettings.add(be3);

    }

    public static void setAddonState(boolean state){
        enabled = state;
    }
}
