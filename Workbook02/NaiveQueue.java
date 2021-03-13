package Workbook02;

public class NaiveQueue {
  
  // declare variables for the class
  private int[] queue = new int[10];
  int tail = 0;

  // check if the queue is empty
  public boolean isEmpty() {
    return tail == 0;
  }

  // check if the queue is full
  public boolean isFull() {
    return tail >= this.queue.length;
  }

  // print the queue
  public void getStack() {
    System.out.print("\nQueue: |");
    for (int i = 0; i < queue.length; i++) {
      System.out.printf(" %2d |", this.queue[i]);
    }
    System.out.println("\u001B[0m");
  }

  // enter input as a parameter to the queue
  public void enQueue(int n) {
    // check if the queue is not full
    if (!isFull()) {
      // assign the n parameter to the position in the queue
      this.queue[tail] = n;
      // add 1 to tail
      tail++;
      // print the queue
      System.out.print("\u001B[34m");
      getStack();
    } else {
      // if the queue is full display the message
      System.out.println("Sorry the Queue is Full\n");
    }
  }

  // pull the first number entered and change the position of the entire queue to
  // the left and get the number that deQueue
  public int deQueue() {
    // check if the queue is not empty
    if (!isEmpty()) {
      // decrease the tail value by 1
      tail--;
      // assignt to a temp variable the number that is going to be deQueue
      int temp = this.queue[tail];
      // assign the position deQueue to zero
      this.queue[0] = 0;
      // then move the entire queue to the left 
      for (int i = 0; i < tail; i++) {
        this.queue[i] = this.queue[i + 1];
        this.queue[i + 1] = 0;
      }
      // print the queue
      System.out.print("\u001B[31m");
      getStack();
      // return the value of the number that got deQueue
      return temp;
    } else {
      // if the queue is empty displey message
      System.out.println("Queue is Empty! ");
    }

    // return zero if the queue is empty
    return 0;
  }

  public static void main(String[] args) {
    NaiveQueue queue = new NaiveQueue();

    queue.deQueue();
    System.out.printf("\nIs Queue Empty: %s\n", queue.isEmpty() ? "Yes" : "No");

    for (int i = 1; i < 5; i++) {
      queue.enQueue(i);
    }
    
    for (int i = 1; i < 3; i++) {
      queue.deQueue();
    }

    System.out.printf("\nIs Queue Full: %s\n", queue.isFull() ? "Yes" : "No");
    System.out.printf("\nIs Queue Empty: %s\n", queue.isEmpty() ? "Yes" : "No");

  }
}
