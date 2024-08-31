package Model;

import View.Menu_GUI;
import javax.swing.JOptionPane;

public class VerificarLogin_DAO {

    public static void Login() {
        String log = View.Login_GUI.UsuarioLogin.getText();
        log = log.toLowerCase();

        String senha = View.Login_GUI.SenhaLogin.getText();
        senha = senha.toLowerCase();

        if (log.equals("admin") && senha.equals("123")) {
            JOptionPane.showMessageDialog(null, "Seja Bem Vindo!");
            new Menu_GUI().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Senha ou Usuario incorretos,"
                    + "Tente Novamente");
        }
    }
}
