public abstract class LoggingFramework {



    public final Integer DEBUG = 1;
    public final Integer INFO = 2;
    public final Integer ERROR = 3;

    public final Integer WARNING = 4;
    public final Integer FATAL = 5;


    public abstract void log(Integer log, String message);

}
