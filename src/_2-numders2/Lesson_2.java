package numders2;

public class Lesson_2 {
    public static void main(String[] args) {
        int p;
        double l,r;
        int a = 3; //ширина
        int b = 6; //длина
        int c = 4; // в одном рулоне
        double d = 0.6; //ширина листа
        System.out.println("В одном рулоне " + c + " листов");
        p = (a+b)*2;
        l = p/d;
        r = l/c;
        System.out.println("для поклейки комнаты обоями понадобится " + (int)(r+1) + " рулон");

    }
}
