package com.junyoung.firechatting;

/**
 * Created by Junyoung on 16. 6. 28..
 */
final public class User {
    static private String name;
    static private String channel;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getChannel() {
        return channel;
    }

    public static void setChannel(String channel) {
        User.channel = channel;
    }
}
