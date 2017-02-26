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
	Texture button2;

	public MenuScreen(BlueCollarBillionaire game)
	{
		this.game = game;
		button2 = new Texture("badlogic.jpg");
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
		int buttonx = 10;
		int buttony = 10;
		game.batch.draw(button2, buttonx, buttony);
		Rectangle bounds = new Rectangle(buttonx,(768 - button2.getHeight()) - buttony,button2.getWidth(),button2.getHeight());
		if(bounds.contains(tmp))
		{
			if(Gdx.input.isButtonPressed(Input.Buttons.LEFT))
			{
				game.setScreen(new PlayScreen(game));
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
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height)
	{
		// TODO Auto-generated method stub
		
	}

}
