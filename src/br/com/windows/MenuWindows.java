package br.com.windows;

import br.com.interfaces.IMenu;

public class MenuWindows implements IMenu {

	@Override
	public void open() {
		System.out.println("MenuWindows open");
		
	}

	@Override
	public void close() {
		System.out.println("MenuWindows close");
		
	}

}
