package xyz.invisraidinq.azure;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class AzurePlugin extends JavaPlugin {

    public abstract void load();
    public abstract void unload();

    @Override
    public void onEnable() {
        this.load();
    }

    @Override
    public void onDisable() {
        this.unload();
    }
}
