package com.example.classes;

public class OuterClass {

    // 2.1 Inner class
    public static class InnerClass {
        public void greet() {
            System.out.println("This is an Inner Class!");
        }
    }

    // 2.2 Local class
    public void LocalClass() {
        class LocalClass {
            public void printMessage() {
                System.out.println("This is a Local Class!");
            }
        }

        LocalClass local = new LocalClass();
        local.printMessage();
    }

    // 2.3 Anonymous class
    public void AnonymousClass() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an Anonymous Class!");
            }
        };
        runnable.run();
    }


    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        InnerClass inner = new InnerClass();
        inner.greet();

        outer.LocalClass();

        outer.AnonymousClass();

    }
}