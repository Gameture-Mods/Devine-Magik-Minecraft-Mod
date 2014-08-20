package var.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {

	public static void mainRegistry() {
		initializeTabs();
	}
	
	public static CreativeTabs devinemagikTab;
	
	public static void initializeTabs() {
		devinemagikTab = new DevinemagikTab("DevineMagik");
	}
}
