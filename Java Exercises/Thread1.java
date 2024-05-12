/* public class Thread1 extends Thread {
    public void run(){
        System.out.println("Hello world!");

    }
}
 */


public class Thread1 extends Thread {
    public void run(){
        for (int i = 1; i < 21; i++) {
            if (i%2==0) {
                System.out.println(i);

            }
        }

    }
}
