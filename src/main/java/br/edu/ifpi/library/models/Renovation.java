package br.edu.ifpi.library.models;

import java.util.Date;

/** Classe que representa uma Renovação **/

public class Renovation {
	
	private Date renovation_date;
	private Loan loan;

	public Renovation() {
	}
	
	public Renovation(Date renovation) {
		this.setRenovation_date(renovation);
	}
	
	/** **/
	public Boolean register() {
		return null;
	}
	
	/** **/
	public Boolean consult() {
		return null;
	}

	public Date getRenovation_date() {
		return renovation_date;
	}

	public void setRenovation_date(Date renovation_date) {
		this.renovation_date = renovation_date;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Renovation [renovation_date=" + renovation_date + "]";
	}

}
