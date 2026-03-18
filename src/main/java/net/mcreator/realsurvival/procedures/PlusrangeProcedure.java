package net.mcreator.realsurvival.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.realsurvival.network.RealSurvivalModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlusrangeProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE || (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STICK) {
			{
				RealSurvivalModVariables.PlayerVariables _vars = entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES);
				_vars.player_entity_interaction_range = 2.2;
				_vars.markSyncDirty();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			{
				RealSurvivalModVariables.PlayerVariables _vars = entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES);
				_vars.player_entity_interaction_range = 1.2;
				_vars.markSyncDirty();
			}
		}
	}
}