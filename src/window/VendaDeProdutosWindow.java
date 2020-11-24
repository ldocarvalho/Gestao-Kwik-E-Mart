package window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import db.ProdutoDAO;
import model.Produto;

public class VendaDeProdutosWindow {

	private JFrame frame;
	private JTextField descricao;
	private JTextField codBarras;
	private JTextField quantidade;
	private JTextField preco;
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public VendaDeProdutosWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-venda-sub1.png")));
		lblNewLabel.setBounds(27, 168, 474, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-venda-sub2.png")));
		lblNewLabel_1.setBounds(16, 138, 301, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel descricaoLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-descricao.png")));
		descricaoLabel.setBounds(16, 228, 96, 16);
		frame.getContentPane().add(descricaoLabel);
		
		JLabel codBarrasLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-codbarras.png")));
		codBarrasLabel.setBounds(27, 294, 104, 16);
		frame.getContentPane().add(codBarrasLabel);
		
		JLabel quantidadeLabel = new JLabel(new ImageIcon(this.getClass().getResource("/label-quantidade.png")));
		quantidadeLabel.setBounds(409, 294, 86, 16);
		frame.getContentPane().add(quantidadeLabel);
		
		descricao = new JTextField();
		descricao.setBounds(29, 251, 288, 26);
		frame.getContentPane().add(descricao);
		descricao.setColumns(10);
		
		codBarras = new JTextField();
		codBarras.setBounds(29, 322, 288, 26);
		frame.getContentPane().add(codBarras);
		codBarras.setColumns(10);
		
		quantidade = new JTextField();
		quantidade.setBounds(409, 322, 86, 26);
		frame.getContentPane().add(quantidade);
		quantidade.setColumns(10);
		
		JButton btnNewButton = new JButton(new ImageIcon(this.getClass().getResource("/botao-finalizarvenda.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Produto produtoVendido : produtos) {
					ProdutoDAO.diminuiQuantidadeNoEstoque(produtoVendido.getCodBarras(), produtoVendido.getQuantidade());
				}
				
				VendaFinalizadaWindow vendaFinalizadaWindow = new VendaFinalizadaWindow(produtos);
			}
		});
		btnNewButton.setBounds(409, 418, 214, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(new ImageIcon(this.getClass().getResource("/botao-adicionarproduto.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(codBarras.getText(), descricao.getText(), Integer.parseInt(quantidade.getText()), Double.parseDouble(preco.getText()));
				produtos.add(produto);
								
				codBarras.setText("");
				descricao.setText("");
				quantidade.setText("");
				preco.setText("");
			}
		});
		btnNewButton_1.setBounds(103, 418, 214, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		preco = new JTextField();
		preco.setColumns(10);
		preco.setBounds(409, 256, 86, 26);
		frame.getContentPane().add(preco);
		
		JLabel quantidadeLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-preco.png")));
		quantidadeLabel_1.setBounds(409, 228, 81, 16);
		frame.getContentPane().add(quantidadeLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel_2.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/label-venda-titulo.png")));
		lblNewLabel_3.setBounds(118, 34, 276, 66);
		frame.getContentPane().add(lblNewLabel_3);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
