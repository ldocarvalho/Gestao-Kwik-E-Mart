package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Produto;

public class VendaDeProdutosWindow {

	private JFrame frame;
	private JTextField descricao;
	private JTextField codBarras;
	private JTextField quantidade;
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public VendaDeProdutosWindow() {
		frame = new JFrame("Venda de Produtos");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicione nos campos abaixo as informações de cada produto vendido.");
		lblNewLabel.setBounds(29, 164, 668, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ao finalizar os produtos, finalize a venda.");
		lblNewLabel_1.setBounds(29, 135, 668, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel descricaoLabel = new JLabel("Descrição do produto");
		descricaoLabel.setBounds(29, 228, 149, 16);
		frame.getContentPane().add(descricaoLabel);
		
		JLabel codBarrasLabel = new JLabel("Código de barras");
		codBarrasLabel.setBounds(29, 294, 149, 16);
		frame.getContentPane().add(codBarrasLabel);
		
		JLabel quantidadeLabel = new JLabel("Quantidade");
		quantidadeLabel.setBounds(409, 294, 141, 16);
		frame.getContentPane().add(quantidadeLabel);
		
		descricao = new JTextField();
		descricao.setBounds(29, 251, 668, 26);
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
		
		JButton btnNewButton = new JButton("Finalizar venda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(409, 418, 214, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Adicionar novo produto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto produto = new Produto(codBarras.getText(), descricao.getText(), Integer.parseInt(quantidade.getText()));
				produtos.add(produto);
								
				codBarras.setText("");
				descricao.setText("");
				quantidade.setText("");
			}
		});
		btnNewButton_1.setBounds(103, 418, 214, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
