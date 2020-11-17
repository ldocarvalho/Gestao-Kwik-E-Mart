package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
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
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);

		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
