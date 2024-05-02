package me.fmenu.fmenu.script;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class getPlayerInventory {
    public static Player player;
    public static Object contains(Object object){
        return player.getInventory().contains(Material.getMaterial((String) object));
    }
    public static Object containsAtLeast(Object object,int object1){
        return player.getInventory().containsAtLeast(new ItemStack(Material.getMaterial((String) object)),object1);
    }
    public static Object first(Object object){
        return player.getInventory().first(Material.getMaterial((String) object));
    }
    public static Object firstEmpty(){
        return player.getInventory().firstEmpty();
    }
    public static Object getItem(int slot){
        return player.getInventory().getItem(slot);
    }
    public static void setItem(int slot,Object item){
        player.getInventory().setItem(slot, (ItemStack) item);
    }
    public static void addItem(Object item){
        player.getInventory().addItem((ItemStack) item);
    }
}
