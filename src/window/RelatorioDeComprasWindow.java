package window;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.CompraDeProdutosDAO;
import model.CompraDeProdutos;

public class RelatorioDeComprasWindow {

	private JFrame frame;
	private JTable table;
	private ArrayList<CompraDeProdutos> listaDeCompras;

	public RelatorioDeComprasWindow() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		listaDeCompras = CompraDeProdutosDAO.listaCompras();
		
		String[] columns = new String[] {
	            "Id", "Total da Compra (R$)"
	    };
		
//		Object[][] data = new Object[listaDeCompras.size()][2];
//		
//		for(CompraDeProdutos compra : listaDeCompras) {
//			data
//		}
	       
	    Object[][] data = new Object[][] {
	            {1, 40.0},
	            {2, 70.0},
	            {3, 60.0 },
	    };
	         
//	    final Class[] columnClass = new Class[] {
//	            Integer.class, Double.class
//	    };
//	    
//	    DefaultTableModel model = new DefaultTableModel(data, columns) {
//			@Override
//	        public boolean isCellEditable(int row, int column) {
//	                return false;
//	        }
//	        
//	    	@Override
//	        public Class<?> getColumnClass(int columnIndex) {
//	                return columnClass[columnIndex];
//	        }
//	    };
		
		table = new JTable(data, columns);
		table.setBounds(33, 446, 642, -309);
		frame.getContentPane().add(table);
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
}
