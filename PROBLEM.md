## Problem Statement: Find the day of the given date. Date contains month,day,year(2000<year<3000) ##

**Given date, find the day of given date using LocaleDate**

**This exercise contains a class named FindDay with the following methods:**


    +findDay(int,int,int) : String
        -Should get month,day,year as input and return result 
        -Should return "Give proper month" if given month is less than 1 and greater than 12
        -Should return "Give proper day" if given day is less than 1 and greater than 31
        -Should return "Give proper year" if given month is less than 2000 and greater than 3000
        -Should find day of given input and return it.
        

## Example
    Sample Input:
    1 1 2020
    
    Expected Output:   
    WEDNESDAY
--------------------------------------------------------
    Sample Input:
    13 4 2025
    
    Expected Output:
    Give proper month
--------------------------------------------------------
    Sample Input:
    4 32 2001
    
    Expected Output:
    Give proper day
--------------------------------------------------------
    Sample Input:
    0 0 200
    
    Expected Output:
    Give proper monthGive proper dayGive proper year

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding