package mx.utng.sesion24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaro una clase que  crea JFrame (ventana básica)
  public class Suma extends JFrame {

//Declaro dos elementos de formulario
    private JTextField txtN1;
    private JTextField txtN2;
    private JLabel resultLabel;

//Creando los elementos de incio de la ventana
    public Suma(){
//Llamo al construcotr de JFrame colocandole un titulo 
        super("Calculadora");

//Pongo una operación de cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//Dimenciones de cuadro

        setSize(300,150);

//Defino un contenedor de elementos visuales
        JPanel panel=new JPanel();

//Al panel le doy un diseño
        panel.setLayout(new GridLayout(3,4));

//Etiqueta para el usuario 
        JLabel lbN1= new JLabel("Numero1: ");

//Etiqueta para el password
        JLabel lbN2 = new JLabel ("Numero2: ");

//Creamos las cajas de texto
        txtN1= new JTextField();
        txtN2 = new JTextField();
        resultLabel= new JLabel();
//Creamos un boton
        JButton btnCalcular= new JButton("Calcular");
//Colocamos accion al boton
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Calcular")) {
        // Obtener los valores de los JTextField
                    double num1= Double.parseDouble(txtN1.getText());
                    double num2 = Double.parseDouble(txtN2.getText());
        
        // Calcular el resultado
                    double resultado = num1 + num2;
        
        // Actualizar el texto del JLabel con el resultado
                    resultLabel.setText("Resultado: " + resultado);
                }
                String num1 = txtN1.getText();
                String num2 = txtN2.getText();
               
               
                System.out.println("Valor1: "+num1+" , Valor2: "+num2);
            }
        });

        //Añadir los elementos visuales al contenedor 

        panel.add(txtN1);
        panel.add(txtN2);
        panel.add(btnCalcular);
        panel.add(resultLabel);

        //Agregando a la ventana en el panel 
        add(panel);
        //Hacemos visible a la ventana
        setVisible(true);

        //Centrar la ventana
        setLocationRelativeTo(null);
         
    }
    
    public static void main(String [] args) {
        new Suma();

    }


    }

