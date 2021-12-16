package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm40 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه بزرگترين و كوچكترين عدد از بين n عدد را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        int b = 0, question = 1, small = 0, big = 0, i = 0;
        while(question == 1){
            int c = scanner.nextInt();
            System.out.println("if you don't want to continue enter 0, otherwise enter 1");
            question = scanner.nextInt();
            b += c;
            int current = b;
            i++;
            if(big > current){
                big = current;
            }
            if(small < current){
                small = current;
            }
        }
        System.out.println("big number is : " + big + " and small number is : " + small);
    }
}
