/*********************************************************
* Last Name: Lac
* First Name: Calvin
* Student ID: 10133628
* Course: CPSC 233
* Tutorial Section: T04
* Assignment: 1
*
*This program takes given arguement and draws one of the three shapes 
*********************************************************/

/** 
*  Draw.java
*  @version CPSC 233
*  @author Calvin Lac
*/

public class Draw {

  /**
  *This method will return your student ID
  *@return Will return student id
  */
  public static String getID() {
  return "10133628"; // Your student ID here.
  }

  /**
  *Initializing the private data members that store the amount of shapes drawn
  */
  private int rectanglesDrawn = 0;
  private int leftTrianglesDrawn = 0;
  private int rightTrianglesDrawn = 0;

  /**
  *This method will take the a symbol, width, and height to make a rectangle
  *@param symbol is the output of the shape
  *@param width is the width of the rectangle you want to draw
  *@param height is the height of the rectangle you want to draw
  */
  public void drawRectangle (char symbol, int width, int height) {
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

  /**
  *This method will take the a symbol and height to make a left triangle
  *@param symbol is the output of the shape
  *@param height is the height of the rectangle you want to draw
  */
  public void drawLeftTriangle (char symbol, int height) {
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

  /**
  *This method will take the a symbol and height to make a right triangle
  *@param symbol is the output of the shape
  *@param height is the height of the rectangle you want to draw
  */
  public void drawRightTriangle (char symbol, int height) {
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

  /**
  *This method will display the counts of the different shapes that you have drawn
  */
  public void displayCounts () {
    System.out.println("Number of shapes drawn:");
    System.out.println("Rectangles: " + rectanglesDrawn);
    System.out.println("Left triangles: " + leftTrianglesDrawn);
    System.out.println("Right triangles: " + rightTrianglesDrawn);
  }

}