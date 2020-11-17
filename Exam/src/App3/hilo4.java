package App3;

public class hilo4 implements Runnable{
    @Override
    public void run() {
        for(int i =015;i<20;i++){
            System.out.println(Main.c1.get(i));
        }
    }
}
