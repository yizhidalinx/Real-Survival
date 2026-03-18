package net.mcreator.realsurvival.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.realsurvival.network.RealSurvivalModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PLAYERProcedure {
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
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.BLOCK_BREAK_SPEED))
			_livingEntity0.getAttribute(Attributes.BLOCK_BREAK_SPEED).setBaseValue(entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_block_break_speed);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.BLOCK_INTERACTION_RANGE))
			_livingEntity1.getAttribute(Attributes.BLOCK_INTERACTION_RANGE).setBaseValue(entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_block_interaction_range);
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
			_livingEntity2.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_entity_interaction_range);
	}
}