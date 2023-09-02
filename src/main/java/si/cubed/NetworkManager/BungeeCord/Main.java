package si.cubed.NetworkManager.BungeeCord;

import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance(){
        return plugin;
    }
}
