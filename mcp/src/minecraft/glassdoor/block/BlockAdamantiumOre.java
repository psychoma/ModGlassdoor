package glassdoor.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAdamantiumOre extends BlockOre{

	public BlockAdamantiumOre(int id) {
		//ruft Konstruktor von BlockOre auf : BlockID/Position in der tex.png
		super(id, 0);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0F);
	}
	
	@Override
	public String getTextureFile(){
		return "/glassdoor/textures/block.png";
	}
	
}
