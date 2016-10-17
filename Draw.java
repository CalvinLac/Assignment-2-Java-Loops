/*********************************************************
* Last Name: Lac
* First Name: Calvin
* Student ID: 10133628
* Course: CPSC 233
* Tutorial Section: T04
* Assignment: 1
*
*The program prompts the user to enter a binary number.
*The program then changes the binary number to a decimal. 
*********************************************************/

public class Draw {

  public static String getID() {
  return "10133628"; // Your student ID here.
  }

  //initializing the private data members that store the amount of shapes drawn
  private int rectanglesDrawn = 0;
  private int leftTrianglesDrawn = 0;
  private int rightTrianglesDrawn = 0;

  //Method that outputs the rectangles
  void drawRectangle (char symbol, int width, int height) {
    //This for loop literates through the height of the rectangle to get the height correct
    for (int i = 0; i < height; i++) {
      //This for loop will create the correct number of symbols for the width of the rectangle
      for (int n = 0; n < width; n++) {
      System.out.print(symbol);
      }
    System.out.println();
    }
    //Incrementing the rectangle shape counter
    rectanglesDrawn++;
  }

  //Method that outputs the left triangles
  void drawLeftTriangle (char symbol, int height) {
    //Initializing the counter method that will be used in a for loop
    int counter = height;
    //This for loop will iterate to get the height of the triangle correct
    for (int i = 0; i < height; i++) {
      //This for loop will iterate to print the correct number of shapes that correlate to the height
      for (int n = 0; n < counter; n ++) {
        System.out.print(symbol);
      }
      System.out.println();
      counter--;
    }
    //Incrementing the left triangle shape counter
    leftTrianglesDrawn++;
  }

  //Method that outputs the right triangles
  void drawRightTriangle (char symbol, int height) {
    //initializing the data members that will be used in the for loops
    int counter = height - 1;
    int counter2 = 1;
    //This for loop will iterate to get the height of the triangle correct
    for (int i = 0; i < height; i++) {
      //This for loop will add spaces before the symbol is printed
      for (int n = 0; n < counter; n ++) {
        System.out.print(" ");
      }
      //This for loop prints out the symbol on the same line
      for(int p = 0; p < counter2; p++) {
        System.out.print(symbol);
      }
      System.out.println();
      counter--;
      counter2++;
    }
    //Incrementing the counter for right triangles drawn
    rightTrianglesDrawn++;
  }

  //Method that will display the amount of different shapes that drawn
  public void displayCounts () {
    System.out.println("Number of shapes drawn:");
    System.out.println("Rectangles: " + rectanglesDrawn);
    System.out.println("Left triangles: " + leftTrianglesDrawn);
    System.out.println("Right triangles: " + rightTrianglesDrawn);
  }

}