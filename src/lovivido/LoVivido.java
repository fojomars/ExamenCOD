/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre; // Cambie el nombre la variable n por nombre
        String edad; // Cambie el nombre de la variable e por edad

        int meses; // Cambie el nombre de la variable m por meses
        int dias; // Cambie el nombre de la variable d por dias
        int horas; // Cambie el nombre de la variable h por horas
        int años; // Cambie el nombre de la variable a por años

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        años = Integer.parseInt(edad);

        meses = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + meses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
