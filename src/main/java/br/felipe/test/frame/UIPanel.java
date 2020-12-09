package br.felipe.test.frame;

import javax.swing.JPanel;

public class UIPanel extends JPanel {
	
	private static final long serialVersionUID = -8385336994200314494L;
	
	public void buildDefaultPanel(UIFrame frame) {
		this.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		this.setLayout(null);
	}
	
}