package org.devathon.contest2016;

import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

    private static DevathonPlugin instance;

    private final NPCRegistry registry = new NPCRegistry();

    @Override
    public void onEnable() {
        instance = this;

        registry.start();

        getCommand("test").setExecutor(new TestCommand());
    }

    public NPCRegistry getNPCRegistry() {
        return registry;
    }

    public static DevathonPlugin getInstance() {
        return instance;
    }
}
