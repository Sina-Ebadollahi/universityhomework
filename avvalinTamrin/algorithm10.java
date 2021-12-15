package avvalinTamrin;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class algorithm10 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که ضرایب یک معادله درجه دو را گرفته و ریشه های ان را محاسبه و چاپ نماید.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the \"a\" Professor Pirahesh!");
        int a = scanner.nextInt();
        System.out.println("Enter the \"b\" Professor Pirahesh!");
        int b = scanner.nextInt();
        System.out.println("Enter the \"c\" Professor Pirahesh!");
        int c = scanner.nextInt();
        // b**2-4ac Formula
        int delta = (int)(Math.pow(b,2))-(4*a*c);
        double radikal1 = Math.sqrt(delta);
        try{
            if(delta > 0){
                System.out.println("delta is positive and the value of delta is : " + delta);
                int integarRadikal = (int) radikal1;
                int x1 = (-b + integarRadikal)/(2*a);
                int x2 = (-b + integarRadikal)/(2*a);
                System.out.printf("first answer is %d, and the second answer is %d", x1,x2);
            }else if(delta == 0){
                System.out.println("delta is Zero and it has just one answer");
                int xWithZeroDelta = (-b)/(2*a);
                System.out.println("single answer is : " + xWithZeroDelta);
            }else{
                System.out.println("delta is negative and there is no valid answers");
                System.exit(0);
            }
        }catch(Exception e){
            System.out.println("program encountered to an unexpected error");
            System.out.println(" error : " + e.getMessage());
        }


    }
}
