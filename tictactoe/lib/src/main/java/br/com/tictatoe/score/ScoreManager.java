package br.com.tictatoe.score;

import java.io.IOException;

import br.com.tictatoe.core.Player;

public interface ScoreManager {

	public Integer getScore(Player player);

	public void saveScore(Player player) throws IOException;

}


