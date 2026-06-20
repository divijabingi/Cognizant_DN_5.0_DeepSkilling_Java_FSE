public class Logger {
    private static Logger instance;
    private Logger() {
    }
    public static Logger getInstance() {
        if (instance == null){
            instance = new Logger();
        }
           return instance;
    }
    public void logMessage(String message) {
        System.out.println("App Name: StudentPortal");
        System.out.println("Version : 1.0");
        System.out.println("Language : English");
        System.out.println("Log : " + message);
    }
}
