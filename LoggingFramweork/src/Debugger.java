import java.util.Objects;

public class Debugger extends LoggingFramework{
    public LoggingFramework loggingFramework;
    public Debugger(LoggingFramework loggingFramework){
        this.loggingFramework = loggingFramework;
    }
    @Override
    public void log(Integer log, String message) {

        if(Objects.equals(log, DEBUG)){
            System.out.println("DEBUG: " + message);
        }else {
            if (loggingFramework != null){
                loggingFramework.log(log, message);
            }
        }

    }
}
