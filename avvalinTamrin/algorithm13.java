package avvalinTamrin;

import java.util.Scanner;

public class algorithm13 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه شماره ماه را گرفته و نام فصل را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 12 Professor Pirahesh");
        int monthNum = scanner.nextInt();
        if(monthNum >= 1 && monthNum <= 3){
            System.out.println("Season is Spring");
        }
        if(monthNum >= 4 && monthNum <= 6){
            System.out.println("Season is Summer");
        }
        if(monthNum >= 7 && monthNum <= 9){
            System.out.println("Season is Fall");
        }
        if(monthNum >= 11 && monthNum <= 12){
            System.out.println("Season is Winter");
        }


    }
}
