package net.shadowcode.ohcreative.Commands;

import net.shadowcode.ohcreative.ChatMode;
import net.shadowcode.ohcreative.PlayerManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class StaffCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(PlayerManager.getChatMode(p).equals(ChatMode.LOCAL)) {
                p.sendMessage(ChatColor.GOLD + "[" + ChatColor.BLUE + "Chat" + ChatColor.GOLD + "] " + ChatColor.WHITE + "You are already in " + ChatColor.GREEN + "Staff" + ChatColor.WHITE + "!");
            } else {
                PlayerManager.setChatMode(p, ChatMode.LOCAL);
                p.sendMessage(ChatColor.GOLD + "[" + ChatColor.BLUE + "Chat" + ChatColor.GOLD + "] " + ChatColor.WHITE + "You have changed to " + ChatColor.GREEN + "Staff" + ChatColor.WHITE + "!");
            }
        } else {
            sender.sendMessage(ChatColor.GOLD + "[" + ChatColor.BLUE + "Chat" + ChatColor.GOLD + "] " + ChatColor.WHITE + "Console cannot chat!");
        }
        return false;
    }
}
