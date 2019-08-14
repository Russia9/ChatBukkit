package io.github.russia9.ChatBukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class ChatBukkit extends JavaPlugin {
    ChatListener chatListener;
    

    @Override
    public void onEnable() {
        getLogger().info("§aChatBukkit§e enabled");
        chatListener = new ChatListener(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("§aChatBukkit§e disabled");
    }
}
