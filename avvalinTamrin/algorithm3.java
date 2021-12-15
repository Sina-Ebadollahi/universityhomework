package avvalinTamrin;

import java.util.Scanner;

public class algorithm3 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که عددی را از رودی گرفته و در صورت مثبت بودن علامت آن, را پیام مناسبی چاپ کند.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number Professor Pirahesh");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("the number that you entered is positive");
        }else if(num < 0){
            System.out.println("the number that you entered is negative");
        }else{
            System.out.println("the number that you entered is Zero");
        }
    }
}
