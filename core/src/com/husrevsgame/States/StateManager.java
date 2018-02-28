package com.husrevsgame.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by husrev on 27.2.2018.
 */

public class StateManager
{
    private Stack<State> states;

    public StateManager()
    {
        states=new Stack<State>();

    }

    public void render(SpriteBatch sb)
    {
        states.peek().render(sb);
    }

    public void update()
    {
        states.peek().update();
    }
    public void pushState(State state)
    {
        states.push(state);
    }
    public void popState()
    {
        states.pop();
    }
}
