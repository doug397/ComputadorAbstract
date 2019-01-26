package br.com.linux;

import br.com.interfaces.IJanela;

public class JanelaLinux implements IJanela {

	@Override
	public void open() {
		System.out.println("JanelaLinux Open");
		
	}

	@Override
	public void close() {
		System.out.println("JanelaLinux Close");
		
	}

}
