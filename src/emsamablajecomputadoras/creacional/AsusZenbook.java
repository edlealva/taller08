package emsamablajecomputadoras.creacional;

public class AsusZenbook extends ConstructorComputador {

	@Override
	public void mainboard() {
		// TODO Auto-generated method stub
		pc.setPlaca(new Mainboard("Prime","Z370"));
	}

	@Override
	public void SistemaOperativo() {
		// TODO Auto-generated method stub
		pc.setOs(new SistemaOperativo("Windows",64,"10 HOME"));
	}

	@Override
	public void componentes() {
		// TODO Auto-generated method stub
		
	}

}
