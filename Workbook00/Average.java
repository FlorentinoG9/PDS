package Workbook00;

import java.util.Random;

public class Average {
  private int[] studentScores = new int[20];

  public void setStudentScores() {

    for (int i = 0; i < this.studentScores.length; i++) {
      this.studentScores[i] = new Random().nextInt(100) + 1;
    }
  }

  public int[] getStudentScores() {
    return studentScores;
  }

  public void avgScores(int[] studentScores) {

    int totalSccore = 0;

    for (int i = 0; i < studentScores.length; i++) {
      totalSccore += studentScores[i];
    }

    System.out.printf("The average score is: %d", totalSccore / studentScores.length);
  }

  public static void main(String[] args) {
    Average score = new Average();

    score.setStudentScores();

    score.avgScores(score.getStudentScores());
  }
}
