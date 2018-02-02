package com.hainet.gamer;

// Memento role
public class Memento {

    private int STR;
    private int INT;
    private int PIE;
    private int VIT;
    private int AGI;
    private int LUC;

    Memento(final int STR, final int INT, final int PIE, final int VIT, final int AGI, final int LUC) {
        this.STR = STR;
        this.INT = INT;
        this.PIE = PIE;
        this.VIT = VIT;
        this.AGI = AGI;
        this.LUC = LUC;
    }

    public int getSTR() {
        return STR;
    }

    public int getINT() {
        return INT;
    }

    public int getPIE() {
        return PIE;
    }

    public int getVIT() {
        return VIT;
    }

    public int getAGI() {
        return AGI;
    }

    public int getLUC() {
        return LUC;
    }
}
