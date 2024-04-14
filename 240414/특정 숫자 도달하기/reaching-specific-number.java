import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;
        double cnt = 0;
        boolean check = false;
        for (int i = 0; i < 10 ; i ++){
            int a = sc.nextInt();
            if (a >= 250){
                check = true;
            }
            if (check==false){
                sum += a;
                cnt += 1;
            }   
        }
        
        avg = sum/cnt;
        System.out.printf("%d %.1f",sum,avg);
    }
}