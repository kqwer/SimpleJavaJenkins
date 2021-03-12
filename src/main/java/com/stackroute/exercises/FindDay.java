package com.stackroute.exercises;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;

public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {

        //return null;
        String result="iiiii";
        if((day>31 || day<1) && (year<2000 || year>3000) && (month>12 || month<1)){
            result="Give month in rangeGive day in rangeGive year in range";
            System.out.println(result);
        }
        else if((day>31 || day<1)  &&(month>12 || month<1)){
            result="Give month in rangeGive day in range";
            System.out.println(result);
        }
        else if( (year<2000 || year>3000) &&(month>12 || month<1)){
            result="Give month in rangeGive year in range";
            System.out.println(result);
        }
        else if((day>31 || day<1) && (year<2000 || year>3000)){
            result="Give day in rangeGive year in range";
            System.out.println(result);
        }
        else if(month>12 || month<1){
            result ="Give month in range";
            System.out.println(result);
        }
        else if (year<2000 || year>3000) {

            result ="Give year in range";
            System.out.println(result);

        }
        else if(day>31 || day<1)
        {
            result ="Give day in range";
            System.out.println(result);
        }

        else {

        LocalDate localDate = LocalDate.of(year, month, day);

        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        result= dayOfWeek.toString();

            }
        //System.out.println(result);
        return result;
    }
}
