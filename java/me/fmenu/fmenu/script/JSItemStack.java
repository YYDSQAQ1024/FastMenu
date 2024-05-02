package me.fmenu.fmenu.script;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class JSItemStack {
    public static Object getItemStack(Object name){
        return new ItemStack(Material.getMaterial((String) name));
    }
    public static Object getType(Object itemStack){
        ItemStack itemStack1 = (ItemStack) itemStack;
        return itemStack1.getType();
    }
    public static Object getItemMeta(Object itemStack){
        ItemStack itemStack1 = (ItemStack) itemStack;
        return itemStack1.getItemMeta();
    }
}
