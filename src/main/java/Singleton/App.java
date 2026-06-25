package Singleton;

public class App {
    public static void main(String[]args){
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        if(l1==l2){
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        }
        else{
            System.out.println("different instance created");
        }
    }
}
