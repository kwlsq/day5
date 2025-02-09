package org.vincent.numbers;

public class FizzBuzz {
    public static String fizzBuzzGenerator(int fizzBuzzLength){
        if(fizzBuzzLength > 200){
            throw new IllegalArgumentException("Max fizz buzz length generated is 200");
        }

        StringBuilder resultString = new StringBuilder();

        for(int i=1;i<=fizzBuzzLength;i++){
            if(i%3==0){
                resultString.append("Fizz");
            }
            if(i%5==0){
                resultString.append("Buzz");
            }
            if(!(i%3==0 || i%5==0)) {
                resultString.append(i);
            }
            if(i!=fizzBuzzLength){
                resultString.append(", ");
            }
        }
        return resultString.toString();
    }
}
