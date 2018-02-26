package com.husrevsgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.husrevsgame.States.PlayState;
import com.husrevsgame.States.StateManager;

public class RaceCar extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;


	public static int WIDTH=480;
	public static int HEIGHT=800;

	public static String TITLE="Race Car";

	public static StateManager sm;

	public void create ()
	{
		sm=new StateManager();
		sm.pushState(new PlayState());
	}

	public void render()
	{
		sm.render();//çizer
		sm.update();//günceller

	}

	public  void dispose()
	{

	}

}
