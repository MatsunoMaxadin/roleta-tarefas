import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Menu{
	private Jlabel titulo = new JLabel("Bem-vindo à Roleta de Tarefas!");
	private JButton inicializar = new JButton("Inicializar");

	public Menu(){
		super("Roleta de tarefas");
		setLayout( new FlowLayout() );

		add(titulo);

		
	}
}
