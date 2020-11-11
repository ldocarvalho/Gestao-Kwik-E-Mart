package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
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
	public MenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(87, 165, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Venda de produtos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(47, 214, 149, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Compra de produtos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(280, 214, 149, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(320, 165, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Financeiro");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(521, 214, 149, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(561, 165, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("Relatório de vendas");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(165, 367, 149, 34);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(205, 318, 61, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Relatório de compras");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(405, 367, 149, 34);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setBounds(445, 318, 61, 16);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
