package com.elikill58.negativity.spigot.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import com.elikill58.negativity.universal.Negativity;
import com.elikill58.negativity.universal.bedrock.BedrockPlayerManager;
import org.spigotmc.event.entity.EntityDismountEvent;

import com.elikill58.negativity.api.events.EventManager;
import com.elikill58.negativity.spigot.impl.entity.SpigotEntityManager;

public class EntityListeners implements Listener {

	@EventHandler
	public void onEntityShoot(EntityShootBowEvent e) {
		if (Negativity.disabledJava && !BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		if (Negativity.disabledBedrock && BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		EventManager.callEvent(new com.elikill58.negativity.api.events.entity.EntityShootBowEvent(SpigotEntityManager.getEntity(e.getEntity())));
	}

	@EventHandler
	public void onProjectileHit(ProjectileHitEvent e) {
		if (Negativity.disabledJava && !BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		if (Negativity.disabledBedrock && BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		EventManager.callEvent(new com.elikill58.negativity.api.events.entity.ProjectileHitEvent(SpigotEntityManager.getEntity(e.getEntity())));
	}

	@EventHandler
	public void onEntityDismount(EntityDismountEvent e) {
		if (Negativity.disabledJava && !BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		if (Negativity.disabledBedrock && BedrockPlayerManager.isBedrockPlayer(e.getEntity().getUniqueId()))
			return;
		EventManager.callEvent(new com.elikill58.negativity.api.events.entity.EntityDismountEvent(SpigotEntityManager.getEntity(e.getEntity()), SpigotEntityManager.getEntity(e.getDismounted())));
	}
}
