import javax.swing.*;
import java.util.Scanner;
 
 public class uppgift1 {
	public static void main (String[] args) {
		
	int k = 0;
	String s = "k:";
	JOptionPane.showInputDialog(null, "Skriv en siffra");
	while (k <= 10) {
		s = s+ " " +k*k;
		k++;
			}
		JOptionPane.showMessageDialog(null, s);
		}
	}	
				
				