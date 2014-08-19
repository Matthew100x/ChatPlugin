package net.shadowcode.ohcreative;

import net.shadowcode.ohcreative.Commands.CSudoCommand;
import net.shadowcode.ohcreative.Commands.GlobalCommand;
import net.shadowcode.ohcreative.Commands.LocalCommand;
import net.shadowcode.ohcreative.Commands.StaffCommand;
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

        getCommand("global").setExecutor(new GlobalCommand());
        getCommand("local").setExecutor(new LocalCommand());
        getCommand("staff").setExecutor(new StaffCommand());
        getCommand("csudo").setExecutor(new CSudoCommand());
    }
    public void onDisable() {

    }




}
