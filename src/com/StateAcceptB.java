package com;

public class StateAcceptB extends State {
    protected StateContext context;
    protected boolean accept = true;

    StateAcceptB(StateContext context) {
        this.context = context;
    }

    public void actionA() {
        context.setState(new StateRejectA(context));
    }

    public void actionB() {
        context.setState(this);
    }

    public boolean isAccept() {
        return this.accept;
    }
}