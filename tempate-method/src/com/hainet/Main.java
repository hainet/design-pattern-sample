package com.hainet;

import com.hainet.concrete.AsterDisplay;
import com.hainet.concrete.ParenDisplay;
import com.hainet.template.Display;

// Client Role
public class Main {

    public static void main(String[] args) {
        Display paren = new ParenDisplay("Paren");
        paren.display();

        Display aster = new AsterDisplay("Aster");
        aster.display();
    }
}
