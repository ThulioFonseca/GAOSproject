package aplication;

import java.awt.Color;


import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Errors {
	
	public void TestErrors (JTextField text) {
		
		
		if (text.getText() == null || text.getText().isEmpty()) {
			
			text.setBackground(Color.red);

			throw new RuntimeException("Este campo não pode estar vazio!");

		}
		
	}
	
public void TestErrors (JTextArea text) {
		
		
		if (text.getText() == null || text.getText().isEmpty()) {
			
			text.setBackground(Color.red);

			throw new RuntimeException("Este campo não pode estar vazio!");

		}
		
	}

public void TestErrors(JRadioButton button_1, JRadioButton button_2) {
	
	if (button_1.isSelected() == false 
			&& button_2.isSelected() == false) {

		button_1.setBackground(Color.red);
		button_2.setBackground(Color.red);

		throw new RuntimeException("Selecione um Status antes de salvar!");

	}
}
}
