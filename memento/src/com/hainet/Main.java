package com.hainet;

import com.hainet.gamer.Memento;
import com.hainet.gamer.WizardryGamer;

// Caretaker role
public class Main {

    public static void main(final String[] args) {
        final WizardryGamer gamer = new WizardryGamer();
        Memento saveData = gamer.save();

        while (true) {
            gamer.levelUp();

            if (all18(gamer)) {
                break;
            }

            if (becomeStrong(gamer, saveData)) {
                saveData = gamer.save();
            }

            if (becomeWeak(gamer, saveData)) {
                gamer.load(saveData);
            }
        }
    }

    private static boolean all18(final WizardryGamer gamer) {
        return
                gamer.getSTR() == 18 &&
                gamer.getINT() == 18 &&
                gamer.getPIE() == 18 &&
                gamer.getVIT() == 18 &&
                gamer.getAGI() == 18 &&
                gamer.getLUC() == 18;
    }

    private static boolean becomeStrong(final WizardryGamer gamer, final Memento memento) {
        return 
                gamer.getSTR() >= memento.getSTR() &&
                gamer.getINT() >= memento.getINT() &&
                gamer.getPIE() >= memento.getPIE() &&
                gamer.getVIT() >= memento.getVIT() &&
                gamer.getAGI() >= memento.getAGI() &&
                gamer.getLUC() >= memento.getLUC();
    }

    private static boolean becomeWeak(final WizardryGamer gamer, final Memento memento) {
        return
                gamer.getSTR() >= memento.getSTR() * 2 / 3 ||
                        gamer.getINT() < memento.getINT() * 2 / 3 ||
                        gamer.getPIE() >= memento.getPIE() * 2 / 3 ||
                        gamer.getVIT() >= memento.getVIT() * 2 / 3 ||
                        gamer.getAGI() >= memento.getAGI() * 2 / 3 ||
                        gamer.getLUC() >= memento.getLUC() * 2 / 3;
    }
}
