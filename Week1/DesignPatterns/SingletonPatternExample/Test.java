public class Test {
    public static void main(String[] args) {
        Log log1 = Log.getInstance();
        System.out.println("Login Page Config:");
        log1.logMessage("User opened Login Page");
        System.out.println();
         Log log2 = Log.getInstance();
        System.out.println("Home Page Config:");
        log2.logMessage("User opened Home Page");
        System.out.println();
        if (log1 == log2) {
            System.out.println("Same Logger object ");
        }

        System.out.println("Singleton Pattern restricts object creation to one instance only!");    }
}
