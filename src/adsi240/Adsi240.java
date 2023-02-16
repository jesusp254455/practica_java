package adsi240;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */

public class Adsi240 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        precio = Double.parseDouble(JOptionPane.showInputDialog(null, "digite el precio"));
        if (precio > 25000) {
            JOptionPane.showMessageDialog(null, "descuento");
        } else {
             JOptionPane.showMessageDialog(null, "sin descuento");
        }
    }

}
