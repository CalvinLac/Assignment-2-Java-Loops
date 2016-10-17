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

public class TwoNumbers {

  public static String getID() {
  return "10133628"; // Your student ID here.
  }

  //Initializing the private data members
  private int firstNumber;
  private int secondNumber;

  //Setting up the default constructor for the data members
  TwoNumbers () {
    firstNumber = 0;
    secondNumber = 0;
  }

  // getFirstNum and getSecondNum are accessing the private data members and returning their value
  public int getFirstNum () {
    return firstNumber;
  }

  public int getSecondNum () {
    return secondNumber;
  }

  //setFirstNum and setSecondnum are used to set the values of firstNumber and secondNumber
  boolean setFirstNum (int numSet) {
    if (numSet > 29 || numSet < 0) {
      return false;
    }
    else {
      firstNumber = numSet;
      return true;
    }
  }

  boolean setSecondNum (int numSet) {
    if (numSet > 29 || numSet < 0) {
      return false;
    }
    else {
      secondNumber = numSet;
      return true;
    }
  }

  //checksum is summing the firstNumber and the secondNumber to see if it matches the input
  boolean checkSum (int numSet) {
    if (numSet == (firstNumber + secondNumber)) {
      return true;
    }
    else{
      return false;
    }
  }

  //equals checks to see if the object provided as an arguement and the instance it is invoked on have the same numbers
  boolean equals (TwoNumbers numbers) {
    if (numbers.firstNumber==firstNumber || numbers.secondNumber==secondNumber || (numbers.firstNumber == secondNumber) && (numbers.secondNumber == firstNumber)) {
      return true;
    }
    else {
      return false;
    }
  }

}