//http://www.arquivodecodigos.net/dicas/java-obtendo-a-soma-dos-valores-dos-elementos-de-um-array-de-inteiros-1015.html
//https://gist.github.com/marioluan/4135463

package exercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Estacionamento {

	static JFrame telaPrincipal = new JFrame("Estacionamento");
	static JFrame telaEntrada = new JFrame("Tipo de Vaga");
	//static JFrame telaSaida = new JFrame("Saída de Veiculo");

	//static JButton tabelaVagas=new JButton("Planta de Vagas");
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
	
	static String[][] piso1 = new String[21][3];
	static String[][] piso2 = new String[21][3];
	static String[][] piso3 = new String[21][3];

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
		for (int i = 0; i < piso1.length; i++) {
			piso1[i][2] = "Disponível";
			if (i < 1) {
				piso1[i][1] = "Deficiente";
			}
			if (i <= 1 && i >= 10) {
				piso1[i][1] = "Moto";
			}
			if (i > 10) {
				piso1[i][1] = "Comum";
			}
		}
		for (int i = 0; i < piso2.length; i++) {
			piso2[i][2] = "Disponível";
			if (i < 1) {
				piso2[i][1] = "Deficiente";
			}
			if (i <= 1 && i >= 10) {
				piso2[i][1] = "Moto";
			}
			if (i > 10) {
				piso3[i][1] = "Comum";
			}
		}
		for (int i = 0; i < piso3.length; i++) {
			piso3[i][2] = "Disponível";
			if (i < 1) {
				piso3[i][1] = "Deficiente";
			}
			if (i <= 1 && i >= 10) {
				piso3[i][1] = "Moto";
			}
			if (i > 10) {
				piso3[i][1] = "Comum";
			}
		}

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
			}
		});

	}
}
