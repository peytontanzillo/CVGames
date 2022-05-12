package org.cubeville.cvgames.vartypes;

import org.bukkit.entity.Player;
import org.cubeville.cvgames.managers.SignManager;

import javax.annotation.Nullable;

public class GameVariableQueueSign extends GameVariableSign {

	@Override
	public void setItem(Player player, String input, String arenaName)
		throws Error {
		super.setItem(player, input, arenaName);
		SignManager.addSign(sign, arenaName);
	}

	@Override
	public void setItem(@Nullable String string, String arenaName) {
		super.setItem(string, arenaName);
		SignManager.addSign(sign, arenaName);
	}
}
