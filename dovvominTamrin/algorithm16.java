package dovvominTamrin;
import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm16 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // در كامپيوتري كه فقط عمل افزودن يك واحد به يك متغير وجود دارد دو عدد را  با يكديگر جمع كنيد بدين شكل كه يكي يكي بتواند به مقدار متغير اضافه شود.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' : ");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' : ");
        int b = scanner.nextInt();
        int sum = a;
        for(int i = 0; i < b; i++){
            sum++;
        }
        System.out.println("sum is " + sum);
    }
}
