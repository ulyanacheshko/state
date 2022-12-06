package com;

public abstract class State {
    protected StateContext context;
    protected boolean accept = false;

    public void actionA() {}

    public void actionB() {}

    public boolean isAccept() {
        return this.accept;
    }
}