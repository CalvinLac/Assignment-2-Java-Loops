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

/** 
*  TwoNumber.java
*  @version CPSC 233
*  @author Calvin Lac
*/


public class TwoNumbers {

  /**
  *This method will return your student ID
  *@return Will return student id
  */
  public static String getID() {
  return "10133628"; // Your student ID here.
  }


  //Initializing the private data members
  private int firstNumber;
  private int secondNumber;

  /**
  *This is a override for the default constructor to make all the points 0,0
  */
  TwoNumbers () {
    firstNumber = 0;
    secondNumber = 0;
  }

  /**
  * getFirstNum and getSecondNum are accessing the private data members and returning their value
  * @return Int the first number
  */
  public int getFirstNum () {
    return firstNumber;
  }

  /**
  * getFirstNum and getSecondNum are accessing the private data members and returning their value
  * @return Int the second number
  */
  public int getSecondNum () {
    return secondNumber;
  }

  /**
  * getFirstNum and getSecondNum are accessing the private data members and returning their value
  *@param numSet is the number you set for the first number
  *@return boolean true or false
  */
  boolean setFirstNum (int numSet) {
    if (numSet > 29 || numSet < 0) {
      return false;
    }
    else {
      firstNumber = numSet;
      return true;
    }
  }

  /**
  * getFirstNum and getSecondNum are accessing the private data members and returning their value
  *@param numSet is the number you set for the second number
  *@return boolean true or false
  */
  boolean setSecondNum (int numSet) {
    if (numSet > 29 || numSet < 0) {
      return false;
    }
    else {
      secondNumber = numSet;
      return true;
    }
  }

  /**
  *checksum is summing the firstNumber and the secondNumber to see if it matches the input
  *@param numSet is the number you want to see if it matches the addition of the other numbers
  *@return boolean true or false
  */
  boolean checkSum (int numSet) {
    if (numSet == (firstNumber + secondNumber)) {
      return true;
    }
    else{
      return false;
    }
  }

  /**
  *equals checks to see if the object provided as an arguement and the instance it is invoked on have the same numbers
  *@param numbers is the number you want to see if it equals the other
  *@return boolean true or false
  */
  boolean equals (TwoNumbers numbers) {
    if (numbers.firstNumber==firstNumber || numbers.secondNumber==secondNumber || (numbers.firstNumber == secondNumber) && (numbers.secondNumber == firstNumber)) {
      return true;
    }
    else {
      return false;
    }
  }

}