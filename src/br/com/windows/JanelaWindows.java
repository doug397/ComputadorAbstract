package br.com.windows;

import br.com.interfaces.IJanela;

public class JanelaWindows implements IJanela {

	@Override
	public void open() {
		System.out.println("JanelaWindows Open");
		
	}

	@Override
	public void close() {
		System.out.println("JanelaWindows close");
		
	}

}
