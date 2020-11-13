package window;

import java.awt.EventQueue;

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
		
		JLabel lblNewLabel = new JLabel("Quantidade de produtos em estoque");
		lblNewLabel.setBounds(102, 222, 268, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor financeiro em produtos");
		lblNewLabel_1.setBounds(102, 267, 268, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lucro total do Kwik-E-Mart");
		lblNewLabel_1_1.setBounds(102, 312, 268, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel(ProdutoDAO.numeroDeProdutosNoEstoque() + " produtos");
		lblNewLabel_2.setBounds(380, 222, 229, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("R$" + String.format("%.2f", ProdutoDAO.valorFinanceiroDoEstoque()));
		lblNewLabel_2_1.setBounds(380, 267, 229, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("R$" + String.format("%.2f", this.lucroTotal));
		lblNewLabel_2_1_1.setBounds(380, 312, 229, 16);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
