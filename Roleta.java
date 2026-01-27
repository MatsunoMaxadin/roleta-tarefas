import java.util.Random;
import java.util.ArrayList;
public class Roleta{
	
	private ArrayList <String> tarefas = new ArrayList<String>();
	
	public Roleta(ArrayList<String> tarefas){
		this.tarefas = tarefas;
	}

	public String girarRoleta(){
		String tarefaEscolhida;

		Random gerador = new Random();

		int indiceTarefa = gerador.nextInt(this.tarefas.size());

		return this.tarefas.get(indiceTarefa);
	}
}
 	
