import java.io.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Arquivo{
	
	public ArrayList<String> tarefas = new ArrayList<String>();
	public File arquivo = new File("/home/pedro/Área de Trabalho/codigos/roleta-tarefas/roleta-tarefas/listas");
	public String[] listas = arquivo.list();
	
	public boolean hasListas(){
		listas = arquivo.list();
		boolean resposta;

		if (listas.length >= 1)
			resposta = true;
		else
			resposta = false;

		return resposta;
	
	}
	public String showListas(){
		String diretorio = "";
		listas = arquivo.list();
		int i = 1;
		if (listas.length >= 1){

			for (String lista: listas){
				diretorio += String.format("%d - %s\n",i, lista);
				i++;
			}

		} else{
			diretorio = "Repertório vazio! Por favor, adicione listas.";
		}

		return diretorio;
	
	}

	public ArrayList<String> getListaTarefas(int indice) throws IOException{
		listas = arquivo.list();

		if (indice < 1 || indice > listas.length){
			JOptionPane.showMessageDialog(null, "Por favor, digite um indice válido.");
		} else {
			FileInputStream entrada = new FileInputStream("listas/"+listas[indice-1]);
			InputStreamReader entradaFormatada = new InputStreamReader(entrada);
			BufferedReader entradaString = new BufferedReader(entradaFormatada);
			
			String tarefa = entradaString.readLine();

			while(tarefa != null){
				tarefas.add(tarefa);
				tarefa = entradaString.readLine();
			}


		}
		return this.tarefas;
	}
	

}
