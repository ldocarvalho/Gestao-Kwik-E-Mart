package window;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import db.VendaDeProdutosDAO;
import model.Produto;
import model.VendaDeProdutos;

public class VendaFinalizadaWindow {

	private JFrame frame;
	private JTextField totalPagamento;
	private JTextField troco;
	
	private double soma = 0;

	public VendaFinalizadaWindow(ArrayList<Produto> produtosVendidos) {
		
		for(Produto produto : produtosVendidos) {
			soma += produto.getPreco() * produto.getQuantidade();
		}
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel label = new JLabel("New label");
		frame.getContentPane().add(label, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("Ao finalizar os produtos, conclua o processo.");
		lblNewLabel_1.setBounds(30, 161, 668, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Adicione nos campos abaixo as informações da venda realizada.");
		lblNewLabel.setBounds(30, 131, 668, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Preço total");
		lblNewLabel_2.setBounds(30, 226, 109, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(String.format("%.2f", this.soma));
		lblNewLabel_2_1.setBounds(189, 226, 102, 16);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Total do pagamento");
		lblNewLabel_3.setBounds(31, 270, 135, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Troco");
		lblNewLabel_3_1.setBounds(31, 315, 135, 16);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		totalPagamento = new JTextField();
		totalPagamento.setBounds(189, 265, 269, 26);
		frame.getContentPane().add(totalPagamento);
		totalPagamento.setColumns(10);
		
		troco = new JTextField();
		troco.setColumns(10);
		troco.setBounds(189, 310, 269, 26);
		frame.getContentPane().add(troco);
		
		JLabel lblNewLabel_4 = new JLabel("Forma de pagamento");
		lblNewLabel_4.setBounds(31, 362, 135, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Escolha uma forma de pagamento");
		comboBox.addItem("Dinheiro");
		comboBox.addItem("Cartão de crédito");
		comboBox.addItem("Cartão de débito");
		comboBox.setBounds(189, 358, 269, 27);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Finalizar venda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendaDeProdutos vendaFinalizada = new VendaDeProdutos(soma, Double.parseDouble(totalPagamento.getText()), Double.parseDouble(troco.getText()), comboBox.getItemAt(0));
				VendaDeProdutosDAO.adicionaVenda(vendaFinalizada);
			}
		});
		btnNewButton.setBounds(278, 433, 180, 29);
		frame.getContentPane().add(btnNewButton);
		
		frame.setVisible(true);

	}
}
