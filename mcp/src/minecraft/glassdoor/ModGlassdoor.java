package glassdoor;

import glassdoor.block.BlockAdamantiumOre;
import glassdoor.item.ItemAdamantiumIngot;
import glassdoor.item.ItemAdamantiumSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//Mod Daten
/**
 * Main Mod Class
 * @author Jerendil
 *
 */
@Mod(modid = "mod_glassdoor",name = "ModGlassdoor",version = "0.0.1")

public class ModGlassdoor {
	
	//Phasen der Mod Erstellung
	
	//erstellt Block
	public static Block blockadamantiumore;
	public static Item itemadamantiumingot;
	public static Item itemadamantiumsword;
	
	@PreInit
	public void preinit(FMLPreInitializationEvent evt){
		//Block mit Daten belegen
		blockadamantiumore = new BlockAdamantiumOre(3000).setBlockName("Adamantium Ore");
		//Item mit Daten belegen
		itemadamantiumingot = new ItemAdamantiumIngot(30000).setItemName("Adamantium Ingot");
		itemadamantiumsword = new ItemAdamantiumSword(30001).setItemName("Adamantium Sword");
	}
	
	@Init
	public void init(FMLInitializationEvent evt){
		//WorldGen registrieren
		GameRegistry.registerWorldGenerator(new WorldGen());
		//Block registrieren
		GameRegistry.registerBlock(blockadamantiumore, "Adamantium Ore");
		//Block benennen
		LanguageRegistry.addName(blockadamantiumore, "Adamantium Ore");
		//Item benennen
		LanguageRegistry.addName(itemadamantiumingot, "Adamantium Ingot");
		LanguageRegistry.addName(itemadamantiumsword, "Adamantium Sword");
	}
	
	@PostInit
	public void postinit(FMLPostInitializationEvent evt){
		//Schmelz Rezepte einführen
		GameRegistry.addSmelting(blockadamantiumore.blockID, new ItemStack(itemadamantiumingot), 5);
		GameRegistry.addRecipe(new ItemStack(itemadamantiumsword), new Object[]
				{
					" A ", " A "," S ",
					Character.valueOf('A'), itemadamantiumingot,
					Character.valueOf('S'), Item.stick
				});
	}
	
	@Instance
	public static ModGlassdoor instance;
	
}
