package emsamablajecomputadoras.creacional;

public class AsusROGE extends ConstructorComputador {

	@Override
	public void mainboard() {
		// TODO Auto-generated method stub
		pc.setPlaca(new Mainboard("Strix","x99"));
	}

	@Override
	public void SistemaOperativo() {
		// TODO Auto-generated method stub
		pc.setOs(new SistemaOperativo("Windows",64,"10 PRO"));
	}

	@Override
	public void componentes() {
		// TODO Auto-generated method stub
		
	}

}
