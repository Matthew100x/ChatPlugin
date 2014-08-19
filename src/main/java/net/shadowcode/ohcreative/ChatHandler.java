package net.shadowcode.ohcreative;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ru.tehkode.permissions.PermissionGroup;
import ru.tehkode.permissions.bukkit.PermissionsEx;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class ChatHandler implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e) {
        e.setCancelled(true);
        Player p = e.getPlayer();
        String prefix = ChatColor.translateAlternateColorCodes('&', PermissionsExHook.getPrefix(p));
        String suffix = PermissionsExHook.getSuffix(p);
        String message = e.getMessage();
        PermissionGroup pgroup = PermissionsExHook.getPrimaryGroup(p);
        PermissionGroup[] pgrouplist = PermissionsExHook.getGroups(p);
        ChatMode cm = PlayerManager.getChatMode(p);


            if (cm.equals(ChatMode.GLOBAL)) {

            }
            if (cm.equals(ChatMode.LOCAL)) {
                return;
            }
            if (cm.equals(ChatMode.STAFF)) {
                return;
            }


        }
    }
