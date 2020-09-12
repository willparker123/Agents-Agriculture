package agentsmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.I18n;

public class GuiSeedExtractor extends GuiContainer
{
	public static final ResourceLocation seedextractortexture = new ResourceLocation("modguiseedextractor" + ":" + "textures/gui/seedextractor.png");
	
	public TileEntitySeedExtractor seedExtractor;
	
	public GuiSeedExtractor(InventoryPlayer inventoryPlayer, TileEntitySeedExtractor entity)
	{
		super(new ContainerSeedExtractor(inventoryPlayer, entity));
		
		this.seedExtractor = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.seedExtractor.isInvNameLocalized() ? this.seedExtractor.getInvName() : this.seedExtractor.getInvName();
		
		this.fontRenderer.drawString(name, this.xSize / 2 - this.fontRenderer.getStringWidth(name) / 2, 6, 4210752);
		this.fontRenderer.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(seedextractortexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        
        if(this.seedExtractor.isBurning())
        {
        	int k = this.seedExtractor.getBurnTimeRemainingScaled(12);
        	this.drawTexturedModalRect(guiLeft + 27, guiTop + 36 + 12 - k, 176 , 12 - k, 14, k + 2);
        }
        
        int k = this.seedExtractor.getCookProgressScaled(68);
        this.drawTexturedModalRect(guiLeft + 50, guiTop + 30, 176 , 14, k + 1, 26);
	}

}
