package agentsmod;

import java.io.File;
import java.net.URL;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventModSounds
{
	@SideOnly(Side.CLIENT)
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event)
	{
		event.manager.addSound("modsounds:whalecry1.ogg");            
		event.manager.addSound("modsounds:whalecry2.ogg");           
		event.manager.addSound("modsounds:whalecry3.ogg");            
		event.manager.addSound("modsounds:whaledeath.ogg");         
		event.manager.addSound("modsounds:whalehurt1.ogg");            
		event.manager.addSound("modsounds:whalehurt2.ogg");
		
		event.manager.addSound("modsounds:mammothcry1.ogg");            
		event.manager.addSound("modsounds:mammothcry2.ogg");           
		event.manager.addSound("modsounds:mammothcry3.ogg");            
		event.manager.addSound("modsounds:mammothdeath.ogg");         
		event.manager.addSound("modsounds:mammothhurt1.ogg");            
		event.manager.addSound("modsounds:mammothhurt2.ogg");
		event.manager.addSound("modsounds:mammothhurt3.ogg");
		
		event.manager.addSound("modsounds:mammothzombiecry1.ogg");            
		event.manager.addSound("modsounds:mammothzombiecry2.ogg");           
		event.manager.addSound("modsounds:mammothzombiecry3.ogg");            
		event.manager.addSound("modsounds:mammothzombiedeath.ogg");         
		event.manager.addSound("modsounds:mammothzombiehurt1.ogg");            
		event.manager.addSound("modsounds:mammothzombiehurt2.ogg");
		event.manager.addSound("modsounds:mammothzombiehurt3.ogg");
	}
}