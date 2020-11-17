package App3;

public class hilo3 implements Runnable{
    @Override
    public void run() {
        for(int i =10;i<15;i++){
            System.out.println(Main.c1.get(i));
        }
    }
}
