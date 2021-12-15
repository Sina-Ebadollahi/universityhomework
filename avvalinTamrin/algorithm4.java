package avvalinTamrin;

import java.util.Scanner;

public class algorithm4 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که دو عدد را از ورودی گرفته و بزرگترین عدد از بین انها را پیدا کرده و چاپ نماید.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number Professor Pirahesh");
        int firstNum = scanner.nextInt();
        System.out.println("Please Enter the second number Professor Pirahesh");
        int secondNum = scanner.nextInt();
        if(firstNum > secondNum){
            System.out.println("first number is " + firstNum + " is greater than others");
        }else if(secondNum > firstNum){
            System.out.println("second number is " + secondNum + " is greater than others");
        }else{
            System.out.println("both numbers are same.");
        }
    }
}
