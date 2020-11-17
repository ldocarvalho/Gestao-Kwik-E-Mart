package window;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db.CompraDeProdutosDAO;
import db.ProdutoDAO;
import model.CompraDeProdutos;
import model.Produto;

public class CompraDeProdutosWindow {

	private JFrame frame;
	private JTextField descricao;
	private JTextField precoCompra;
	private JTextField codBarras;
	private JTextField quantidade;
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public CompraDeProdutosWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JLabel lblNewLabel_1 = new JLabel("Ao finalizar os produtos, finalize a compra.");
		lblNewLabel_1.setBounds(31, 149, 668, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Adicione nos campos abaixo as informações de cada produto comprado.");
		lblNewLabel.setBounds(31, 178, 668, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel descricaoLabel = new JLabel("Descrição do produto");
		descricaoLabel.setBounds(31, 242, 149, 16);
		frame.getContentPane().add(descricaoLabel);
		
		JLabel quantidadeLabel_1 = new JLabel("Preço de compra");
		quantidadeLabel_1.setBounds(411, 242, 141, 16);
		frame.getContentPane().add(quantidadeLabel_1);
		
		descricao = new JTextField();
		descricao.setColumns(10);
		descricao.setBounds(31, 265, 288, 26);
		frame.getContentPane().add(descricao);
		
		precoCompra = new JTextField();
		precoCompra.setColumns(10);
		precoCompra.setBounds(411, 270, 86, 26);
		frame.getContentPane().add(precoCompra);
		
		JLabel codBarrasLabel = new JLabel("Código de barras");
		codBarrasLabel.setBounds(31, 308, 149, 16);
		frame.getContentPane().add(codBarrasLabel);
		
		JLabel quantidadeLabel = new JLabel("Quantidade");
		quantidadeLabel.setBounds(411, 308, 141, 16);
		frame.getContentPane().add(quantidadeLabel);
		
		codBarras = new JTextField();
		codBarras.setColumns(10);
		codBarras.setBounds(31, 336, 288, 26);
		frame.getContentPane().add(codBarras);
		
		quantidade = new JTextField();
		quantidade.setColumns(10);
		quantidade.setBounds(411, 336, 86, 26);
		frame.getContentPane().add(quantidade);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(this.getClass().getResource("/botao-adicionarproduto.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(codBarras.getText(), descricao.getText(), Integer.parseInt(quantidade.getText()), Double.parseDouble(precoCompra.getText()));
				produtos.add(produto);
								
				codBarras.setText("");
				descricao.setText("");
				quantidade.setText("");
				precoCompra.setText("");
			}
		});
		btnNewButton_1.setBounds(105, 432, 214, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton(new ImageIcon(this.getClass().getResource("/botao-finalizarcompra.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalCompra = 0;
				for (Produto produtoComprado : produtos) {
					if (ProdutoDAO.verificaSeProdutoEstaNoEstoque(produtoComprado.getCodBarras())) {
						ProdutoDAO.aumentaQuantidadeNoEstoque(produtoComprado.getCodBarras(), produtoComprado.getQuantidade());
					} else {
						ProdutoDAO.adicionaProdutoNoEstoque(produtoComprado);
					}
					totalCompra += produtoComprado.getPreco() * produtoComprado.getQuantidade();
				}
				
				CompraDeProdutos compra = new CompraDeProdutos(totalCompra);
				CompraDeProdutosDAO.adicionaCompra(compra);
				
				JOptionPane.showMessageDialog(null, "Uma compra foi adicionada ao estoque no valor de R$" + String.format("%.2f", totalCompra) + ".");
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel_3.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton.setBounds(411, 432, 214, 29);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
