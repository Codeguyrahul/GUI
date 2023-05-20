package Graphics;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class ButtonDemo3 extends JFrame {

	 private ButtonDemo3(String title) { //
	 super(title);
	 this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	 Component c = this;

	 JButton button = new JButton("Hit me");
	 button.setActionCommand("OUCH!");

	 button.addActionListener(new ActionListener () {
	 int nEvents = 0; // number of events handled
	 public void actionPerformed(ActionEvent e) {
	 nEvents++;
	 JOptionPane.showMessageDialog(c, e.getActionCommand() + " " + nEvents);
	 }
	 });
	 this.add(button); this.pack(); this.setVisible(true);
	 }

	 public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable() {
	 public void run() {
	 ButtonDemo3 app = new ButtonDemo3("Button Demo");
	 app.setVisible(true);
	 }
	 });
	 }
	}