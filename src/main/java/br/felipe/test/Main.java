package br.felipe.test;

import br.felipe.test.frame.UIButton;
import br.felipe.test.frame.UIFrame;
import br.felipe.test.frame.UIPanel;

public class Main implements Runnable {
	
	private Thread thread;
	
	private UIFrame frame;
	
	public Main() {
		this.frame = new UIFrame();
		this.frame.loadWindowsForm();
		this.frame.configureAndShow(800, 400);		
		this.thread = new Thread(this);
		this.build();
	}
	
	private void build() {
		UIPanel panel = new UIPanel();
		panel.buildDefaultPanel(frame);
		new UIButton("Botãozin", panel, 10, 10, 200, 25);
		this.frame.add(panel);
	}
	
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		new Main().thread.start();
	}
	
}