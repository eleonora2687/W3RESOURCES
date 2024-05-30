public class Thread2 extends Thread{
    public void run(){
        for (int i = 1; i < 21; i++) {
            if (i%2==1) {
                System.out.println(i);

            }
        }

    }
}
