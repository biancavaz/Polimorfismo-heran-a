package ExplicacaoProf;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar componentes
		
		JLabel  usuario = new JLabel("usuario");
		JTextField txUsuario = new JTextField(); 
		JLabel senha = new JLabel ("Senha");
		//JTextField senha = new JTextField();
		JPasswordField txSenha = new JPasswordField();
		txSenha.setToolTipText("Informe uma senha de 8 digitos");
		txSenha.setBackground(Color.WHITE);
		txSenha.setForeground(Color.BLUE);
		txUsuario.setForeground(Color.BLUE);
		
		
		// agrupar componentes:
		Object[] componentes = {usuario, txUsuario, senha, txSenha};
		//JPanel painel = new JPanel (); 
		//painel.setLayout(new GridLayout(2,2));
		//painel.add(usuario);
		//painel.add(txUsuario);
		//painel.add(senha);
		//painel.add(txSenha);
		
		
		// criar janela 
		JOptionPane.showInternalMessageDialog(null, componentes);
		
		Cliente cliente = new Cliente ();
		if (cliente.verficarLogin(txUsuario.getText(), new String(txSenha.getPassword()))) {
			JOptionPane.showMessageDialog(null, "Login realizado com sucessesfull");
		}
		else{
			JOptionPane.showMessageDialog(null,"Login ou senha incorretos!");
		}
	}

}
