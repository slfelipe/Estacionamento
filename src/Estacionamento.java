//http://www.arquivodecodigos.net/dicas/java-obtendo-a-soma-dos-valores-dos-elementos-de-um-array-de-inteiros-1015.html
//https://gist.github.com/marioluan/4135463

import javax.swing.JButton;
import javax.swing.JFrame;

public class Estacionamento {
	
	
	static JFrame telaPrincipal = new JFrame("Estacionamento");
	static JFrame telaEntrada = new JFrame("Entrada de Veiculo");
	static JFrame telaSaida = new JFrame("Sa�da de Veiculo");
	
	static JButton Planta1=new JButton("Planta 1� Andar");
	static JButton Planta2=new JButton("Planta 2� Andar");
	static JButton Planta3=new JButton("Planta 3� Andar");
	
	public static void main(String[] args) {
		janelaPrincipal();
	}
	static void janelaPrincipal(){
		telaPrincipal.setVisible(true);
		telaPrincipal.setSize(800,600);
		telaPrincipal.setLocationRelativeTo(null);
		telaPrincipal.setResizable(false);
			
	}
}
