package br.felipe.test.frame;

import javax.swing.JButton;

public class UIButton extends JButton {
	
	private static final long serialVersionUID = 8966010072236061583L;
	
	public UIButton(String text, UIPanel panel, int x, int y, int width, int height) {
		super(text);
		this.setBounds(x, y, width, height);
		panel.add(this);
		this.setFocusable(false);
	}
	
}