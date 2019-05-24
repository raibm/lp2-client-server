package Rede;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Cliente01 {

	public static void main(String[] args) {
		try {
			int i = 0;
			Scanner aux = new Scanner (System.in);

			do {
				Socket s = new Socket("172.16.168.150", 7000);
				
				PrintStream ps = new PrintStream(s.getOutputStream());
				
				ps.println(JOptionPane.showInputDialog(aux));
				i++;
				s.close();
			} while (true);

		} catch (Exception e) {

			System.out.println("Ops! Aconteceu algum problema ao tentar enviar dados ou criar o socket.");

		}
	}

}
