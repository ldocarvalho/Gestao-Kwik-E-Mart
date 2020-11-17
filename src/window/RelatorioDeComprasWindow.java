package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import db.CompraDeProdutosDAO;
import model.CompraDeProdutos;

public class RelatorioDeComprasWindow {

	private JFrame frame;
	private ArrayList<CompraDeProdutos> listaDeCompras;

	public RelatorioDeComprasWindow() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		listaDeCompras = CompraDeProdutosDAO.listaCompras();
		
        String[] columns = {"Id da Compra", "Valor total da Compra (R$)"};

		Object[][] data = new Object[listaDeCompras.size()][2];
		
		for(int i=0; i<listaDeCompras.size(); i++) {
			data[i][0] = i+1;
			data[i][1] = listaDeCompras.get(i).getTotalCompra();
		}
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel_3.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel_3, BorderLayout.NORTH);
		
		JTable table = new JTable(data, columns);
		JScrollPane scrollPane = new JScrollPane(table);

		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
