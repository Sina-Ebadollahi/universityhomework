package panjominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm41 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        //الگوريتمي بنويسيد كه جدول ضرب 10 × 10   را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            int j = 1;
            while(j <= 10){
                System.out.printf("%d\t", i);
                System.out.print(j);
                // ++j can be used.
                j++;
            }
        }

    }
}
