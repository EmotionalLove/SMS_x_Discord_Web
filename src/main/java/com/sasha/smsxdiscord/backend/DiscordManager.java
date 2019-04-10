package com.sasha.smsxdiscord.backend;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class DiscordManager {

    public static JDA discord;

    public DiscordManager() {
        try {
            discord = new JDABuilder(AccountType.CLIENT).setToken(SystemApplication.configSettings.discordToken).build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public void send(String s) {
        discord.getUserById(SystemApplication.configSettings.channelId).openPrivateChannel().queue(e -> {
            e.sendMessage(s).submit();
        });
    }

}
