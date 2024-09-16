package se.oscar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int h = 0;
        int m = 0;
        int s = 0;

        while (true) {
            s++;
            if (s==60) {
                m++;
                s = 0;
            }
            if (m==60) {
                h++;
                m = 0;
            }
            if (h == 24) {
                h = 0;
            }
            System.out.println(h + ":" + m + ":" + s);
            Thread.sleep(1000);
        }
    }
}