package window;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import db.CompraDeProdutosDAO;
import db.ProdutoDAO;
import db.VendaDeProdutosDAO;

public class FinanceiroWindow {

	private JFrame frame;

	private double lucroTotal = VendaDeProdutosDAO.valorFinanceiroVendas() - CompraDeProdutosDAO.valorFinanceiroCompras();

	public FinanceiroWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));

		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-financeiro-qtdprodutos.png")));
		lblNewLabel.setBounds(102, 222, 308, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-financeiro-valorfinanceiro.png")));
		lblNewLabel_1.setBounds(102, 267, 308, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-financeiro-lucrototal.png")));
		lblNewLabel_1_1.setBounds(102, 312, 317, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel(ProdutoDAO.numeroDeProdutosNoEstoque() + " produtos");
		lblNewLabel_2.setBounds(442, 222, 229, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("R$" + String.format("%.2f", ProdutoDAO.valorFinanceiroDoEstoque()));
		lblNewLabel_2_1.setBounds(442, 267, 167, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("R$" + String.format("%.2f", this.lucroTotal));
		lblNewLabel_2_1_1.setBounds(442, 312, 167, 16);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel_3.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon(this.getClass().getResource("/label-financeiro-title.png")));
		lblNewLabel_4.setBounds(131, 30, 299, 81);
		frame.getContentPane().add(lblNewLabel_4);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
