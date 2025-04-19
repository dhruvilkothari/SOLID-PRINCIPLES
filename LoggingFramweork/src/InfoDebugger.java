import java.util.Objects;

public class InfoDebugger extends LoggingFramework{
    public LoggingFramework loggingFramework;
    public InfoDebugger(LoggingFramework loggingFramework){
        this.loggingFramework = loggingFramework;
    }
    @Override
    public void log(Integer log, String message) {

        if(Objects.equals(log, INFO)){
            System.out.println("INFO: " + message);
        }else {
            if (loggingFramework != null){
                loggingFramework.log(log, message);
            }
        }

    }
}


