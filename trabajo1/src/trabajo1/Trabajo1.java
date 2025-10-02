/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani1
 */
public class Trabajo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
        int edad ; 
   double salario = 10000000.00 ;
   String cadena;
   cadena="Este es mi primer texto";
   boolean bandera = true;
        JOptionPane.showMessageDialog(null, cadena + "" +salario);
//jop + control espacio, despues control espacio y showM
String cadena2;
cadena2=" Hola soy Daniel ";
JOptionPane.showMessageDialog(null, cadena2);
         */
/*
String lectura;
lectura = JOptionPane.showInputDialog("Digite su edad: ");
int edad ;
edad = Integer.parseInt(lectura);
JOptionPane.showMessageDialog(null, edad);
if(edad>17){
 JOptionPane.showMessageDialog(null, "Puedo votar");
}else{
    JOptionPane.showMessageDialog(null, "NO puedo votar");
}
*/
int diaSemana = JOptionPane.showInputDialog("Digite el dia : ");
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
                
                break;
            default:
                throw new AssertionError();
        }

    }
    
}