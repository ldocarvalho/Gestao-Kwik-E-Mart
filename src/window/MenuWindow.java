package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.VendaDeProdutos;

public class MenuWindow {

	private JFrame frame;

	public MenuWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(88, 201, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton vendaDeProdutos = new JButton("Venda de produtos");
		vendaDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendaDeProdutosWindow venda = new VendaDeProdutosWindow();
			}
		});
		vendaDeProdutos.setBounds(48, 250, 149, 34);
		frame.getContentPane().add(vendaDeProdutos);
		
		JButton compraDeProdutos = new JButton("Compra de produtos");
		compraDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompraDeProdutosWindow compra = new CompraDeProdutosWindow();
			}
		});
		compraDeProdutos.setBounds(281, 250, 149, 34);
		frame.getContentPane().add(compraDeProdutos);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(321, 201, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton financeiro = new JButton("Financeiro");
		financeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceiroWindow financeiro = new FinanceiroWindow();
			}
		});
		financeiro.setBounds(522, 250, 149, 34);
		frame.getContentPane().add(financeiro);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(562, 201, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton relatorioVendas = new JButton("Relatório de vendas");
		relatorioVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		relatorioVendas.setBounds(166, 403, 149, 34);
		frame.getContentPane().add(relatorioVendas);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(206, 354, 61, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton relatorioCompras = new JButton("Relatório de compras");
		relatorioCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		relatorioCompras.setBounds(406, 403, 149, 34);
		frame.getContentPane().add(relatorioCompras);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setBounds(446, 354, 61, 16);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
