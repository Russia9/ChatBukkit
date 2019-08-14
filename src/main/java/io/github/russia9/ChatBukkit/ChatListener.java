package io.github.russia9.ChatBukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ChatListener implements Listener {
    ChatBukkit plugin;

    public ChatListener(ChatBukkit plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onQuit(final PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onKick(final PlayerKickEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onChatMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission("chatbukkit.allowchat")) {

        } else {
            player.sendMessage("Вы не можете писать в чате");
        }
    }
}
