// Write a program that will take an integer and print Fizz if the number is divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, and the number itself for all other cases.

public class FizzBuzz {
    public String fizzbuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if(num % 3 == 0) {
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return ""+num;
            
        }
    }
}