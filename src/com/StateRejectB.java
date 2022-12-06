package com;

public class StateRejectB extends State{
    protected StateContext context;
    protected boolean accept = false;

    StateRejectB(StateContext context) {
        this.context = context;
    }

    public void actionA() {
        context.setState(new StateAcceptA(context));
    }

    public void actionB() {
        context.setState(this);
    }

    public boolean isAccept() {
        return this.accept;
    }
}