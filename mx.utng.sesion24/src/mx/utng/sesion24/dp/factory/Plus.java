package mx.utng.sesion24.dp.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;


//1er paso (Declalar un JFrame)
public class Plus extends JFrame{

    //Declaro dos cajas de texto (formulario)
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JLabel txtResultado;

    //Creamos los objetos de inicio de la ventana
    public Plus() {
        //se manda a llamar al constructor de la super clase JFrame colocandole un titulo
        super("Calculadora");
        //pongo una operacion de cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Coloco las dienciones de ancho y alto
        setSize(300, 150);
        //Defino un contenedor de elementos visuales
        JPanel panel = new JPanel();
        //*al panel le doy un diseño    **3=columnas**|**2=filas**
        panel.setLayout(new GridLayout(4, 3));
        //etiqueta para el primer valor
        JLabel lbValor1 = new JLabel("El Numero: ");
        //etiqueta para el segundo valor
        JLabel lbValor2 = new JLabel("mas: ");
//======etiqueta para resultadp
//======JLabel lbResultado = new JLabel("Resultado: ");
        //creamos las cajas de texto 
        txtValor1 = new JTextField();
        txtValor2 = new JTextField();
        txtResultado = new JLabel();

        //Creamos un boton
        JButton btnCalcular = new JButton("Calcular");
        
        //Colocamos accion al boton
        btnCalcular.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e){

                double valor1= Double.parseDouble(txtValor1.getText());
                double valor2 = Double.parseDouble(txtValor2.getText());

                double resultado = valor1 + valor2;

                txtResultado.setText("Resultado: " + resultado);
                }
                String valor1 = txtValor1.getText();
                String valor2 = txtValor2.getText();

                

//==============System.out.println("Valor1: "+valor1+" , Valor2: "+valor2);
        
            }
            
        );
                //Añadir los elentos visuales al contenedor

                panel.add(lbValor1);
                panel.add(txtValor1);
                panel.add(lbValor2);
                panel.add(txtValor2);
                panel.add(txtResultado);
//==============panel.add(lbResultado);
                panel.add(btnCalcular);

                //Agregando a la ventana panel
                add(panel);
                
                //hacemos visible la ventana
                setVisible(true);
                
                //Centrar la ventana
                setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Plus();
    }

    }    

