public class ThreadSimples extends Thread {
    String nomeThread;
    int tempo;
    
    public ThreadSimples(String str, int t){
        nomeThread = str;
        tempo = t;
    }
    
    public void run(){
        
        try{
            for(int i = 0; i < 10; i++){
                System.out.println(i + " " + nomeThread);
                Thread.sleep(tempo*1000);
            }
            System.out.println("Ok! " + nomeThread);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
