package com;

public class StateAcceptA extends State {
    protected StateContext context;
    protected boolean accept = true;

    StateAcceptA(StateContext context) {
        this.context = context;
    }

    public void actionA() {
        context.setState(this);
    }

    public void actionB() {
        context.setState(new StateRejectB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}