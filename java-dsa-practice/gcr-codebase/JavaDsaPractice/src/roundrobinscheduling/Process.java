package roundrobinscheduling;

public class Process{
    public int processId;
    public int burstTime;
    public int remainingTime;
    public int priority;

    public Process(int processId, int burstTime, int priority){
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

