package prueba;

/**
 *
 * @author DESTRUCTIVE
 */
public class ThreadEjemplo extends Thread {

    public ThreadEjemplo(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+ i);
        }
        System.out.println("Termina thread ");
    }

    public static void main(String[] args) {
        new ThreadEjemplo("Hilo en la iteracion: ").start();
        System.out.println("Inicia thread main");
    }
}
