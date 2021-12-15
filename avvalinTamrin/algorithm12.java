package avvalinTamrin;

import java.util.Scanner;

public class algorithm12 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        //الگوريتمي بنويسيد كه شماره ماه را گرفته و نام ماه را چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 12 Professor Pirahesh");
        int inputNumber = scanner.nextInt();
        switch (inputNumber){
            case 1:
                System.out.println("Farvardin");
                break;
            case 2:
                System.out.println("Ordibehesht");
                break;
            case 3:
                System.out.println("Khordad");
                break;
            case 4:
                System.out.println("Tir");
                break;
            case 5:
                System.out.println("Mordad");
                break;
            case 6:
                System.out.println("Shahrivar");
                break;
            case 7:
                System.out.println("Mehr");
                break;
            case 8:
                System.out.println("Aban");
                break;
            case 9:
                System.out.println("Azar");
                break;
            case 10:
                System.out.println("Dey");
                break;
            case 11:
                System.out.println("Bahman");
                break;
            case 12:
                System.out.println("Esfand");
                break;
            default:
                System.out.println("Entered number must be between 1 to 12");
        }
    }
}
