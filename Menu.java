import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import java.util.ArrayList;

import java.io.*;

public class Menu extends JFrame{
	private JLabel titulo = new JLabel("Bem-vindo à Roleta de Tarefas!");
	private JButton adicionar = new JButton("Adicionar Tarefa");
	private JButton roletar = new JButton("Girar a roleta");
	private Arquivo arquivo = new Arquivo();
 	
	public Menu(){
		super("Roleta de tarefas");

		setLayout( new FlowLayout() );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);

		add(titulo);
		
		adicionar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if(evento.getSource() == adicionar){
					String op = "s";
					String tarefa;
					String nomeArquivo;
					ArrayList<String> tarefas = new ArrayList<String>();

					nomeArquivo = JOptionPane.showInputDialog("qual vai ser o nome do novo arquivo?");
						
					while(op.equals("s")){
						tarefa = JOptionPane.showInputDialog("Digite uma tarefa: ");
						tarefas.add(tarefa);
						op = JOptionPane.showInputDialog("Deseja inserir outra tarefa? (s/n)");
						
					}
					
					arquivo.createList(tarefas, nomeArquivo);
					

				}
			}
		
		});

		add(adicionar);

		roletar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evento){
				if (evento.getSource() == roletar){
					int indice;

					if (arquivo.hasListas()){
						
						String StringIndice = JOptionPane.showInputDialog("Listas salvas: " + arquivo.showListas());
						indice = Integer.parseInt(StringIndice.trim());
						ArrayList<String> tarefas = new ArrayList<String>();
			
						tarefas = arquivo.getListaTarefas(indice);
						
						 Roleta roleta = new Roleta(tarefas);
						 
						JOptionPane.showMessageDialog(null, String.format("Tarefa escolhida pro dia: %s", roleta.girarRoleta())); 
					
						
						
				} else {
					JOptionPane.showMessageDialog(null, "Não existem listas no momento! Por favor, adicione alguma.");
				
				} 
			}
		
		}
		}
		);

		add(roletar);


		
	}
}
