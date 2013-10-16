package me.groot314.AdvancedM;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AdvancedMCommandExecutor implements CommandExecutor {

	private AdvancedM plugin; //pointer to methods in main class
	public AdvancedMCommandExecutor(AdvancedM plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		return false;
	}
	
}
