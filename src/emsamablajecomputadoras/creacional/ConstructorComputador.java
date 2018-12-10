package emsamablajecomputadoras.creacional;

public abstract class ConstructorComputador {
	protected Computador pc;
	
	public void nuevo() {
		pc=new Computador();
	}
	public Computador obtenerpc() {
		return pc;
	}
	public abstract void mainboard();
	public abstract void SistemaOperativo();

}
