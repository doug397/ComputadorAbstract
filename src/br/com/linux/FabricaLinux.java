package br.com.linux;

import br.com.interfaces.IFabricaSistemaOperacional;
import br.com.interfaces.IJanela;
import br.com.interfaces.IMenu;

public class FabricaLinux implements IFabricaSistemaOperacional {

	@Override
	public IJanela createJanela() {
		
		return new JanelaLinux();
	}

	@Override
	public IMenu createMenu() {
		
		return new MenuLinux();
	}

}
