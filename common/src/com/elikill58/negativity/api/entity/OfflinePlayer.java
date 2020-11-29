package com.elikill58.negativity.api.entity;

import java.util.UUID;

import com.elikill58.negativity.api.location.Location;
import com.elikill58.negativity.api.location.Vector;

public interface OfflinePlayer extends Entity {

	UUID getUniqueId();
	
	boolean isOnline();
	
	boolean hasPlayedBefore();
	
	@Override
	default boolean isOnGround() {
		return true;
	}
	
	@Override
	default Location getLocation() {
		return null;
	}
	
	@Override
	default EntityType getType() {
		return EntityType.PLAYER;
	}

	@Override
	default Location getEyeLocation() {
		return null;
	}

	@Override
	default Vector getRotation() {
		return null;
	}

	@Override
	default void sendMessage(String msg) {}
	
	@Override
	default int getEntityId() {
		return 0;
	}
	
	@Override
	default double getEyeHeight() {
		return 0;
	}
}
