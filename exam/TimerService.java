package exam;
import java.util.*;

public class TimerService {
    private Timer timer;
    private long duration;
    private Runnable onTimeout;

    public TimerService(long duration,Runnable onTimeout) {
        this.duration=duration;
        this.onTimeout=onTimeout;
        this.timer=new Timer();
    }

    public void start() {
        timer.schedule(new TimerTask() {
        	public void run()
        	{onTimeout.run();} 
        	}, duration);
    }

    public void stop() {
        timer.cancel();
    }
}
