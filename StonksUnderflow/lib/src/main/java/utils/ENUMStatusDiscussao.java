package utils;

public enum ENUMStatusDiscussao {
	ABERTA(0, "ABERTA"), RESPONDIDA(1, "RESPONDIDA"), ENCERRADA(2, "ENCERRADA"), CANCELADA(3, "CANCELADA");

	private final int valor;
	private final String status;
	ENUMStatusDiscussao(int valorOpcao, String statusOpcao){
		valor = valorOpcao;
		status = statusOpcao;
	}
	public int getValor(){
		return valor;
	}
	
	public String getStatus() {
		return status;
	}
	
}
