public class OuterClass {

    // 2.1 Inner class
    public static class InnerClass {
        public void greet() {
            System.out.println("Inner Class!");
        }
    }

    public void LocalClass() {
        // 2.2 Local class
        class LocalClass {
            public void printMessage() {
                System.out.println("Local Class!");
            }
        }

        // Create an instance of the local class
        LocalClass local = new LocalClass();
        local.printMessage();
    }

    public void AnonymousClass() {
        // Anonymous class implementing an interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class!");
            }
        };

        // Using the anonymous class
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