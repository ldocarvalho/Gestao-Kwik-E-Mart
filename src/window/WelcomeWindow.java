package window;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import db.BancoDeDados;

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
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JButton btnNewButton = new JButton(new ImageIcon(this.getClass().getResource("/botao-entrarcomusuario.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginWindow loginWindow = new LoginWindow();
			}
		});
		
		btnNewButton.setBounds(311, 308, 157, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(this.getClass().getResource("/botao-cadastrarusuario.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarWindow cadastrarWindow = new CadastrarWindow();
			}
		});
		
		
		btnNewButton_1.setBounds(311, 364, 157, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/logogrande.png")));
		lblNewLabel.setBounds(148, 76, 473, 220);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
