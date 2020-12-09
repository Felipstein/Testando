package br.felipe.test.frame;

import java.awt.Dimension;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.felipe.test.frame.listeners.UIWindowListener;

public class UIFrame extends JFrame {
	
	private static final long serialVersionUID = -7185245328074210489L;
	
	private Dimension dimension;
	
	public UIFrame() {
		super("Aplicação Teste");
	}
	
	public void loadWindowsForm() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
	
	public void configureAndShow(int width, int height) {
		this.dimension = new Dimension(width, height);
		this.setSize(dimension);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.addWindowListener(new UIWindowListener() {
			@Override
			public void windowClosing(WindowEvent e) {
				onClosing();
			}
		});
	}
	
	public void onClosing() {
		System.out.println("Finalizando...");
		System.exit(0);
	}
	
}