package com.husrevsgame.States;

/**
 * Created by husrev on 27.2.2018.
 */

public abstract class State
{
    public State()
    {

    }
//kullanıcı implement etmek zorunda kalsın diye abstract yaptı. .Ne anlama geldiğinin bilmiyorum
    public abstract void render();
    public abstract void update();



}
