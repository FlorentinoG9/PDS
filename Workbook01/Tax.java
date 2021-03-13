package Workbook01;

public class Tax {
  /*
   * Declare just a method in order to do some calculations this method could be
   * only one but on the big picture the code is modular (Object-Oriented) this
   * way our code is more managable and easier to maintain
   */
  public double payTax(double[] taxPayers) {

    double taxToBePaid = 0.0;

    // Add every amount in a single variable
    for (int i = 0; i < taxPayers.length; i++) {
      taxToBePaid += taxPayers[i];
    }

    // check if the sum of every tax payer which bracket tax they fall into
    if (taxToBePaid < 15000) {
      return taxToBePaid * 0;
    } else if (taxToBePaid >= 15000 && taxToBePaid < 20000) {
      return taxToBePaid * 0.1;
    } else if (taxToBePaid >= 20000 && taxToBePaid < 30000) {
      return taxToBePaid * 0.2;
    } else {
      return taxToBePaid * 0.3;
    }

  }
}
