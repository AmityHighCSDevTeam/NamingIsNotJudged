package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.BlueCollarBillionaire;

import screens.PlayScreen;

public class MenuScreen implements Screen
{
	// imports the class
	private BlueCollarBillionaire game;
	Texture play;
	Texture exit;

	public MenuScreen(BlueCollarBillionaire game)
	{
		this.game = game;
		play = new Texture("play.png");
		exit = new Texture("exit.png");
	}

	@Override
	public void show()
	{
		
	}

	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0, 0.1f, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		Vector2 tmp = new Vector2(Gdx.input.getX(),Gdx.input.getY());
		int playx = (1366/2) - (play.getWidth()/2);
		int playy = 766/2;
		game.batch.draw(play, playx, playy);
		Rectangle playbounds = new Rectangle(playx,(768 - play.getHeight()) - playy,play.getWidth(),play.getHeight());
		if(playbounds.contains(tmp))
		{
			if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
			{
				game.setScreen(new PlayScreen(game));
			}
		}
		int exitx = (1366/2) - (play.getWidth()/2);
		int exity = (766/2)/2;
		game.batch.draw(exit, exitx, exity);
		Rectangle exitbounds = new Rectangle(exitx,(768 - exit.getHeight()) - exity,exit.getWidth(),exit.getHeight());
		if(exitbounds.contains(tmp))
		{
			if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
			{
				Gdx.app.exit();
			}
		}
		game.batch.end();
		
	}

	@Override
	public void pause()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void resume()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void hide()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose()
	{
		Gdx.app.exit();
	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
		
	}

}
