package br.edu.ifpi.library.models;

/** Enum que representa a Situação de um exemplar **/

public enum Status {

	AVAILABLE("Disponível"),
	BORROWED("Emprestado"),
	RESERVED("Reservado"),
	LOCAL_CONSULTATION("Consulta Local");
	
	private final String status;
	
	private Status(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}
