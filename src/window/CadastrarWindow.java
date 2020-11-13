package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db.UsuarioDAO;
import model.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	public CadastrarWindow() {
		frame = new JFrame("Cadastrar novo usuário");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome de usuário");
		lblNewLabel.setBounds(71, 160, 107, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(71, 201, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(211, 196, 222, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 155, 222, 26);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Cadastrar usuário");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = UsuarioDAO.getUsuarioSalvo(textField.getText(), textField_1.getText());
				if (usuario != null) {
					JOptionPane.showMessageDialog(null, "Usuário já cadastrado no sistema.");
				} else {
					boolean usuarioCadastradoComSucesso = UsuarioDAO.cadastraUsuario(textField.getText(), textField_1.getText());
					if (usuarioCadastradoComSucesso) {
						JOptionPane.showMessageDialog(null, "Seja bem-vinde ao sistema Kwik-E-Mart!");
						frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					} else {
						JOptionPane.showMessageDialog(null, "Falha ao cadastrar novo usuário no sistema. Tente novamente ou contate um administrador.");
						frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					}
				}
			}
			
		});
		btnNewButton.setBounds(141, 262, 170, 29);
		frame.getContentPane().add(btnNewButton);
		
		frame.setBounds(100, 100, 470, 360);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
