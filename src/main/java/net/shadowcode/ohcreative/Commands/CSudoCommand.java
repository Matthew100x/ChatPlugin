package net.shadowcode.ohcreative.Commands;

import net.shadowcode.ohcreative.PermissionsExHook;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class CSudoCommand implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            Player target = Bukkit.getServer().getPlayer(args[0]);

            if(target != null) {
               if(PermissionsExHook.hasPermission(p, "chat.sudo")) {

               } else {
                   p.sendMessage(ChatColor.GOLD + "[" + ChatColor.BLUE + "Chat" + ChatColor.GOLD + "] " + ChatColor.DARK_RED + "You do not have permission to this command!");
               }
            } else {
               p.sendMessage(ChatColor.GOLD + "[" + ChatColor.DARK_RED + "Nemesis" + ChatColor.RESET + "Chat" + ChatColor.GOLD + "] " + ChatColor.WHITE + "Player not found!");
            }

        } else {

        }
        return false;
    }
}
