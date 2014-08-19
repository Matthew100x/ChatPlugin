package net.shadowcode.ohcreative;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * NemesisChat
 * Created by OhCreative on 8/17/2014.
 */
public class PlayerManager implements Listener {

    private static List<Player> players = new ArrayList<Player>();
    private static HashMap<UUID, ChatMode> chatlist = new HashMap<UUID, ChatMode>();


    @EventHandler
    protected void onJoin(PlayerJoinEvent e) {
        players.add(e.getPlayer());
        setChatMode(e.getPlayer(), ChatMode.GLOBAL);
    }

    @EventHandler
    protected void onQuit(PlayerQuitEvent e) {
        players.remove(e.getPlayer());
    }

    public static List<Player> getPlayers() {
        return players;
    }

    public static void setChatMode(Player player, ChatMode cm) {
       if(chatlist.containsKey(player.getUniqueId())) {
         chatlist.remove(player.getUniqueId());
           chatlist.put(player.getUniqueId(), cm);
       } else {
           chatlist.put(player.getUniqueId(), cm);
       }
    }

    public static ChatMode getChatMode(Player player) {
        if(chatlist.containsKey(player.getUniqueId())) {
           return chatlist.get(player.getUniqueId());
        } else {
            return ChatMode.GLOBAL;
        }
    }




}
