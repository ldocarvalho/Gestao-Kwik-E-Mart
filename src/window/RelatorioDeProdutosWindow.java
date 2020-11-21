package window;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import db.ProdutoDAO;
import model.Produto;

public class RelatorioDeProdutosWindow {

	private JFrame frame;
	private ArrayList<Produto> produtosNoEstoque;

	public RelatorioDeProdutosWindow() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51,13,160));
		frame.getContentPane().setLayout(null);
		
		produtosNoEstoque = ProdutoDAO.listaProdutosNoEstoque();
		
        String[] columns = {"Id", "Código de barras", "Descrição", "Quantidade", "Preço (R$)"};

		Object[][] data = new Object[produtosNoEstoque.size()][5];
		
		for(int i=0; i<produtosNoEstoque.size(); i++) {
			data[i][0] = i+1;
			data[i][1] = produtosNoEstoque.get(i).getCodBarras();
			data[i][2] = produtosNoEstoque.get(i).getDescricao();
			data[i][3] = produtosNoEstoque.get(i).getQuantidade();
			data[i][4] = produtosNoEstoque.get(i).getPreco();
		}
		
		JTable table = new JTable(data, columns);
				
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/label-relatorioprodutos-titulo.png")));
		lblNewLabel_2.setBounds(118, 34, 124, 66);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-relatorioprodutos-sub1.png")));
		lblNewLabel_1.setBounds(28, 135, 584, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(28, 201, 663, 269);

		frame.getContentPane().add(scrollPane);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
