package glassdoor;

import glassdoor.block.BlockSuperglass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
	
	//erstellt Superglass
	public static Block blocksuperglass;
	
	@PreInit
	public void preinit(FMLPreInitializationEvent evt){
		//Superglass mit Daten belegen
		blocksuperglass = new BlockSuperglass(3000, Material.glass).setBlockName("Superglass");
	}
	
	@Init
	public void init(FMLInitializationEvent evt){
		//Superglass registrieren
		GameRegistry.registerBlock(blocksuperglass, "Superglass");
		//Superglass benennen
		LanguageRegistry.addName(blocksuperglass, "Superglass");
	}
	
	@PostInit
	public void postinit(FMLPostInitializationEvent evt){
		
	}
	
	@Instance
	public static ModGlassdoor instance;
	
}
