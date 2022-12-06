package com;
public class StateRejectA extends State{
    protected StateContext context;
    protected boolean accept = false;

    StateRejectA(StateContext context) {
        this.context = context;
    }

    public void actionA() {
        context.setState(this);
    }

    public void actionB() {
        context.setState(new StateAcceptB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}