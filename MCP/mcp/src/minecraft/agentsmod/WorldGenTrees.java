package agentsmod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTrees implements IWorldGenerator 
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
			    BiomeGenBase b1 = world.getBiomeGenForCoords(chunkX, chunkZ);
			    if(b1.biomeName.equals("Plains"))
			    {
			    	
			    	  for (int n = 0; n < 4; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenLemonTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    	  
			    	  for (int n = 0; n < 8; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenOrangeTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    }
			    
			    if(b1.biomeName.equals("Forest"))
			    {
			    	
			    	  for (int n = 0; n < 4; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenLemonTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    	  
			    	  for (int n = 0; n < 10; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenOrangeTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    	  
			    	  for (int n = 0; n < 36; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenCherryTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    }
			    
			    if(b1.biomeName.equals("Desert"))
			    {
			    	  for (int n = 0; n < 8; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenOliveTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    }
			    
			    if(b1.biomeName.equals("Desert Hills"))
			    {
			    	  for (int n = 0; n < 12; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenOliveTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    }
			    
			    if(b1.biomeName.equals("Plains"))
			    {
			    	  for (int n = 0; n < 0.8; n++) {
			    		   int X = chunkX + random.nextInt(16);
			    		   int Z = chunkZ + random.nextInt(16);
			    		   int Y = random.nextInt(256);
			    		   
			    		   (new WorldGenOliveTree(false)).generate(world, random, X, Y, Z);
			    	  }
			    }
			    }
			    		  
	 
	 
			    	  
			    	  
			    	
			    	  /*/
			    	   for(int i = 0; i < 0.8; i++)

					{
						int randPosX = chunkX + random.nextInt(16) + 8;
						int randPosY = random.nextInt(100);
						int randPosZ = chunkZ + random.nextInt(16) + 8;
						(new WorldGenFlowers(ModCrops.orangeSapling.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
					}
			    }
			    
		    	for(int i = 0; i < 0.4; i++)
				{
					int randPosX = chunkX + random.nextInt(16) + 8;
					int randPosY = random.nextInt(100);
					int randPosZ = chunkZ + random.nextInt(16) + 8;
					(new WorldGenFlowers(ModCrops.lemonSapling.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
				}
		            // Then we have plains!
		    }
		    /*/
			


	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}
}
