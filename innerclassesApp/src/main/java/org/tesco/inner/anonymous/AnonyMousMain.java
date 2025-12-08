package org.tesco.inner.anonymous;

public class AnonyMousMain {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();
        //Anonymous inner class provide implementation of fly mehtod without any class
        //Flyable flyable = new Flyable (); interface cant be instantiated

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Anonymous flylable");
            }
        };
        flyable.fly();
        flyable.doStuff();

        //'Shap' is abstract; cannot be instantiated
        //Shap shap = new Shap();

        Shap shap = new Shap() {
            @Override
            public void draw() {
                System.out.println("Draw");
            }
        };
        shap.draw();


    }
}
