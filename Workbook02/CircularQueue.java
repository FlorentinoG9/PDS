package Workbook02;

import java.util.Random;

public class CircularQueue {
  // declare variables for queue, tail, head
  private int[] queue = new int[10];
  int tail = 0;
  int head = 0;

  // check if the queue is empty
  public boolean isEmpty() {
    return tail == head;
  }

  // check if the queue is full
  public boolean isFull() {
    return head == tail + 1 || head == 0 && tail == this.queue.length - 1;
  }

  // print the queue
  public void getCircularQueue() {
    System.out.print("\nCircular Queue: |");
    for (int i = 0; i < queue.length; i++) {
      // if the head is = to 'i' paint it red and if the 'i' is = to tail paint it
      // blue otherwise pass and empty string
      // this is a neseted terneary operator to check if its head or tail and assign
      // the correct color for each
      System.out.printf("%s %2d %s |", head == i ? "\u001B[31m" : tail == i ? "\u001B[34m" : "", this.queue[i],
          "\u001B[0m");
    }
    System.out.println();
  }

  // add inputs to the queue as a parameter
  public void enQueue(int n) {
    // check first if the queue is not full
    if (!isFull()) {
      // then assign this parameter (n) to the queue where tail is
      this.queue[tail] = n;
      // this if manage if the tail goes back to position 0 or adds 1 to tail
      if (tail == this.queue.length - 1) {
        tail = 0;
      } else {
        tail++;
      }
      // print the queue
      getCircularQueue();
    } else {
      // if the queue is full display message
      System.out.println("\nSorry the Circular Queue is Full");
    }
  }

  

  // get the number from queue where head is
  public int deQueue() {
    // check if the arrays is not empty
    if (!isEmpty()) {
      // assign the number from that position to a temp variable
      int temp = this.queue[head];
      // then that position assign a zero
      this.queue[head] = 0;
      // this if manage the head position to cicle through the queue
      // or adds 1 instead
      if (head == this.queue.length - 1) {
        head = 0;
      } else {
        head++;
      }
      // print queue
      getCircularQueue();
      // return the number from temp variable
      return temp;
    } else {
      // if the queue is empty display message
      System.out.println("Circualr Queue is Empty! ");
    }
    
    // return 0 if the queue is empty
    return 0;
  }

  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue();

    System.out.println("\n");
    // Color legend for head and tail
    System.out.print("Head: \u001B[41m \u001B[31m[]\u001B[40m\u001B[0m\t");
    System.out.println("Tail: \u001B[44m \u001B[34m[]\u001B[40m\u001B[0m\n");

    queue.deQueue();
    System.out.printf("\nIs Queue Empty: %s\n", queue.isEmpty() ? "Yes" : "No");

    for (int i = 1; i <= 10; i++) {
      queue.enQueue(new Random().nextInt(10) + 1);
    }

    for (int i = 0; i < 3; i++) {
      queue.deQueue();
      queue.enQueue(i + new Random().nextInt(10) + 1);
    }

    for (int i = 1; i <= 5; i++) {
      queue.deQueue();
      queue.enQueue(i);
    }

    for (int i = 0; i < 4; i++) {
      queue.deQueue();
    }

    System.out.printf("\nIs Queue Full: %s\n", queue.isFull() ? "Yes" : "No");
    System.out.printf("\nIs Queue Empty: %s\n", queue.isEmpty() ? "Yes" : "No");
  }
}
