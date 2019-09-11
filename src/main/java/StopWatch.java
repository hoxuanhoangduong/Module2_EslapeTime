import java.sql.Time;

public class StopWatch {
    private long starTime = 0;
    private long endTime = 0;
    private boolean running;

    public long statTime(){
        return System.currentTimeMillis();
    }

    public void star(){
        this.starTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime(){
        long elapsed;
        if(this.running){
            elapsed = System.currentTimeMillis() - starTime;
        } else {
            elapsed = endTime - starTime;
        }
        return elapsed;
    }

}
