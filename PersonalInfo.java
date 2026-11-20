import java.awt.Color; 
import java.awt.Font; 
import java.awt.Graphics; 
import javax.swing.JFrame; 
import javax.swing.JPanel;
// We change 'extends Applet' to 'extends JPanel' for modern Java windows 
public class PersonalInfo extends JPanel {
// This handles your visual drawings, text, and layout 
@Override
protected void paintComponent(Graphics g) { 
super.paintComponent(g);
g.setColor(Color.BLU
E);
g.setFont(new Font("Arial", Font.BOLD, 18));
g.drawString("PERSONAL INFORMATION",
50, 50);
g.setColor(Color.BLACK);
g.setFont(new Font("Arial", Font.PLAIN, 14)); 
g.drawString("Name: John Doe", 50, 100);
g.drawString("Course: Java Programming", 50, 130); g.drawString("Status: Successfully
Migrated from Applet!", 50, 160); SG COLLEGE,KOPPAL BCA III SEM JAVA PROGRAMMING
23
}
// The essential 'main' entry point method that modern Java requires to execute 
public static void main(String[] args) {
JFrame frame = new JFrame("Personal Information Window");
// Create an instance of this layout panel class 
PersonalInfo panel = new PersonalInfo();
frame.setSize(500, 400);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fully terminates
program when closed
frame.setVisible(true); 
}
}
