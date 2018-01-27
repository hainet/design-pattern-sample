package com.hainet;

import com.hainet.element.BigCompany;
import com.hainet.element.SmallCompany;
import com.hainet.visitor.CountVisitor;
import com.hainet.visitor.ListVisitor;

// Client role
public final class Main {

    public static void main(final String[] args) {
        final BigCompany bigCompany = new BigCompany("Big company");
        final BigCompany middleCompany = new BigCompany("Middle company");
        final SmallCompany smallCompany = new SmallCompany("Small company");

        // Big company
        bigCompany.add(middleCompany);
        bigCompany.add(smallCompany);
        bigCompany.add(smallCompany);

        // Middle company
        middleCompany.add(smallCompany);
        middleCompany.add(smallCompany);

        final ListVisitor listVisitor = new ListVisitor();
        System.out.println("Big company + List visitor");
        bigCompany.accept(listVisitor);
        System.out.println("Middle company + List visitor");
        middleCompany.accept(listVisitor);
        System.out.println("Small company + List visitor");
        smallCompany.accept(listVisitor);

        final CountVisitor countVisitor = new CountVisitor();
        System.out.println("Big company + Count visitor");
        bigCompany.accept(countVisitor);
        System.out.println("Middle company + Count visitor");
        middleCompany.accept(countVisitor);
        System.out.println("Small company + Count visitor");
        smallCompany.accept(countVisitor);
    }
}
