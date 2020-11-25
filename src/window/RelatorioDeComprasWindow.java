/*
* Classe RelatorioDeComprasWindow - Representa a janela de relatório de compras feitas na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-14
*/

package window;

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

	private JFrame frame; /** Frame principal */
	private ArrayList<CompraDeProdutos> listaDeCompras; /** Lista de compras de produtos salvas no estoque */

	/*
	* Construtor da classe.
	*/
	public RelatorioDeComprasWindow() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51,13,160));
		frame.getContentPane().setLayout(null);
		
		listaDeCompras = CompraDeProdutosDAO.listaCompras();
		
        String[] columns = {"Id da Compra", "Valor total da Compra (R$)"};

		Object[][] data = new Object[listaDeCompras.size()][2];
		
		for(int i=0; i<listaDeCompras.size(); i++) {
			data[i][0] = i+1;
			data[i][1] = listaDeCompras.get(i).getTotalCompra();
		}
						
		JTable table = new JTable(data, columns);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/icone.png")));
		lblNewLabel.setBounds(6, 23, 113, 88);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/label-relatoriocompras-title.png")));
		lblNewLabel_2.setBounds(118, 34, 500, 66);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/label-relatoriocompras-sub1.png")));
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
