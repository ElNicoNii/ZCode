package com.yazawa.nico;

import org.bukkit.plugin.java.JavaPlugin;

public class ZCode extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Events(this), this);
	}
}
