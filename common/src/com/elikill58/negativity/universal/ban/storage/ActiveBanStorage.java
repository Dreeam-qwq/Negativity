package com.elikill58.negativity.universal.ban.storage;

import java.util.List;
import java.util.UUID;

import org.checkerframework.checker.nullness.qual.Nullable;

import com.elikill58.negativity.universal.ban.Ban;

/**
 * A class responsible for loading and saving active bans.
 * <p>
 * Implementations must not retain any state since they can be replaced at any time,
 * caching is fine as long as it does not require saving cached values implicitly.
 */
public interface ActiveBanStorage {

	/**
	 * Loads the active ban of the player identified by the given UUID.
	 *
	 * @param playerId the UUID of a player.
	 *
	 * @return the active ban of the player, or {@code null} if the player is not banned
	 */
	@Nullable
	Ban load(UUID playerId);

	/**
	 * Saves the given active ban.
	 *
	 * @param ban the active ban to save.
	 */
	void save(Ban ban);

	/**
	 * Removes the ban associated to the player identified by the given UUID.
	 *
	 * @param playerId the UUID of the player
	 */
	void remove(UUID playerId);
	
	/**
	 * Get all active ban on given IP
	 * 
	 * @param ip which we are looking for bans
	 * @return all active ban on ip
	 */
	List<Ban> loadBanOnIP(String ip);

	/**
	 * Get all active bans
	 * 
	 * @return all active bans
	 */
	List<Ban> getAll();
}
