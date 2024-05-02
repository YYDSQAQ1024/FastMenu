package me.fmenu.fmenu.script;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.plugin.Plugin;

public class script {

    /*
    JavaScript will invoke the functions!
     */

    public static String username;
    public static Player player;
    public static ClickType clickType;

    /*
        put("script.setPlayer","String name");
        put("script.getName","return UserName");
        //value 'player' can be change by script
        put("player.setHealth","int i");
        put("player.sendMessage","String s");
        put("player.setOp","Boolean b");
        put("player.setGameMode","String s");
        put("player.setAllowFlight","Boolean b");
        put("player.setDisplayName","String s");
        put("player.setEsp","float v");
        put("player.setGravity","Boolean b");
        put("player.setGlowing","Boolean b");
        put("player.setNoDamageTicks","int i");
        put("player.setInvisible","Boolean b");
        //values not only can get by player but also can get by PlaceholderAPI!
        put("player.getName","return PlayerName");
        put("player.getHealth","return PlayerHealth");
        put("player.getDisplayName","return DisplayName");
        put("player.isOp","return isOp");
     */
    public static void setPlayer(Object name){
        script.player = Bukkit.getPlayer((String) name);
    }
    public static Object getClickType(){
        return clickType;
    }
    public static void exc(Object cmd){
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),(String) cmd);
    }

    public static Object getName(){
        return username;
    }

}
