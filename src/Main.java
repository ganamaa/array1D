//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
                array[i]= scanner.nextInt();
        }
        for (int number: array){
            System.out.println(number);
        }
        scanner.close();
    }
}