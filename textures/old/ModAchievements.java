
package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModAchievements", name="Agent's Mod", version="Alpha")
public class ModAchievements {

	public static final String modid = "ModAchievements";

	//.setSpecial() makes the achievement have a spiky boarder
	public static Achievement jaffaAchieve;
	public static Achievement jamAchieve;
	public static Achievement pbjtAchieve;
	public static Achievement eggAchieve;
	public static Achievement bunsAchieve;
	public static Achievement salamiAchieve;
	public static Achievement weedAchieve;
	public static Achievement russianAchieve;
	public static Achievement kfcAchieve;
	public static Achievement ashAchieve;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{

	}
	@EventHandler
	public void load (FMLInitializationEvent event)
	{
		jaffaAchieve = new Achievement(6000, "jaffaAchieve", 6, 8, ModFood.biscuitjaffa, null).setSpecial().registerAchievement();
		jamAchieve = new Achievement(6001, "jamAchieve", 7, 7, ModFood.buttiejam, null).setSpecial().registerAchievement();
		pbjtAchieve = new Achievement(6002, "pbjtAchieve", 8, 8, ModTools.baseballbat, null).setSpecial().registerAchievement();
		eggAchieve = new Achievement(6003, "eggAchieve", 9, 7, ModFood.eggScrambled, null).setSpecial().registerAchievement();
		bunsAchieve = new Achievement(6004, "bunsAchieve", 10, 8, ModFood.bun, null).setSpecial().registerAchievement();
		salamiAchieve = new Achievement(6005, "salamiAchieve", 11, 7, ModFood.pepperoni, null).setSpecial().registerAchievement();
		weedAchieve = new Achievement(6006, "weedAchieve", 12, 8, ModFruits.weed, null).setSpecial().registerAchievement();
		russianAchieve = new Achievement(6007, "russianAchieve", 13, 7, ModFood.vodkabasic, null).setSpecial().registerAchievement();
		kfcAchieve = new Achievement(6008, "kfcAchieve", 14, 8, ModFood.friedchickenpack, null).setSpecial().registerAchievement();
		ashAchieve = new Achievement(6009, "ashAchieve", 15, 7, ModFruits.ash, null).setSpecial().registerAchievement();

		this.addAchievementName("jaffaAchieve", "Simon's Favourite Treat");
		this.addAchievementDesc("jaffaAchieve", "I'm a Dwarf and I'm digging a hole, diggy DIGGY HOLE! \247b-Honeydew");
		this.addAchievementName("jamAchieve", "JAM SANDWICH?!?!");
		this.addAchievementDesc("jamAchieve", "HAVE YOU GOT ANY JAM SANDWICHES!?!?! \247b-Brian Blessed");
		this.addAchievementName("eggAchieve", "SCRAAAAMMBLEED!!!");
		this.addAchievementDesc("eggAchieve", "I JUST SHOUT AT THEM! \247b-Brian Blessed");
		this.addAchievementName("pbjtAchieve", "It's Peanut Butter Jelly Time");
		this.addAchievementDesc("pbjtAchieve", "Peanut-butter-jelly, Peanut-butter-jelly, Peanut-butter-jelly and a Baseball Bat");
		this.addAchievementName("bunsAchieve", "Floury Baps");
		this.addAchievementDesc("bunsAchieve", "Make some Hot Buns");
		this.addAchievementName("salamiAchieve", "Sam's Favourite Toy");
		this.addAchievementDesc("salamiAchieve", "*Insert rude joke here about the Alpha sprite*");
		this.addAchievementName("weedAchieve", "Higher than the Empire State");
		this.addAchievementDesc("weedAchieve", "I was gonna clean mah room, but then I got high!");
		this.addAchievementName("russianAchieve", "Russian Style");
		this.addAchievementDesc("russianAchieve", "Down a bucket of Vodka");
		this.addAchievementName("kfcAchieve", "Finger Lickin' Good");
		this.addAchievementDesc("kfcAchieve", "Make some delicious Fried Chicken");
		this.addAchievementName("ashAchieve", "Gotta Ketch'um All");
		this.addAchievementDesc("ashAchieve", "Make Ash");
		/*/
		LanguageRegistry.instance().addStringLocalization("achievement.jamAchieve", "en_US", "JAM SANDWICH?!?!");
		LanguageRegistry.instance().addStringLocalization("achievement.jamAchieve.desc", "en_US", "HAVE YOU GOT ANY JAM SANDWICHES!?!?! \247b-Brian Blessed");
	/*/
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// this is the post initialization.
	}

	private void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event)
	{

	}

}