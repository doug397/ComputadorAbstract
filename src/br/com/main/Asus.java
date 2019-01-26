package br.com.main;

import br.com.interfaces.ICore;
import br.com.interfaces.IFabricaSistemaOperacional;
import br.com.interfaces.IJanela;
import br.com.interfaces.IMenu;

public class Asus implements ICore {

	@Override
	public void boot(IFabricaSistemaOperacional fabrica) {
		
		System.out.println("Core Asus");
		
		IJanela janela = fabrica.createJanela();
		IMenu menu = fabrica.createMenu();
		
		janela.open();
		menu.open();
		
	}

}
