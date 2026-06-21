public class Log {
    private static Log instance;
    private Log() {
    }
    public static Log getInstance() {
        if (instance == null){
            instance = new Log();
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
