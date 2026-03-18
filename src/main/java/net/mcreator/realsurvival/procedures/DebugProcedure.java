package net.mcreator.realsurvival.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.realsurvival.network.RealSurvivalModVariables;

public class DebugProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_block_break_speed + "" + entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_block_interaction_range
				+ entity.getData(RealSurvivalModVariables.PLAYER_VARIABLES).player_entity_interaction_range;
	}
}