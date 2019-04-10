package com.sasha.smsxdiscord.backend;

import com.sasha.simplesettings.SettingHandler;
import com.sasha.smsxdiscord.backend.log.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("axiom") // i would change this but i dont wanna log into sendgrid rn
public class SystemApplication extends Application {

    public static final String SOFTWARE_NAME = "SMS x Discord Responder";
    public static final String SOFTWARE_VERSION = "1.0";
    public static final Logger LOGGER = new Logger(SOFTWARE_NAME);

    public static DiscordManager discord;
    private static SettingHandler settingHandler;
    public static ConfigSettings configSettings = new ConfigSettings();


    static {
        settingHandler = new SettingHandler("server_config");
        settingHandler.read(configSettings);
        discord = new DiscordManager();
        DiscordManager.discordToken = configSettings.discordToken;
        DiscordManager.channelId = configSettings.channelId;
    }

    public SystemApplication() {

    }


}
