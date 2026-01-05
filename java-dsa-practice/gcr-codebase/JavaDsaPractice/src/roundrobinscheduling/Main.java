package roundrobinscheduling;

public class Main{
    public static void main(String[] args){

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(new Process(1, 10, 1));
        scheduler.addProcess(new Process(2, 5, 2));
        scheduler.addProcess(new Process(3, 8, 1));

        int timeQuantum = 3;

        System.out.println("Initial Process Queue:");
        scheduler.displayProcesses();

        scheduler.schedule(timeQuantum);
        scheduler.displayAverages();
    }
}

