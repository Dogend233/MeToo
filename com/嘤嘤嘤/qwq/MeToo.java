package com.嘤嘤嘤.qwq;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MeToo extends JavaPlugin implements Listener {
    
    public static String msg ="";
    
    @Override
    public void onEnable(){  
        Bukkit.getPluginManager().registerEvents(this,this);
    }
    
    @EventHandler
    public void meToo(AsyncPlayerChatEvent e){
        String str = e.getMessage();
        if(str.equals("+1")){
            e.setMessage(msg);
        }else if(str.indexOf('/')!=1){
            msg = str;
        }
    }
    
}
