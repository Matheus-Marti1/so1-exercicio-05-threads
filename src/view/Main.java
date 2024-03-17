package view;

import controller.ThreadPing;

public class Main {

	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		
		if (os.contains("Linux")) {
			String googleServer = "www.google.com.br";
			String google = "Google";
			String uolServer = "www.uol.com.br";
			String uol = "Uol";
			String terraServer = "www.terra.com.br";
			String terra = "Terra";
			
			Thread tPing1 = new ThreadPing(googleServer, google);
			Thread tPing2 = new ThreadPing(uolServer, uol);
			Thread tPing3 = new ThreadPing(terraServer, terra);
			tPing1.start();
			tPing2.start();
			tPing3.start();
		} else {
			System.err.println("Erro: sistema operacional não reconhecido como Linux.");
		}

	}

}
