package agentsmod;
 
import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
 
import cpw.mods.fml.common.IWorldGenerator;
 
public class WorldGenGrass1 implements IWorldGenerator 
 {
	
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
   switch (world.provider.dimensionId)
   {
    case -1: generateNether(world, random, chunkX*16, chunkZ*16);
    case 0: generateSurface(world, random, chunkX*16, chunkZ*16, random, world, chunkProvider, chunkProvider);
   }
  }


 private void generateSurface(World world, Random rand, int chunkX, int chunkZ, Random random, World world1, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
  {
	 BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
		if(b.biomeName.equals("Plains"))
		{
		for(int i = 0; i < 8; i++)
		{
			int randPosX = chunkX + random.nextInt(16) + 8;
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16) + 8;
			(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		}
		
		if(b.biomeName.equals("Extreme Hills"))
		{
		for(int i = 0; i < 16; i++)
		{
			int randPosX = chunkX + random.nextInt(16) + 8;
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16) + 8;
			(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		}
		
		if(b.biomeName.equals("Extreme Hills Edge"))
		{
		for(int i = 0; i < 16; i++)
		{
			int randPosX = chunkX + random.nextInt(16) + 8;
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16) + 8;
			(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		}
	}
  
  
 private void generateNether(World world, Random random, int blockX, int blockZ) 
  {
   
 }
 }
 