package me.hxli.openjoinmessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class OpenJoinMessage extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);

    }
}
