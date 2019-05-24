package Rede;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor01 {

	public static void main(String[] args){
		try {
			
			ServerSocket s = new ServerSocket(7000);
			
			while(true){
				Socket conexao = s.accept();
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
				
				String linha = entrada.readLine();
				
				System.out.println(linha);
			}
			
		} catch (Exception e) {
			
		}
	}
	
}
