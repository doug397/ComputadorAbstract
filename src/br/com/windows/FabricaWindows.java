package br.com.windows;


import br.com.interfaces.IFabricaSistemaOperacional;
import br.com.interfaces.IJanela;
import br.com.interfaces.IMenu;

public class FabricaWindows implements IFabricaSistemaOperacional {

	@Override
	public IJanela createJanela() {
		// TODO Auto-generated method stub
		return new JanelaWindows();
	}

	@Override
	public IMenu createMenu() {
		// TODO Auto-generated method stub
		return new MenuWindows();
	}

}
