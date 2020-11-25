/*
* Classe CompraDeProdutosWindow - Representa a janela de compra de produtos na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-13
*/

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
import javax.swing.Icon;

public class CompraDeProdutosWindow {

	private JFrame frame; /** Frame principal */	
	private double totalCompra = 0.0; /** Somatorio do total da compra */
	private ArrayList<Produto> produtos = new ArrayList<Produto>(); /** Lista de produtos comprados */

	/*
	* Construtor da classe.
	*/
	public CompraDeProdutosWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JLabel descricaoLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-descricao.png")));
		descricaoLabel.setBounds(31, 242, 71, 16);
		frame.getContentPane().add(descricaoLabel);
		
		JLabel quantidadeLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-preco-compra.png")));
		quantidadeLabel_1.setBounds(372, 242, 154, 16);
		frame.getContentPane().add(quantidadeLabel_1);
		
		JTextField descricao = new JTextField();
		descricao.setColumns(10);
		descricao.setBounds(31, 265, 288, 26);
		frame.getContentPane().add(descricao);
		
		JTextField precoCompra = new JTextField();
		precoCompra.setColumns(10);
		precoCompra.setBounds(372, 270, 123, 26);
		frame.getContentPane().add(precoCompra);
		
		JLabel codBarrasLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-codbarras.png")));
		codBarrasLabel.setBounds(31, 308, 97, 16);
		frame.getContentPane().add(codBarrasLabel);
		
		JLabel quantidadeLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-quantidade.png")));
		quantidadeLabel.setBounds(565, 242, 86, 16);
		frame.getContentPane().add(quantidadeLabel);
		
		JTextField codBarras = new JTextField();
		codBarras.setColumns(10);
		codBarras.setBounds(31, 336, 288, 26);
		frame.getContentPane().add(codBarras);
		
		JTextField quantidade = new JTextField();
		quantidade.setColumns(10);
		quantidade.setBounds(565, 270, 123, 26);
		frame.getContentPane().add(quantidade);
		
		JLabel precoVendaLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-preco-venda.png")));
		precoVendaLabel.setBounds(372, 308, 154, 16);
		frame.getContentPane().add(precoVendaLabel);
		
		JTextField precoVenda = new JTextField();
		precoVenda.setColumns(10);
		precoVenda.setBounds(372, 336, 123, 26);
		frame.getContentPane().add(precoVenda);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(this.getClass().getResource("/botao-adicionarproduto.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(codBarras.getText(), descricao.getText(), Integer.parseInt(quantidade.getText()), Double.parseDouble(precoVenda.getText()));
				produtos.add(produto);
				
				totalCompra += Double.parseDouble(precoCompra.getText()) * Integer.parseInt(quantidade.getText());
								
				codBarras.setText("");
				descricao.setText("");
				quantidade.setText("");
				precoCompra.setText("");
				precoVenda.setText("");
				
			}
		});
		btnNewButton_1.setBounds(105, 432, 214, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton(new ImageIcon(this.getClass().getResource("/botao-finalizarcompra.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Produto produtoComprado : produtos) {
					if (ProdutoDAO.verificaSeProdutoEstaNoEstoque(produtoComprado.getCodBarras())) {
						ProdutoDAO.aumentaQuantidadeNoEstoque(produtoComprado.getCodBarras(), produtoComprado.getQuantidade());
					} else {
						ProdutoDAO.adicionaProdutoNoEstoque(produtoComprado);
					}
				}
				
				CompraDeProdutos compra = new CompraDeProdutos(totalCompra);
				CompraDeProdutosDAO.adicionaCompra(compra);
				
				JOptionPane.showMessageDialog(null, "Uma compra foi adicionada ao estoque no valor de R$" + String.format("%.2f", totalCompra) + ".");
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel_3.setBounds(21, 23, 97, 77);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon(this.getClass().getResource("/label-compra-titulo.png")));
		lblNewLabel_4.setBounds(118, 34, 276, 66);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon(this.getClass().getResource("/label-compra-sub1.png")));
		lblNewLabel_5.setBounds(27, 168, 496, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(new ImageIcon(this.getClass().getResource("/label-compra-sub2.png")));
		lblNewLabel_6.setBounds(16, 138, 301, 29);
		frame.getContentPane().add(lblNewLabel_6);

		
		btnNewButton.setBounds(411, 432, 214, 29);
		frame.getContentPane().add(btnNewButton);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}
