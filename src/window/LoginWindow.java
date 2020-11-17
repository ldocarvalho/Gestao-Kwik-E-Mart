package window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db.UsuarioDAO;
import model.Usuario;
import javax.swing.JPasswordField;

public class LoginWindow {

	private JFrame frame;
	private JPasswordField passwordField;
	
	public LoginWindow() {
		frame = new JFrame("Login");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JLabel lblNewLabel = new JLabel("Nome de usuário");
		lblNewLabel.setBounds(71, 160, 107, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(71, 201, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(211, 196, 222, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 155, 222, 26);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton(new ImageIcon(this.getClass().getResource("/botao-entrar.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuarioSalvo = UsuarioDAO.getUsuarioSalvo(textField.getText(), textField_1.getText());
				if (usuarioSalvo != null) {
					JOptionPane.showMessageDialog(null, "Seja bem-vinde de volta ao Kwik-E-Mart!");
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					MenuWindow menuWindow = new MenuWindow();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário não cadastrado no sistema ou senha incorreta.");
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				}
			}
		});
		btnNewButton.setBounds(173, 262, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/logopequena.png")));
		lblNewLabel_2.setBounds(99, 34, 262, 91);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		frame.setBounds(100, 100, 470, 360);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		frame.setVisible(true);
	}
}
