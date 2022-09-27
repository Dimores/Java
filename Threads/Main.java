public class Main{
    
    public static void main(String[] args){
        
        Thread t1 = new Thread(
            () -> System.out.println("Eu amo Threads!"));
        t1.start();
        //ThreadSimples t2 = new ThreadSimples("Thread2", 2);
        //ThreadSimples t3 = new ThreadSimples("Thread3", 3);
        //ThreadSimples t4 = new ThreadSimples("Thread4", 4);
        
        //t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
    }
}
