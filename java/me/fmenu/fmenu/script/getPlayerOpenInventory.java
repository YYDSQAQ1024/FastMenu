package me.fmenu.fmenu.script;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class getPlayerOpenInventory {
    public static Player player;
    public static Object getTitle(){
        return player.getOpenInventory().getTitle();
    }
    public static Object getItem(int slot){
        return player.getOpenInventory().getItem(slot);
    }
    public static void setItem(int slot,Object item){
        player.getOpenInventory().setItem(slot, (ItemStack) item);
    }
    public static void addItem(Object item){
        player.getOpenInventory().getTopInventory().addItem((ItemStack) item);
    }
}
