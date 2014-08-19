package var.creativetabs;

import var.item.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DevinemagikTab extends CreativeTabs {

	public DevinemagikTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ItemManager.magicStaff;
	}

}
