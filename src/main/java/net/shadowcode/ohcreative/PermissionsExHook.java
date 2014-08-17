package net.shadowcode.ohcreative;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import ru.tehkode.permissions.PermissionGroup;
import ru.tehkode.permissions.bukkit.PermissionsEx;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class PermissionsExHook implements Listener {

    public static String getPrefix(Player player) {
        return PermissionsEx.getUser(player).getPrefix();
    }

    public static String getSuffix(Player player) {
        return PermissionsEx.getUser(player).getSuffix();
    }

    public static boolean hasPermission(Player player, String node) {
        return PermissionsEx.getUser(player).has(node);
    }

    public static PermissionGroup getPrimaryGroup(Player player) {
        return PermissionsEx.getUser(player).getGroups()[0];
    }

    public static PermissionGroup[] getGroups(Player player) {
        return PermissionsEx.getUser(player).getGroups();
    }

}
