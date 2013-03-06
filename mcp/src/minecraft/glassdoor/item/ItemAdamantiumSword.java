package glassdoor.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemAdamantiumSword extends ItemSword{

	public ItemAdamantiumSword(int id){
		//ruft Konstruktor von ItemSword auf: ID/
		super(id, EnumToolMaterial.EMERALD);
		//Position in der tex.png
		this.iconIndex = 1;
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	//dateipfad der Textur
	@Override
	public String getTextureFile(){
		return "/glassdoor/textures/item.png";
	}
}
