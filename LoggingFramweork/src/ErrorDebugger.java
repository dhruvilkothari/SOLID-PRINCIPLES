import java.util.Objects;

public class ErrorDebugger extends LoggingFramework{
    public LoggingFramework loggingFramework;
    public ErrorDebugger(LoggingFramework loggingFramework){
        this.loggingFramework = loggingFramework;
    }
    @Override
    public void log(Integer log, String message) {

        if(Objects.equals(log, ERROR)){
            System.out.println("ERROR: " + message);
        }else {
            if (loggingFramework != null){
                loggingFramework.log(log, message);
            }
        }

    }
}



