package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa um Tipo de Sócio **/

public class PartnerType {
	
	private String description;
	private Integer copy_limit;
	private Integer renewal_limit;
	private ArrayList<Partner> partners;

	public PartnerType() {
	}
	
	public PartnerType(String description, Integer copy_limit, Integer renewal_limit) {
		this.description = description;
		this.copy_limit = copy_limit;
		this.renewal_limit = renewal_limit;
	}
	
	/** **/
	public Boolean consult() {
		return null;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCopy_limit() {
		return copy_limit;
	}

	public void setCopy_limit(Integer copy_limit) {
		this.copy_limit = copy_limit;
	}

	public Integer getRenewal_limit() {
		return renewal_limit;
	}

	public void setRenewal_limit(Integer renewal_limit) {
		this.renewal_limit = renewal_limit;
	}

	public ArrayList<Partner> getPartners() {
		return partners;
	}

	public void setPartners(ArrayList<Partner> partners) {
		this.partners = partners;
	}

	@Override
	public String toString() {
		return "PartnerType [description=" + description + ", copy_limit=" + copy_limit + ", renewal_limit="
				+ renewal_limit + "]";
	}

}
