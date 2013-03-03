package glassdoor.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAdamantiumIngot extends Item{

	public ItemAdamantiumIngot(int id){
		//ruft Konstruktor von Item auf
		super(id);
		//Position in der tex.png
		this.iconIndex = 0;
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	//dateipfad der Textur
	@Override
	public String getTextureFile(){
		return "/glassdoor/textures/item.png";
	}
}
