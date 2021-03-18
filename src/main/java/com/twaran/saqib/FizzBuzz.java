package com.twaran.saqib;

public class FizzBuzz {
    public String convert(int number) {
        String convertedNumber = "";
        if(number % 3 == 0)
            convertedNumber += "fizz";
        if(number % 5 == 0)
            convertedNumber += "buzz";
        return convertedNumber;
    }
}
