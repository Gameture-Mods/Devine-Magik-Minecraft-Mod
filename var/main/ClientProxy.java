package var.main;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends var.main.ServerProxy{
	public void registerRenderThings() {
		//Render things here!
	}
	
	public int addArmor (String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
