import java.util.Scanner;

public class Vaja6a {
  public static void main(String[] args) {
    final int NUMBER_OF_QUESTIONS = 10; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int wrongCount=0;
    int count = 0; // Count the number of questions
    long startTime = System.currentTimeMillis();
    String output = ""; // output string is initially empty
    Scanner input = new Scanner(System.in);
    
    while (count < NUMBER_OF_QUESTIONS) {
      // 1. Generate two random single-digit integers
      int number1 = (int)(Math.random() * 15);
      int number2 = (int)(Math.random() * 15);
      count++;

      // 2. If number1 < number2, swap number1 with number2
      if (number1 < number2) {
        int temp = number1;  // Da nebo v minusu.   
        number1 = number2;
        number2 = temp;
      }

      // 3. Prompt the student to answer “What is number1 – number2?”
      System.out.print(
        "What is " + number1 + " + " + number2 + "? ");
      int answer = input.nextInt();

      // 4. Grade the answer and display the result
      if (number1 + number2 == answer) {
        System.out.println("You are correct!");
        correctCount++;
      }
      else{
        System.out.println("Your answer is wrong.\n" + number1 
          + " - " + number2 + " should be " + (number1 - number2));
          wrongCount++;

      // Increase the count
      //   count++;

    //   output += "\n" + number1 + "-" + number2 + "=" + answer + 
    //     ((number1 - number2 == answer) ? " correct" : " wrong");
    }

    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;
    System.out.println("wrong count is "+ wrongCount);
    System.out.println("Correct count is " + correctCount + 
      "\nTest time is " + testTime / 1000 + " seconds\n" + output);
  }
  input.close();
}

        
    }
    
