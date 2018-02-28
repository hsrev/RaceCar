package com.husrevsgame.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by husrev on 27.2.2018.
 */

public abstract class State
{
    protected OrthographicCamera camera;


    public State()
    {
        camera = new OrthographicCamera();
        camera.setToOrtho(true,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
    }
//kullanıcı implement etmek zorunda kalsın diye abstract yaptı. .Ne anlama geldiğinin bilmiyorum
    public abstract void render(SpriteBatch sb);
    public abstract void update();
}
