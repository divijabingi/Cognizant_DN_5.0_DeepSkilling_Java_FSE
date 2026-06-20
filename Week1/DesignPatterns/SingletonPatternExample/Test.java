public class Test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        System.out.println("Login Page Config:");
        logger1.logMessage("User opened Login Page");
        System.out.println();
         Logger logger2 = Logger.getInstance();
        System.out.println("Home Page Config:");
        logger2.logMessage("User opened Home Page");
        System.out.println();
        if (logger1 == logger2) {
            System.out.println("Same Logger object ");
        }

        System.out.println("Singleton Pattern restricts object creation to one instance only!");    }
}
