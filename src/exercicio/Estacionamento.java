//http://www.arquivodecodigos.net/dicas/java-obtendo-a-soma-dos-valores-dos-elementos-de-um-array-de-inteiros-1015.html
//https://gist.github.com/marioluan/4135463

package exercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Estacionamento {

	static JFrame telaPrincipal = new JFrame("Estacionamento");
	static JFrame telaEntrada = new JFrame("Tipo de Vaga");
	// static JFrame telaSaida = new JFrame("Saída de Veiculo");

	// static JButton tabelaVagas=new JButton("Planta de Vagas");
	static JButton btEntrada = new JButton("Entrada");
	static JButton btSaida = new JButton("Saída");
	static JButton btDeficiente = new JButton("Deficiente");
	static JButton btMoto = new JButton("Moto");
	static JButton btComum = new JButton("Comum");

	static JTable tablePiso1 = new JTable();
	static JScrollPane scrollPiso1 = new JScrollPane();
	static JPanel panelPiso1 = new JPanel();

	static JTable tablePiso2 = new JTable();
	static JScrollPane scrollPiso2 = new JScrollPane();
	static JPanel panelPiso2 = new JPanel();

	static JTable tablePiso3 = new JTable();
	static JScrollPane scrollPiso3 = new JScrollPane();
	static JPanel panelPiso3 = new JPanel();

	static int[][][] matrizVagas = new int[3][21][3];
	static int numVagas = 21;

	static int contador = 63;

	final static int DEFICIENTE = 1;
	final static int MOTO = 2;
	final static int COMUM = 3;

	public static void main(String[] args) {
		resetarVagas();
		janelaPrincipal();

	}

	static void janelaPrincipal() {
		// criar Janela Principal
		telaPrincipal.setVisible(true);
		telaPrincipal.setSize(800, 600);
		telaPrincipal.setLocationRelativeTo(null);
		telaPrincipal.setResizable(false);
		telaPrincipal.setLayout(null);

		// adicionar botões
		// telaPrincipal.add(tabelaVagas);
		// tabelaVagas.setVisible(true);
		// tabelaVagas.setBounds(650, 150, 130, 30);

		telaPrincipal.add(panelPiso1);
		telaPrincipal.add(scrollPiso1);
		telaPrincipal.add(tablePiso1);
		tabelaPiso1();

		telaPrincipal.add(panelPiso2);
		telaPrincipal.add(scrollPiso2);
		telaPrincipal.add(tablePiso2);
		tabelaPiso2();

		telaPrincipal.add(panelPiso3);
		telaPrincipal.add(scrollPiso3);
		telaPrincipal.add(tablePiso3);
		tabelaPiso3();

		janelaEntrada();
		telaPrincipal.add(btEntrada);
		btEntrada.setVisible(true);
		btEntrada.setBounds(650, 200, 130, 30);

		telaPrincipal.add(btSaida);
		btSaida.setVisible(true);
		btSaida.setBounds(650, 250, 130, 30);

	}

	static void resetarVagas() {

		// [2] 0 = Disponível
		// [1] 1 = Deficiente
		// [1] 2 = Moto
		// [1] 3 = Comum

		for (int i = 0; i < numVagas; i++) {
			matrizVagas[0][i][2] = 0;

			if (i < 3) {
				matrizVagas[0][i][1] = DEFICIENTE;
			}
			if (i >= 3 && i <= 10) {
				matrizVagas[0][i][1] = MOTO;
			}
			if (i > 10) {
				matrizVagas[0][i][1] = COMUM;
			}
		}
		for (int i = 0; i < numVagas; i++) {
			matrizVagas[0][i][2] = 0;

			if (i < 3) {
				matrizVagas[1][i][1] = DEFICIENTE;
			}
			if (i >= 3 && i <= 10) {
				matrizVagas[1][i][1] = MOTO;
			}
			if (i > 10) {
				matrizVagas[1][i][1] = COMUM;
			}
		}
		for (int i = 0; i < numVagas; i++) {

			matrizVagas[2][i][2] = 0;

			if (i < 3) {
				matrizVagas[2][i][1] = DEFICIENTE;
			}
			if (i >= 3 && i <= 10) {
				matrizVagas[2][i][1] = MOTO;
			}
			if (i > 10) {
				matrizVagas[2][i][1] = COMUM;
			}
		}

	}

	static void tabelaPiso1() {
		telaPrincipal.add(panelPiso1);
		panelPiso1.add(scrollPiso1);
		scrollPiso1.add(tablePiso1);

		panelPiso1.setVisible(true);
		panelPiso1.setBounds(20, 180, 200, 358);
		panelPiso1.setLayout(null);

		scrollPiso1.setVisible(true);
		scrollPiso1.setBounds(0, 0, 200, 358);
		scrollPiso1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPiso1.setViewportView(tablePiso1);

		tablePiso1.setVisible(true);
		tablePiso1.setLayout(null);
		tablePiso1.setBounds(0, 0, 195, 358);
		tablePiso1.setModel(new DefaultTableModel(new Object[] { "Vaga", "Tipo", "Status" }, 0));

		for (int i = 0; i < numVagas; i++) {
			DefaultTableModel valores = (DefaultTableModel) tablePiso1.getModel();
			valores.addRow(new Object[] { i + 1, matrizVagas[0][i][1], matrizVagas[0][i][2] });
		}
		tablePiso1.getColumnModel().getColumn(0).setPreferredWidth(35);
	}

	static void tabelaPiso2() {
		telaPrincipal.add(panelPiso2);
		panelPiso2.add(scrollPiso2);
		scrollPiso2.add(tablePiso2);

		panelPiso2.setVisible(true);
		panelPiso2.setBounds(230, 180, 200, 358);
		panelPiso2.setLayout(null);

		scrollPiso2.setVisible(true);
		scrollPiso2.setBounds(0, 0, 200, 358);
		scrollPiso2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPiso2.setViewportView(tablePiso2);

		tablePiso2.setVisible(true);
		tablePiso2.setLayout(null);
		tablePiso2.setBounds(0, 0, 195, 358);
		tablePiso2.setModel(new DefaultTableModel(new Object[] { "Vaga", "Tipo", "Status" }, 0));

		for (int i = 0; i < numVagas; i++) {
			DefaultTableModel valores = (DefaultTableModel) tablePiso2.getModel();
			valores.addRow(new Object[] { i + 1, matrizVagas[1][i][1], matrizVagas[1][i][2] });
		}
		tablePiso2.getColumnModel().getColumn(0).setPreferredWidth(35);
	}

	static void tabelaPiso3() {
		telaPrincipal.add(panelPiso3);
		panelPiso3.add(scrollPiso3);
		scrollPiso3.add(tablePiso3);

		panelPiso3.setVisible(true);
		panelPiso3.setBounds(440, 180, 200, 358);
		panelPiso3.setLayout(null);

		scrollPiso3.setVisible(true);
		scrollPiso3.setBounds(0, 0, 200, 358);
		scrollPiso3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPiso3.setViewportView(tablePiso3);

		tablePiso3.setVisible(true);
		tablePiso3.setLayout(null);
		tablePiso3.setBounds(0, 0, 195, 358);
		tablePiso3.setModel(new DefaultTableModel(new Object[] { "Vaga", "Tipo", "Status" }, 0));

		for (int i = 0; i < numVagas; i++) {
			DefaultTableModel valores = (DefaultTableModel) tablePiso3.getModel();
			valores.addRow(new Object[] { i + 1, matrizVagas[2][i][1], matrizVagas[2][i][2] });
		}
		tablePiso3.getColumnModel().getColumn(0).setPreferredWidth(35);
	}

	static void janelaEntrada() {
		btEntrada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				telaEntrada.setVisible(true);
				telaEntrada.setSize(300, 300);
				telaEntrada.setLocationRelativeTo(null);
				telaEntrada.setResizable(false);
				telaEntrada.setLayout(null);

				// add Buttons (Selecionar Piso)
				telaEntrada.add(btComum);
				btComum.setVisible(true);
				btComum.setBounds(75, 30, 150, 50);

				telaEntrada.add(btMoto);
				btMoto.setVisible(true);
				btMoto.setBounds(75, 110, 150, 50);

				telaEntrada.add(btDeficiente);
				btDeficiente.setVisible(true);
				btDeficiente.setBounds(75, 190, 150, 50);

				acoesEntrada();
			}
		});

	}

	static void acoesEntrada() {
		
		btComum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				botaoComum();
			}
		});
		
	}
	static void botaoComum(){
		int vaga = (int) (Math.random() * 21);

		int piso = (int) (Math.random() * 3);

		if (contador > 0) {
			if(matrizVagas[piso][vaga][2] == 1){
				botaoComum();
			}else if (matrizVagas[piso][vaga][2] == 0 && matrizVagas[piso][vaga][1] == COMUM) {
				
				matrizVagas[piso][vaga][2] = 1;
				contador--;
				
				if (piso == 0) {

					tablePiso1.getModel().setValueAt("OCUPADO", vaga, 2);

				} else if (piso == 1) {

					tablePiso2.getModel().setValueAt("OCUPADO", vaga, 2);

				} else {

					tablePiso3.getModel().setValueAt("OCUPADO", vaga, 2);

				}

			}else{
				botaoComum();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não há vagas");

		}

	}

}