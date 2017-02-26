package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.MenuScreen;;

//extends game instead to make multiple screens
public class BlueCollarBillionaire extends Game
{
	// public so screens can access it
	public SpriteBatch batch;

	@Override
	public void create()
	{
		batch = new SpriteBatch();
		setScreen(new MenuScreen(this));
	}

	@Override
	public void render()
	{
		// renders to whatever screen is active
		super.render();
	}

}
