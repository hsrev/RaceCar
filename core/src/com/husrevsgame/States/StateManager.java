package com.husrevsgame.States;

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

    public void render()
    {
        states.peek().render();
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
