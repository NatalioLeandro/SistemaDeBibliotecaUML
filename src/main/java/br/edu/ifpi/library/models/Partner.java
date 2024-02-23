package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa um Sócio **/

public class Partner {
	
	private String name;
	private String address;
	private String neighborhood;
	private String cep;
	private String telephone;
	private String email;
	private ArrayList<Loan> loans;
	
	// Relacionamentos: Associações
	private PartnerType type;

	public Partner() {
	}
	
	public Partner(String name, String address, String neighborhood, String cep, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.cep = cep;
        this.telephone = telephone;
        this.email = email;
    }
	
	/** **/
	public Boolean consult() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PartnerType getType() {
		return type;
	}

	public void setType(PartnerType type) {
		this.type = type;
	}

	public ArrayList<Loan> getLoans() {
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}

	@Override
	public String toString() {
		return "Partner [name=" + name + ", address=" + address + ", neighborhood=" + neighborhood + ", cep=" + cep
				+ ", telephone=" + telephone + ", email=" + email + ", type=" + type + ", loans=" + loans + "]";
	}

}
