package Workbook02;

public class Stack {
  
  // decalre an array for the stack and a counter to follow in push and pops
  private int[] stackArr = new int[10];
  int tail = 0;
  
  // initialize the stack with zeros and the tail to zero
  public void setStack() {
    for (int i = 0; i < this.stackArr.length; i++) {
      this.stackArr[i] = 0;
    }
    tail = 0;
  }

  // get the Stack to Print on the bash
  public void getStack() {
    System.out.print("Stack: |");
    for (int i = 0; i < stackArr.length; i++) {
      System.out.printf(" %2d |", this.stackArr[i]);
    }
    System.out.println("\n");
  }

  // check if the stack is Empty
  public boolean isEmpty() {
    return tail == 0;
  }

  // check if the stack is full
  public boolean isFull() {
    return tail >= this.stackArr.length;
  }

  // add an input to the stack and pass it through as a parameter
  public void push(int n) {
    if (!isFull()) {
      // assign the value given to the stack in the right position
      this.stackArr[tail] = n;
      // then add 1 to tail (counter)
      tail++;
    } else {
      // if the array is Full display message 
      System.out.println("Sorry the stack is Full\n");
    }
    // call function to print the stack
    getStack();
  }

  //  pull the las number in the stack that is in 
  public int pop() {
    // check if the stack is not empty 
    if (!isEmpty()) {
      // decrease the tail counter in order to pull the last number
      tail--;
      // assign it to a temp variable
      int temp = this.stackArr[tail];
      // then assign that position to zero
      this.stackArr[tail] = 0;
      // print the stack
      getStack();
      // return the number that was pop in case you need it
      return temp;
    } else {
      // if the stack is empty display message
      System.out.println("Sorry can\'t do that the stack is empty\n");
    }
    // print array
    getStack();

    // return zero if stack is empty
    return 0;
  }

  public void top() {
    // take a sneak peak to the number on top of the stack
    System.out.printf("Top: %d\n\n", isEmpty() ? 0 : this.stackArr[tail - 1]);
  }

  public static void main(String[] args) {
    Stack stack1 = new Stack();

    // init Stack
    stack1.setStack();

    stack1.pop();
    stack1.top();

    stack1.push(5);
    stack1.push(10);
    stack1.push(11);
    stack1.push(20);
    System.out.printf("Pop is: %d\n\n", stack1.pop());
    stack1.push(15);
    stack1.top();
    stack1.push(2);
    stack1.push(3);
    stack1.push(7);
    stack1.push(8);
    stack1.push(9);
    stack1.top();

  }
}
