package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThreadPing extends Thread {

	private String siteServer;
	private String site;

	public ThreadPing(String siteServer, String site) {
		this.siteServer = siteServer;
		this.site = site;
	}

	@Override
	public void run() {
		ping();
	}

	@SuppressWarnings("deprecation")
	private void ping() {
		try {
			Process p = Runtime.getRuntime().exec("ping -4 -c 10 " + siteServer);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			linha = buffer.readLine();
			String separador = "=";
			while (linha.contains("bytes")) {
				String[] partes = linha.split(separador);
				String tempo = partes[3];
				System.out.println("Ping para " + site + ": " + tempo);
				linha = buffer.readLine();
			}
			separador = "/";
			while (linha != null) {
				String[] partes = linha.split(separador);
				if (linha.contains("rtt")) {
					String media = partes[4];
					System.out.println("Média do ping para " + site + ": " + media + " ms");
				}
				linha = buffer.readLine();
			}
			fluxo.close();
			leitor.close();
			buffer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
