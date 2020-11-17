package App3;

public class hilo2 implements Runnable{
    @Override
    public void run() {
        for(int i =5;i<10;i++){
            System.out.println(Main.c1.get(i));
        }
    }
}
