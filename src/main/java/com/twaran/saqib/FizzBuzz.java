package com.twaran.saqib;

public class FizzBuzz {
    public String convert(int number) {
        String convertedNumber = "";
        if(isMultipleOf3(number))
            convertedNumber += "fizz";
        if(isMultipleOf5(number))
            convertedNumber += "buzz";
        if("".equals(convertedNumber)) // Neither of the above approves...
            convertedNumber += String.valueOf(number);
        return convertedNumber;
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
