package com.husrevsgame.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by husrev on 28.2.2018.
 */

public class imageloader
{
    public static Texture text;
    public static TextureRegion textReg;

    public static void load()
    {
        text=new Texture(Gdx.files.internal("car.png"));
        textReg=new TextureRegion(text,0,0,text.getWidth(),text.getHeight());
        textReg.flip(true,true);
    }
    public static void dispose()
    {
        text.dispose();
    }


}
