package prueba;

import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.M;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author DESTRUCTIVE
 */
public class ThreadEjemploMatriz extends Thread{

    JPanel jpanel = (JPanel) this.getContentPane();

    public ThreadEjemploMatriz(String str) {
        super(str);
    }

    public void run() {
        //Longirud de la matriz
        int n = 5;
        //String[][] matriz = new String[n][n];
        int a = 0;
        int b = n - 1;
        int valor = 0;
        JLabel[][] matriz = new JLabel[n][n];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c].setText(" [ ] ");
            }
        }

        for (int i = a; i <= b; i++) {
            matriz[a][i].setText(" [0] ");

        }
        for (int i = a + 1; i <= b; i++) {
            matriz[i][b].setText(" [0] ");
        }
        for (int i = b - 1; i >= a; i--) {
            matriz[b][i].setText(" [0] ");
        }
        for (int i = b - 1; i >= a + 1; i--) {
            matriz[i][a].setText(" [0] ");
        }
        int p = 0;
        int s = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                matriz[f][c] = new JLabel();
                matriz[f][c].setBounds(new Rectangle(10, (f + 1) * 20, 60 + (c * 40), 100));
                matriz[f][c].setHorizontalAlignment(SwingConstants.CENTER);
                ventana.add(matriz[f][c], null);

                matriz[f][c].setText("");
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadEjemploMatriz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        JFrame ventana = new JFrame("MAtriz con hilos");
        JButton boton = new JButton("Iniciar");
        ventana.setSize(250, 250);
        ventana.add(boton);
        
        boton.action('MouseClicked', hilo());
        

    }
    
    public hilo(){
    
        new ThreadEjemploMatriz("Hilo en la iteracion: ").start();
        System.out.println("Inicia thread");
    }

}
