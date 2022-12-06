package com;

public class StateReject extends State{
    protected StateContext context;
    protected boolean accept = false;

    StateReject(StateContext context) {
        this.context = context;
    }

    public void actionA() {
        context.setState(new StateAcceptA(context));
    }

    public void actionB() {
        context.setState(new StateAcceptB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}