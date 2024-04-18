package mx.utng.sesion24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafx.event.ActionEvent;

public class Propuesta extends JFrame{
    
//Creamos los objetos de inicio de la ventana
    public Propuesta() {
//se manda a llamar al constructor de la super clase JFrame colocandole un titulo
    super("<3");
//pongo una operacion de cierre en el boton x
    setDefaultCloseOperation(EXIT_ON_CLOSE);
//Defino un contenedor de elementos visuales
    JPanel panel = new JPanel();
//Creamos un boton
    JButton btnSi = new JButton("Si");
//Creamos un boton
    JButton btnNo = new JButton("No");

   panel.add(btnSi);
   panel.add(btnNo);

   //Agregando a la ventana panel
   add(panel);
                
   //hacemos visible la ventana
   setVisible(true);
   
   //Centrar la ventana
   setLocationRelativeTo(null);


   public static void main(String[] args) {
    new Propuesta();
}
}
}
