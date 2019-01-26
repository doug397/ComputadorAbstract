package br.com.main;

import br.com.interfaces.ICore;
import br.com.interfaces.IFabricaSistemaOperacional;
import br.com.linux.FabricaLinux;
import br.com.windows.FabricaWindows;

public class Main {
	
	public static void main(String[] args) {
		
		IFabricaSistemaOperacional fabrica = new FabricaWindows();
		ICore core = Gibabyte.getInstance();
		
		core.boot(fabrica);
	}

}
