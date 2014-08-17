package net.shadowcode.ohcreative;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class Main extends JavaPlugin {

    public void onEnable() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PermissionsExHook(), this);
        pm.registerEvents(new PlayerManager(), this);
        pm.registerEvents(new ChatHandler(), this);

    }
    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(sender instanceof Player) {

        } else {
            //CONSOLE NO CHANGE
        }
        return false;
    }


}
