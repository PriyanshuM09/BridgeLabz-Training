package roundrobinscheduling;

public class RoundRobinScheduler {

    public Node head;
    private int processCount = 0;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;

    public void addProcess(Process process) {
        Node newNode = new Node(process);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        processCount++;
    }

    private void removeProcess(int processId) {
        if (head == null) return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.data.processId == processId) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Node temp = head;
                        while (temp.next != head) {
                            temp = temp.next;
                        }
                        head = head.next;
                        temp.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes left");
            return;
        }

        Node temp = head;
        do {
            System.out.println(
                "P" + temp.data.processId +
                " | Remaining Time: " + temp.data.remainingTime
            );
            temp = temp.next;
        } while (temp != head);
    }
    public void schedule(int timeQuantum) {
        if (head == null) return;

        int currentTime = 0;
        Node current = head;

        while (head != null) {

            if (current.data.remainingTime > 0) {

                if (current.data.remainingTime > timeQuantum) {
                    currentTime += timeQuantum;
                    current.data.remainingTime -= timeQuantum;
                } else {
                    currentTime += current.data.remainingTime;
                    current.data.remainingTime = 0;

                    totalTurnaroundTime += currentTime;
                    totalWaitingTime +=
                            currentTime - current.data.burstTime;

                    int finishedId = current.data.processId;
                    current = current.next;
                    removeProcess(finishedId);

                    System.out.println("\nProcess P" + finishedId + " completed");
                    displayProcesses();
                    continue;
                }
            }
            current = current.next;
        }
    }

    public void displayAverages() {
        System.out.println("\nAverage Waiting Time: "
                + (double) totalWaitingTime / (processCount + 1));
        System.out.println("Average Turnaround Time: "
                + (double) totalTurnaroundTime / (processCount + 1));
    }
}

