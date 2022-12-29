package com.tatamiserver.tatamiutils;

import org.bukkit.plugin.java.JavaPlugin;

public final class TatamiUtils extends JavaPlugin {

    private static TatamiUtils instance;

    @Override
    public void onEnable() {
        // Plugin startup logic

        getLogger().info("TatamiUtils が起動しました！");

        instance = this;



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static TatamiUtils getInstance() {
        return instance;
    }
}
