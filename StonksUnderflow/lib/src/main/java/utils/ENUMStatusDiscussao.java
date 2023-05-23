package utils;

public enum ENUMStatusDiscussao {
	ABERTA(0), RESPONDIDA(1), ENCERRADA(2), CANCELADA(3);

	private final int valor;
	ENUMStatusDiscussao(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}	
}
