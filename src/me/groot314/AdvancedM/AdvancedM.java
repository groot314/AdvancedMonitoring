package me.groot314.AdvancedM;

import org.bukkit.plugin.java.JavaPlugin;

public class AdvancedM extends JavaPlugin{
	@Override
	public void onEnable() {
		getCommand("am").setExecutor(new AdvancedMCommandExecutor(this));
		new LoginListener(this);
	}
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
