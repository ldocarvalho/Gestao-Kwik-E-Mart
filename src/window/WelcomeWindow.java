package window;

import java.awt.EventQueue;

import javax.swing.JFrame;

import db.BancoDeDados;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeWindow window = new WelcomeWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeWindow() {
		BancoDeDados bancoDeDados = new BancoDeDados();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bem vindo ao sistema Kwik-E-Mart");
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Entrar com usuário");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginWindow loginWindow = new LoginWindow();
			}
		});
		
		btnNewButton.setBounds(311, 283, 157, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar novo usuário");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarWindow cadastrarWindow = new CadastrarWindow();
			}
		});
		
		
		btnNewButton_1.setBounds(311, 335, 157, 40);
		frame.getContentPane().add(btnNewButton_1);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
