import java.util.ArrayList;

public class Teste{
	public static void main(String [] args){
		ArrayList<String> tarefas = new ArrayList<String>();

		Roleta roleta = new Roleta(tarefas);

		System.out.println(roleta.girarRoleta());
	
	}
}
