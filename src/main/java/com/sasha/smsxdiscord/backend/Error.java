package com.sasha.smsxdiscord.backend;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * Useless class
 */
public class Error {

    public static final String INTERNAL = "INTERNAL SERVER EXCEPTION";
    public static final String RATE_LIMIT = "TOO MANY REQUESTS";
    public static final String BAD_STR = "BAD JSON STRUCTURE";

    public static JsonObject err(String s) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("error", s);
        return builder.build();
    }
}
