package glassdoor.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSuperglass extends Block{

	public BlockSuperglass(int id, Material material) {
		super(id, material);
		this.blockIndexInTexture = 0;
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0F);
		
	}
	
}
