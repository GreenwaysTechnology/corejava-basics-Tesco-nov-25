package org.tesco.inner.memberinner;

public class Outter {

    //    public class Inner {
//
//    }
    class Inner {
        public void innerMethod() {
            System.out.println("Inner method");
        }
    }

    //create instance via public method of outter class
    public Inner createInner() {
        Inner inner = new Inner();
        return inner;
    }
}
