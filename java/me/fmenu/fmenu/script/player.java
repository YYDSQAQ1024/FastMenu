package me.fmenu.fmenu.script;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

import static org.bukkit.ChatColor.translateAlternateColorCodes;

public class player {

    public static Player player;

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

    public static void setHealth(Object health){
        player.setHealth((Double) health);
    }
    public static void sendMessage(Object msg){
        player.sendMessage(translateAlternateColorCodes('&', (String) msg));
    }
    public static void setOp(Object op){
        player.setOp((Boolean) op);
    }
    public static void setGameMode(Object gameMode){
        player.setGameMode(GameMode.valueOf((String) gameMode));
    }
    public static void setAllowFlight(Object allowFlight){
        player.setAllowFlight((Boolean) allowFlight);
    }
    public static void setDisplayName(Object displayName){
        player.setDisplayName((String) displayName);
    }
    public static void setExp(Object exp){
        player.setExp((Float) exp);
    }
    public static void setGravity(Object gravity){
        player.setGravity((Boolean) gravity);
    }
    public static void setGlowing(Object glowing){
        player.setGlowing((Boolean) glowing);
    }
    public static void setNoDamageTicks(Object noDamageTicks){
        player.setNoDamageTicks((Integer) noDamageTicks);
    }
    public static void setInvisible(Object invisible){
        player.setInvisible((Boolean) invisible);
    }
    public static void exc(Object cmd){
        player.getServer().dispatchCommand( player, (String) cmd);
    }
    public static Object getName(){
        return player.getName();
    }
    public static Object getHealth(){
        return player.getHealth();
    }
    public static Object getDisplayName(){
        return player.getDisplayName();
    }
    public static Object isOp(){
        return player.isOp();
    }

}
