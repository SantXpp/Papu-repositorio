package net.mcreator.cbdecor.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cbdecor.world.inventory.Gui1Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Gui1Screen extends AbstractContainerScreen<Gui1Menu> {
	private final static HashMap<String, Object> guistate = Gui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_iniciar_animacion;
	Button button_detener_animacion;
	Button button_agregar_npc;
	Button button_eliminar_npc;
	ImageButton imagebutton_oro;
	ImageButton imagebutton_cb_remera;

	public Gui1Screen(Gui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("cbdecor_:textures/screens/gui_1.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cbdecor_:textures/screens/button_base.png"), this.leftPos + 116, this.topPos + -49, 0, 0, 20, 20, 20, 20);

		guiGraphics.blit(new ResourceLocation("cbdecor_:textures/screens/button_base.png"), this.leftPos + 152, this.topPos + -49, 0, 0, 20, 20, 20, 20);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.cbdecor_.gui_1.label_traje"), 129, -67, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_iniciar_animacion = Button.builder(Component.translatable("gui.cbdecor_.gui_1.button_iniciar_animacion"), e -> {
		}).bounds(this.leftPos + 89, this.topPos + -13, 114, 20).build();
		guistate.put("button:button_iniciar_animacion", button_iniciar_animacion);
		this.addRenderableWidget(button_iniciar_animacion);
		button_detener_animacion = Button.builder(Component.translatable("gui.cbdecor_.gui_1.button_detener_animacion"), e -> {
		}).bounds(this.leftPos + 89, this.topPos + 14, 114, 20).build();
		guistate.put("button:button_detener_animacion", button_detener_animacion);
		this.addRenderableWidget(button_detener_animacion);
		button_agregar_npc = Button.builder(Component.translatable("gui.cbdecor_.gui_1.button_agregar_npc"), e -> {
		}).bounds(this.leftPos + 107, this.topPos + 41, 82, 20).build();
		guistate.put("button:button_agregar_npc", button_agregar_npc);
		this.addRenderableWidget(button_agregar_npc);
		button_eliminar_npc = Button.builder(Component.translatable("gui.cbdecor_.gui_1.button_eliminar_npc"), e -> {
		}).bounds(this.leftPos + 107, this.topPos + 68, 87, 20).build();
		guistate.put("button:button_eliminar_npc", button_eliminar_npc);
		this.addRenderableWidget(button_eliminar_npc);
		imagebutton_oro = new ImageButton(this.leftPos + 118, this.topPos + -47, 16, 16, 0, 0, 16, new ResourceLocation("cbdecor_:textures/screens/atlas/imagebutton_oro.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_oro", imagebutton_oro);
		this.addRenderableWidget(imagebutton_oro);
		imagebutton_cb_remera = new ImageButton(this.leftPos + 154, this.topPos + -47, 16, 16, 0, 0, 16, new ResourceLocation("cbdecor_:textures/screens/atlas/imagebutton_cb_remera.png"), 16, 32, e -> {
		});
		guistate.put("button:imagebutton_cb_remera", imagebutton_cb_remera);
		this.addRenderableWidget(imagebutton_cb_remera);
	}
}
