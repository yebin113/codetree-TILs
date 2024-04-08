public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int tempb = b;
        int tempc = c;
        b = a;
        c = tempb;
        a = tempc;
        System.out.printf("%d\n%d\n%d\n",a,b,c);
    }
}