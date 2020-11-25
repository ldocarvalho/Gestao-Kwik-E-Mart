/*
* Classe MenuWindow - Representa a janela de Menu na aplicação
* @author Lucas Carvalho 
* @version 1.0, 2020-11-13
*/

package window;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuWindow {

	private JFrame frame; /** Frame principal */

	/*
	* Construtor da classe.
	*/
	public MenuWindow() {
		frame = new JFrame("Menu");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(51,13,160));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-venda.png")));
		lblNewLabel.setBounds(78, 157, 93, 81);
		frame.getContentPane().add(lblNewLabel);
		
		JButton vendaDeProdutos = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-venda.png")));
		vendaDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VendaDeProdutosWindow venda = new VendaDeProdutosWindow();
			}
		});
		vendaDeProdutos.setBounds(48, 250, 149, 34);
		frame.getContentPane().add(vendaDeProdutos);
		
		JButton compraDeProdutos = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-compra.png")));
		compraDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CompraDeProdutosWindow compra = new CompraDeProdutosWindow();
			}
		});
		compraDeProdutos.setBounds(524, 250, 149, 34);
		frame.getContentPane().add(compraDeProdutos);
		
		JButton financeiro = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-financeiro.png")));
		financeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinanceiroWindow financeiro = new FinanceiroWindow();
			}
		});
		financeiro.setBounds(280, 250, 149, 34);
		frame.getContentPane().add(financeiro);
		
		JButton relatorioVendas = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-relatoriodevendas.png")));
		relatorioVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioDeVendasWindow relatorioDeVendas = new RelatorioDeVendasWindow();
			}
		});
		relatorioVendas.setBounds(48, 403, 149, 34);
		frame.getContentPane().add(relatorioVendas);
		
		JButton relatorioCompras = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-relatoriocompras.png")));
		relatorioCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioDeComprasWindow relatorioDeCompras = new RelatorioDeComprasWindow();
			}
		});
		relatorioCompras.setBounds(524, 403, 149, 34);
		frame.getContentPane().add(relatorioCompras);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon(this.getClass().getResource("/logopequena.png")));
		lblNewLabel_3.setBounds(199, 41, 331, 105);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-financeiro.png")));
		lblNewLabel_1.setBounds(313, 157, 93, 81);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-compra.png")));
		lblNewLabel_2.setBounds(557, 157, 93, 81);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-relatoriodevendas.png")));
		lblNewLabel_4.setBounds(77, 310, 93, 81);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-relatoriocompras.png")));
		lblNewLabel_5.setBounds(555, 310, 93, 81);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel(new ImageIcon(this.getClass().getResource("/icone-menu-estoque.png")));
		lblNewLabel_5_1.setBounds(311, 310, 93, 81);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JButton relatorioCompras_1 = new JButton(new ImageIcon(this.getClass().getResource("/botao-menu-estoque.png")));
		relatorioCompras_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioDeProdutosWindow relatorioDeProdutos = new RelatorioDeProdutosWindow();
			}
		});
		relatorioCompras_1.setBounds(280, 403, 149, 34);
		frame.getContentPane().add(relatorioCompras_1);
		
		frame.setBounds(100, 100, 735, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
