package dovvominTamrin;
import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm15 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته حاصلجمع و ميانگين آنها را محاسبه و چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int numbersOfInput = scanner.nextInt();
        int sumValueOfInputs = 0;
        for(int i = 1; i <= numbersOfInput; i++){

            System.out.print("enter " + i + " number : ");
            int tempInput = scanner.nextInt();
            sumValueOfInputs += tempInput;
        }
        int avgValueOfInputs = sumValueOfInputs / numbersOfInput;
        System.out.println("sum is : " + sumValueOfInputs + " & average is : " + avgValueOfInputs);
    }
}
