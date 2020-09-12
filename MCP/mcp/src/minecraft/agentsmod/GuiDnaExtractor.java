package agentsmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.I18n;

public class GuiDnaExtractor extends GuiContainer
{
	public static final ResourceLocation dnaextractortexture = new ResourceLocation("modguidnaextractor" + ":" + "textures/gui/dnaextractor.png");
	
	public TileEntityDnaExtractor dnaExtractor;
	
	public GuiDnaExtractor(InventoryPlayer inventoryPlayer, TileEntityDnaExtractor entity)
	{
		super(new ContainerDnaExtractor(inventoryPlayer, entity));
		
		this.dnaExtractor = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.dnaExtractor.isInvNameLocalized() ? this.dnaExtractor.getInvName() : this.dnaExtractor.getInvName();
		
		this.fontRenderer.drawString(name, this.xSize / 2 - this.fontRenderer.getStringWidth(name) / 2, 6, 4210752);
		this.fontRenderer.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(dnaextractortexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        
        if(this.dnaExtractor.isBurning())
        {
        	int k = this.dnaExtractor.getBurnTimeRemainingScaled(12);
        	this.drawTexturedModalRect(guiLeft + 27, guiTop + 36 + 12 - k, 176 , 12 - k, 14, k + 2);
        }
        
        int k = this.dnaExtractor.getCookProgressScaled(73);
        this.drawTexturedModalRect(guiLeft + 48, guiTop + 31, 176, 14, k + 1, 26);
	}

}
