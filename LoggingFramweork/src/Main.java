public class Main {
    public static void main(String[] args) {

        LoggingFramework loggingFramework = new InfoDebugger(new Debugger(new ErrorDebugger(null)));
        loggingFramework.log(1, "This is an info message");
        loggingFramework.log(2, "This is an info message");
        loggingFramework.log(3, "This is an info message");
//        loggingFramework.log(4, "This is an info message");


    }
}