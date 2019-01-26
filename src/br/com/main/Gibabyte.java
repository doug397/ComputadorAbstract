package br.com.main;

import br.com.interfaces.ICore;
import br.com.interfaces.IFabricaSistemaOperacional;
import br.com.interfaces.IJanela;
import br.com.interfaces.IMenu;

public class Gibabyte implements ICore {
	
	public static Gibabyte instance;
	
	private  Gibabyte() {
	}
	
	public static Gibabyte getInstance() {
		
		if(instance == null)
			instance = new Gibabyte();
		
		return instance;
	}

	@Override
	public void boot(IFabricaSistemaOperacional fabrica) {
		
		System.out.println("Core Gibabyte");
		
		IJanela janela = fabrica.createJanela();
		IMenu menu = fabrica.createMenu();
		
		janela.open();
		menu.open();
		
	}

}
