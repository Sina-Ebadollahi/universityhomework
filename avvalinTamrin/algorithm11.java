package avvalinTamrin;

import java.util.Scanner;

public class algorithm11 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه دو تاريخ (متشكل از روز، ماه، سال) را گرفته و بزرگترين آنها را مشخص نمايد.
        Scanner scanner = new Scanner(System.in);
        int day1,day2,month1,month2,year1,year2;
        System.out.println("Enter year1");
        year1 = scanner.nextInt();
        System.out.println("Enter month1");
        month1 = scanner.nextInt();
        System.out.println("Enter day1");
        day1 = scanner.nextInt();
        System.out.println("Enter year2");
        year2 = scanner.nextInt();
        System.out.println("Enter month2");
        month2 = scanner.nextInt();
        System.out.println("Enter day2");
        day2 = scanner.nextInt();
        if(year1 > year2){
            System.out.println("first date is bigger than other");
        }else if(year2 > year1){
            System.out.println("second date is bigger than other");
        }else{ // if both years are equal
            if(month1 > month2){
                System.out.println("first date is bigger than other");
            }else if(month2 > month1){
                System.out.println("second date is bigger than other");
            }else{ // if months are equal too
                if(day1 > day2){
                    System.out.println("first date is bigger than other");
                }else if(day2 > day1){
                    System.out.println("second date is bigger than other");
                }else{
                    System.out.println("dates are equal!");
                }
            }
        }


    }
}
