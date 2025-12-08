package org.tesco.inner.memberinner;

public class MemberInnerDeo {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Inner inner = outter.createInner();
        inner.innerMethod();

        //way 2 : create instance of inner class outside
        Outter outter1 = new Outter();
        Outter.Inner inner1 = outter1.new Inner();
        inner1.innerMethod();

        //way 3 : shortcut
        Outter.Inner inner2 = new Outter().new Inner();
        inner2.innerMethod();
    }
}
