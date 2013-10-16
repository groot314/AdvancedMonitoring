package me.groot314.AdvancedM;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedM extends JavaPlugin{
	@Override
	public void onEnable() {
		AdvancedMCommandExecutor Executor = new AdvancedMCommandExecutor(this);
		getCommand("am").setExecutor(Executor);
		new LoginListener(this);
	}
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
	
	ArrayList<String> iplist = new ArrayList<String>();
}
