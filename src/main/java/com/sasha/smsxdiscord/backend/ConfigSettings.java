package com.sasha.smsxdiscord.backend;

import com.sasha.simplesettings.annotation.Setting;

public class ConfigSettings {

    @Setting
    public String discordToken = "[no default]";
    @Setting
    public String channelId = "[no default]";
}
