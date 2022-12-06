package com;

public class StateContext {
    private State stateAcceptA;
    private State stateRejectA;
    private State stateAcceptB;
    private State stateRejectB;
    private State stateReject;
    private State currState;

    public StateContext() {
        stateAcceptA = new StateAcceptA(this);
        stateAcceptB = new StateAcceptB(this);
        stateRejectA = new StateRejectA(this);
        stateRejectB = new StateRejectB(this);
        stateReject = new StateReject(this);
        currState = stateReject;
    }

    public void actionA() {
        currState.actionA();
    }

    public void actionB() {
        currState.actionB();
    }

    public boolean isAccept() {
        return currState.isAccept();
    }

    public void setState(State state) {
        this.currState = state;
    }
}