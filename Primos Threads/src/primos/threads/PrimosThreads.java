package primos.threads;

/**
 *
 * @author 5108250
 */
public class PrimosThreads {

    private static class PrimosThread extends Thread{

        public PrimosThread() {
            
        }
        
        
        
        //Se chamalo ele execulta a thread (se chamar pelo metodo Start();
        @Override
        public void run() {
            int contador = 0;
            while(true){
                
            }
        }

    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            PrimosThread t = new PrimosThread();
            t.start();
        }
    }
}