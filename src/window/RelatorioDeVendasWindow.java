package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import db.VendaDeProdutosDAO;
import model.VendaDeProdutos;

public class RelatorioDeVendasWindow {

	private JFrame frame;
	private ArrayList<VendaDeProdutos> listaDeVendas;


	public RelatorioDeVendasWindow() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51,13,160));
		frame.getContentPane().setLayout(null);
		
		listaDeVendas = VendaDeProdutosDAO.listaVendas();
		
        String[] columns = {"Id da Compra", "Valor total da Compra (R$)", "Total do Pagamento (R$)", "Troco (R$)", "Forma de pagamento"};

		Object[][] data = new Object[listaDeVendas.size()][5];
		
		for(int i=0; i<listaDeVendas.size(); i++) {
			data[i][0] = i+1;
			data[i][1] = listaDeVendas.get(i).getTotalCompra();
			data[i][2] = listaDeVendas.get(i).getTotalPagamento();
			data[i][3] = listaDeVendas.get(i).getTroco();
			data[i][4] = listaDeVendas.get(i).getFormaPagamento();
		}
		
		JTable table = new JTable(data, columns);
				
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/label-relatoriovendas-titulo.png")));
		lblNewLabel_2.setBounds(118, 34, 124, 66);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-vendas-sub1.png")));
		lblNewLabel_1.setBounds(6, 135, 699, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(28, 201, 663, 269);

		frame.getContentPane().add(scrollPane);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
