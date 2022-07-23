package com.pigpig105.modid;

import com.pigpig105.modid.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("pigpig105")
public class pigpig105 {
	
	public static final String MOD_ID = "pigpig105";
	
	public static final CreativeModeTab PIGPIG_TAB = new CreativeModeTab(MOD_ID) {	
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public pigpig105() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
