package avvalinTamrin;

import java.util.Scanner;

public class algorithm6 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که چهار عدد از ورودی گرفته و بزرگترین عدد از بین انها را پیدا کرده و چاپ نماید.
        Scanner scanner = new Scanner(System.in);
        int firstNum, secondNum, thirdNum, fourthNum;
        System.out.println("please enter the numbers one by one Professor Pirahesh!");
        firstNum = scanner.nextInt();
        secondNum = scanner.nextInt();
        thirdNum = scanner.nextInt();
        fourthNum = scanner.nextInt();
        if(firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum){
            System.out.println("the first number which is " + firstNum + " , is the greatest!");
        }else if(secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum){
            System.out.println("the second number which is " + secondNum + " , is the greatest!");
        }else if(thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum){
            System.out.println("the third number which is " + thirdNum + " , is the greatest!");
        }else if(fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum) {
            System.out.println("the fourth number which is " + fourthNum + " , is the greatest!");
        }else{
            System.out.println("numbers are equal!");
        }
    }
}
