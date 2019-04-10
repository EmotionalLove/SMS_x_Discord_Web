package com.sasha.smsxdiscord.backend.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private final String name;
    private final long time;

    public Logger(String name) {
        this.name = name;
        this.time = System.currentTimeMillis();
    }

    public void log(String s) {
        System.out.println(name + " >> " + s);
        try {
            File log = new File(dir(), name + "_" + time + ".txt");
            FileWriter writer = new FileWriter(log, true);
            writer.write(name + " >> " + s + System.lineSeparator());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private File dir() {
        File dir = new File("log");
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }

}
