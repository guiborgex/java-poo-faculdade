package main;

public class Trator extends Carro{

	private boolean cabine;
	private boolean concha;
	
	public Trator(String marca, String cor, int ano, boolean cabine, boolean concha) {
		super(marca, cor, ano);
		this.cabine = cabine;
		this.concha = concha;
	}
		
    public boolean isCabine() {
        return cabine;
    }
	
    public boolean isConcha() {
        return concha;
    }
	
    public String descricaoCabine() {
        return cabine ? "Possui cabine" : "Não possui cabine";
    }

    public String descricaoConcha() {
        return concha ? "Possui pá carregadeira" : "Não possui pá carregadeira";
    }
    
	@Override
	public String buzinar() {
	    return "FON FON";
	    
	}
}
