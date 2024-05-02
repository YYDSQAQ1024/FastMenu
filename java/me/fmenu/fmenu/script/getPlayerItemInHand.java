package me.fmenu.fmenu.script;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class getPlayerItemInHand {

    public static Player player;
    public static Object getItemStack(){
        return player.getItemInHand();
    }
    public static Object getType(){
        return player.getItemInHand().getType();
    }
    public static Object getAmount(){
        return player.getItemInHand().getAmount();
    }
    public static void setType(Object type){
        player.getItemInHand().setType(Material.getMaterial((String) type));
    }
    public static void setAmount(Object amount){
        player.getItemInHand().setAmount((Integer) amount);
    }
    public static Object getDisplayName(){
        return player.getItemInHand().getItemMeta().getDisplayName();
    }
    public static Object getName(){
        return player.getItemInHand().getItemMeta().getLocalizedName();
    }
    public static void setDisplayName(Object displayName){
        player.getItemInHand().getItemMeta().setDisplayName((String) displayName);
    }

}
