package prueba;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
/**
 *
 * @author DESTRUCTIVE
 */

public class Programa extends JFrame {

      
    JPanel jpanel = (JPanel) this.getContentPane();

    
    public Programa() {


        jpanel.setLayout(null);
        boolean bandera= true;
       
        int lg=0;

        while (bandera) {
             lg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese longitud de mariz"));
            if (lg >= 2 && lg <= 7) {
                bandera = false;
            }
        }
       
            JLabel[][] label = new JLabel[lg][lg];
            JLabel[][] label2 = new JLabel[lg][lg];
            JLabel[][] label3 = new JLabel[lg][lg];
            String resultado = "";
            int ultimo=0;
            for (int i = 0; i < label.length; i++) {
                for (int j = 0; j < label.length; j++) {
                    label[i][j] = new JLabel();
                    label[i][j].setBounds(new Rectangle(10, (i + 1) * 20, 60+(j*40), 100));
                    label[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                    jpanel.add(label[i][j], null);
                    resultado += label;
                    label[i][j].setText("N1 \n");
                   
                }
               
            }

            for (int i = 0; i < label2.length; i++) {
                for (int j = 0; j < label2.length; j++) {
                    label2[i][j] = new JLabel();
                    label2[i][j].setBounds(new Rectangle(10, (i + 1) * 20, 520+(j*40),100));
                    label2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                    jpanel.add(label2[i][j], null);
                    resultado += label2;
                    label2[i][j].setText("N2 \n ");
                }
            }
            
            for (int i = 0; i < label2.length; i++) {
                for (int j = 0; j < label2.length; j++) {
                    label2[i][j] = new JLabel();
                    label2[i][j].setBounds(new Rectangle(10, (i + 1) * 20, 300+(j*40), 500));
                    label2[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                    jpanel.add(label2[i][j], null);
                    resultado += label2;
                    label2[i][j].setText("R \n ");
                }
            }
            
        

       
        setSize(500, 500);

        JLabel titulo1 = new JLabel("Matriz A");   
         titulo1.setBounds(50, 10, 80, 80);
         jpanel.add(titulo1);
         
         JLabel titulo2 = new JLabel("Matriz  B");
         titulo2.setBounds(300, 10, 80, 80);
         jpanel.add(titulo2);
        setVisible(true);
        
        JLabel titulo3 = new JLabel("Resultado");
         titulo3.setBounds(150, 200, 80, 80);
         jpanel.add(titulo3);
        setVisible(true);
        

    }
   
    public static void main(String arg[]) {
        new Programa();

    }

}
