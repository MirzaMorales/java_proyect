package mx.utng.sesion24.dp.factory;

import javax.swing.JButton;
//JFrame es una pantalla
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//1er paso (Declalar un JFrame)
public class Cliente extends JFrame{

    //Declaro dos cajas de texto (formulario)
    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    //Creamos los objetos de inicio de la ventana
    public Cliente() {
        //se manda a llamar al constructor de la super clase JFrame colocandole un titulo
        super("Login");
        //pongo una operacion de cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Coloco las dienciones de ancho y alto
        setSize(300, 150);
        //Defino un contenedor de elementos visuales
        JPanel panel = new JPanel();
        //*al panel le doy un diseño    **3=columnas**|**2=filas**
        panel.setLayout(new GridLayout(3, 2));
        //etiqueta para el usuario
        JLabel lbUsuario = new JLabel("Usuario: ");
        //etiqueta para el pasword
        JLabel lbPassword = new JLabel("Password: ");
        //creamos las cajas de texto 
        txtUsuario = new JTextField();
        txtPassword = new JPasswordField();

        //Creamos un boton
        JButton btnLogin = new JButton("Login");
        
        //Colocamos accion al boton
        btnLogin.addActionListener(new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e){

                String usuario = txtUsuario.getText();
                char[] caraPassword = txtPassword.getPassword();
                String password = new String(caraPassword);

            if(validarLogin(usuario, password)){
                JOptionPane.showMessageDialog(Cliente.this, "Bienvenido", "Validacion", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(Cliente.this, "Contraseña o usuario incorrectos");
            }
             System.out.println("Usuario: "+usuario+", Password: "+password);
                    }
                });
                //Añadir los elentos visuales al contenedor

                panel.add(lbUsuario);
                panel.add(txtUsuario);
                panel.add(lbPassword);
                panel.add(txtPassword);
                panel.add(btnLogin);

                //Agregando a la ventana panel
                add(panel);
                
                //hacemos visible la ventana
                setVisible(true);
                
                //Centrar la ventana
                setLocationRelativeTo(null);
    }
            

        
        public static void main(String[] args) {
            new Cliente();
    }

    private boolean validarLogin (String usuario, String password){
    return usuario.equals("utng")&& password.equals("xyz123");
    }
}


    

