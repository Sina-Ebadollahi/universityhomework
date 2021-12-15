package avvalinTamrin;

import java.util.Scanner;

public class algorithm8 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که سه عدد را از ورودی گرفته و بزرگترین و کوچکترین عدد از بین انها را پیدا کرده و چاپ نماید.
        int a, b, c, max, min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh!");
        a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh!");
        b = scanner.nextInt();
        System.out.println("Enter 'c' Professor Pirahesh!");
        c = scanner.nextInt();
        if(a >= b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        if(c > max){
            max = c;
        }
        if(c < min){
            min = c;
        }
        System.out.println("Maximum Number is : " + max + " & Minimum Number is : " + min);

    }
}
