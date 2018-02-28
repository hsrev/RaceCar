package com.husrevsgame.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.husrevsgame.imageloader.imageloader;

/**
 * Created by husrev on 27.2.2018.
 */

public class PlayState extends State
{

    public void render(SpriteBatch sb)
    {
        sb.setProjectionMatrix(camera.combined); //Stritebatch cameraya göre çizlecek.
        sb.begin();
        sb.draw(imageloader.textReg,50,50,100,100);

        sb.end();
    }

    public void update()
    {

    }



}
