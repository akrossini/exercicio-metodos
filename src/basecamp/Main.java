package basecamp;

public class Main {


    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    private static void prePos() {
        int a = 10;
        int b = ++a;
        int c = a++;
        int d = a;

        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + a);
    }

    private static void aritmetico() {
        int a = 9;
        int b = 4;

        int a1 = a+b;
        int a2 = a-b;
        int a3 = a*b;
        int a4 = a/b;
        int a5 = a%b;

        System.out.println("a+b= " + a1);
        System.out.println("a-b= " + a2);
        System.out.println("a*b= " + a3);
        System.out.println("a/b= " + a4);
        System.out.println("a%b= " + a5);
    }

    private static void atribuicao() {
        int a = 95648;
        short b = 13;
        long c = 2795l;
        int d = 35;
        float e = 6.94f;
        double f = e;

        System.out.println("d= " + d);

        a+=5;
        b-=5;
        c/=3;
        d*=6;
        e%=2;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);
        System.out.println("e= " + e);

    }

    private static void precedencia() {
        int a = 15;
        int b = 30;
        int c = 45;

        int d = a++ + --b * c; // 15+29*45=1320

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("d= " + d);

        int e = c / --a % b + 1;

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
        System.out.println("e= " + e);

    }

}
