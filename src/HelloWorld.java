import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorld extends JFrame {
	private JButton clickMe;
	public HelloWorld() {
		super("Hello World");
		setSize(300, 200);
		setLocation(200, 200);
		clickMe = new JButton("Click Me!");
		Container cp = getContentPane();
		cp.add(clickMe);
		clickMe.setToolTipText("Clica em mim!");
		clickMe.addActionListener((e) -> {clickMeClick();});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void clickMeClick(){
		JOptionPane.showMessageDialog(null, "Hello World!");
	}
	public static void iniciar() {
		new HelloWorld().setVisible(true);
	}
	public static void main(String[] args) {
		iniciar();
	}
}
