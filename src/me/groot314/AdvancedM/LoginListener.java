package me.groot314.AdvancedM;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class LoginListener implements Listener{
	public LoginListener(AdvancedM plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
 
    @EventHandler(priority = EventPriority.HIGH)
    public void Login(PlayerLoginEvent event) {
        // Some code here
    }
    @EventHandler(priority = EventPriority.HIGH)
    public void Logout(PlayerQuitEvent event) {
        // Some code here
    }
}
