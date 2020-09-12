package agentsmod;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenPlants implements IWorldGenerator 
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

		if(b1.biomeName.equals("Swampland"))
		{
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.cornPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 2; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.onionPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1.6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.peppersPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 0.6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.walnutPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
			// Then we have plains!
		}



		if(b1.biomeName.equals("Plains"))
		{
			for(int i = 0; i < 0.6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.cornPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 5; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass2.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lavenderPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.parsleyPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
			// Then we have plains!
		}



		if(b1.biomeName.equals("Extreme Hills"))
		{
			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("Extreme Hills Edge"))
		{
			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 0.8; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
			
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.parsleyPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lavenderPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("River"))
		{
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass2.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("Ocean"))
		{
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.seaweed.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
			// Then we have plains!
		}



		if(b1.biomeName.equals("Beach"))
		{
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.seaweed.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
			// Then we have plains!
		}



		if(b1.biomeName.equals("Jungle"))
		{
			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lettucePlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 2; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.pepperPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.peppersPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.tobaccoPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.walnutPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 0.6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.weedPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("JungleHills"))
		{
			for(int i = 0; i < 4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.peppersPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 2; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.tobaccoPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.walnutPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.weedPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("Forest"))
		{
			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lavenderPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 0.6; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lettucePlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 0.5; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.parsleyPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.pepperPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 1.4; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.strawberryPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}



		if(b1.biomeName.equals("ForestHills"))
		{
			for(int i = 0; i < 0.8; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.grass3.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 3; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.lavenderPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}

			for(int i = 0; i < 2; i++)
			{
				int randPosX = chunkX + random.nextInt(16) + 8;
				int randPosY = random.nextInt(128);
				int randPosZ = chunkZ + random.nextInt(16) + 8;
				(new WorldGenFlowers(ModCrops.strawberryPlant.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
			}
		}
	}




private void generateNether(World world, Random random, int blockX, int blockZ) 
{

}
}
