import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sumNum = a+b+c;
        int avgNum = sumNum/3;
        
        System.out.printf("%d\n%d\n%d",sumNum,avgNum,sumNum-avgNum);
    }
}