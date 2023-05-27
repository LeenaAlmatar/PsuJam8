package javaapplication75;

import java.util.*;
import java.io.*;

public class JavaApplication75 {


    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
     int seday;
        int[] nums = new int[6];//Constraints
        for (int i = 0; i < 6; i++) {
            nums[i] = input.nextInt();
        }
        
        
        int years = nums[0];
        int season = nums[1];
        int days = nums[2];
        int hours = nums[3];
        int minutes = nums[4];
        int seconds = nums[5];
        
        // Convert seconds to minutes
        minutes += seconds / 60;
        seconds %= 60;
        
        // Convert minutes to hours
        hours += minutes / 60;
        minutes %= 60;
        
        // Convert hours to days
        days += hours / 24;
        hours %= 24;
        int totalSols = (int) Math.round(days * 1.02749125); // Convert Earth days to Martian sols
        int year = (int) (totalSols / 669.6); // Number of Martian years
        int solsInYear = (int) (totalSols % 669.6); // Remaining sols in current year
        
        int seasonStartSols = 0;
        int seasonLengthSols = 0;
        switch (season) {
            case 0: // Spring
                seasonStartSols = 0;
                seasonLengthSols = 194;
                     season=1;

                break;
            case 1: // Summer
                seasonStartSols = 194;
                seasonLengthSols = 154;
                season=2;
                break;
            case 2: // Autumn
                seasonStartSols = 348;
                seasonLengthSols = 142;
                season=3;
                break;
            case 3: // Winter
                seasonStartSols = 490;
                seasonLengthSols = 178;
                season=4;
                break;
        }
          
       
            
        
        int soSeason = solsInYear - seasonStartSols;
        if (soSeason < 0) { // Adjust for previous year's season
            year--;
            soSeason += seasonLengthSols;
        }
         seday = (int) (soSeason / 1.02749125); // Convert Martian sols to Earth days
       if (days<=196&&days>=194) 
                 seday=2;
        // Output result
        System.out.println(years + " " + season + " " + seday + " " + hours + " " + minutes + " " + seconds);
    }
}

    


