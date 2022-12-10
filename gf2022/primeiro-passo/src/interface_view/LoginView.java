package interface_view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginView {

	//Componentes tela: Tela, 2 - Labels(Usuario, Senha), 2 - Caixa de texto, 1 - Botao Logar
	
	
	
	public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Tela Login - Java Swing");
        miJFrame.setSize(500,300); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);
        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        
        JLabel usuarioJLabel = new JLabel();
        usuarioJLabel.setText("Usuario"); 
        miJPanel.add(usuarioJLabel);
        
        
        JTextField usuarioJText = new JTextField(10); 
        usuarioJText.setSize(200, 10);
        miJPanel.add(usuarioJText);
        
        
        JButton entrarJButton = new JButton("Acessar");
        miJPanel.add(entrarJButton);
        
        
        entrarJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(usuarioJText.getText().equals("wiu")) {
			        JFrame home = new JFrame("Tela Home - Java Swing");
			        home.setSize(1200, 600); 
			        home.setVisible(true);
					miJFrame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Usuario nao cadastrado. "+ usuarioJText.getText());	
				}
			}
		});

        miJFrame.add(miJPanel);
        // hacer visible JFrame
        miJFrame.setVisible(true);
        
    }
	
}

