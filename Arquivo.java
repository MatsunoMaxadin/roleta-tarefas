import java.io.*;
import java.util.ArrayList;


public class Arquivo{
	
	public ArrayList<String> tarefas = new ArrayList<String>();
	public File arquivo = new File("/home/pedro/Área de Trabalho/codigos/roleta-tarefas/roleta-tarefas/listas");

	public void showListas(){
		String diretorio = "";
		String [] listas = arquivo.list();
		if (arquivo.isDirectory()){

			for (String lista: listas){
				diretorio += lista + "\n";
			}

		System.out.print(diretorio + "compilou");
		} else{
			System.out.print("diretório não encontrado");
		}
	
	}
	

}
