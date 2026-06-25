package Singleton;

public class Logger {
    private static Logger logger=new Logger();
    private Logger(){
        System.out.println("Logger Instance Created");
    }
    public static Logger getInstance(){
        return logger;
    }
    public void log(String message){
        System.out.println("LOG: "+message);
    }
}
