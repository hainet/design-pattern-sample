package com.hainet.gamer;

import java.util.Random;

// Originator role
public class WizardryGamer {

    private int STR;
    private int INT;
    private int PIE;
    private int VIT;
    private int AGI;
    private int LUC;

    {
        STR = 15;
        INT = 15;
        PIE = 15;
        VIT = 15;
        AGI = 15;
        LUC = 15;
    }

    private static final int GROWTH = 3 + 1;

    private Random random = new Random();

    public void levelUp() {
        if (this.STR <= 18) {
            this.STR += random.nextInt(GROWTH);
        }
        if (this.STR >= 0) {
            this.STR -= random.nextInt(GROWTH);
        }
        if (this.STR > 18) {
            this.STR = 18;
        }
        if (this.STR < 0) {
            this.STR = 0;
        }

        if (this.INT <= 18) {
            this.INT += random.nextInt(GROWTH);
        }
        if (this.INT >= 0) {
            this.INT -= random.nextInt(GROWTH);
        }
        if (this.INT > 18) {
            this.INT = 18;
        }
        if (this.INT < 0) {
            this.INT = 0;
        }

        if (this.PIE <= 18) {
            this.PIE += random.nextInt(GROWTH);
        }
        if (this.PIE >= 0) {
            this.PIE -= random.nextInt(GROWTH);
        }
        if (this.PIE > 18) {
            this.PIE = 18;
        }
        if (this.PIE < 0) {
            this.PIE = 0;
        }

        if (this.VIT <= 18) {
            this.VIT += random.nextInt(GROWTH);
        }
        if (this.VIT >= 0) {
            this.VIT -= random.nextInt(GROWTH);
        }
        if (this.VIT > 18) {
            this.VIT = 18;
        }
        if (this.VIT < 0) {
            this.VIT = 0;
        }

        if (this.AGI <= 18) {
            this.AGI += random.nextInt(GROWTH);
        }
        if (this.AGI >= 0) {
            this.AGI -= random.nextInt(GROWTH);
        }
        if (this.AGI > 18) {
            this.AGI = 18;
        }
        if (this.AGI < 0) {
            this.AGI = 0;
        }

        if (this.LUC <= 18) {
            this.LUC += random.nextInt(GROWTH);
        }
        if (this.LUC >= 0) {
            this.LUC -= random.nextInt(GROWTH);
        }
        if (this.LUC > 18) {
            this.LUC = 18;
        }
        if (this.LUC < 0) {
            this.LUC = 0;
        }

        System.out.println(
                "STR:" + this.STR + "\t" +
                "INT:" + this.INT + "\t" +
                "PIE:" + this.PIE + "\t" +
                "VIT:" + this.VIT + "\t" +
                "AGI:" + this.AGI + "\t" +
                "LUC:" + this.LUC);
    }

    public Memento save() {
        return new Memento(this.STR, this.INT, this.PIE, this.INT, this.AGI, this.LUC);
    }

    public void load(final Memento memento) {
        this.STR = memento.getSTR();
        this.INT = memento.getINT();
        this.PIE = memento.getPIE();
        this.VIT = memento.getVIT();
        this.AGI = memento.getAGI();
        this.LUC = memento.getLUC();
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
