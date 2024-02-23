package br.edu.ifpi.library.models;
import java.util.ArrayList;
import java.util.Date;

/** Classe que representa um Emprestimo **/

public class Loan {
	
	private Date loan_date;
	private Date return_date;
	private Date returned_date;
	
	// Relacionamentos: Associações
	private Partner partner;
	
	// Relacionamentos: Agregação
	private ArrayList<Copy> copies = new ArrayList<Copy>();
	
	// Relacionamentos: Composição
	private ArrayList<Renovation> renovations;

	public Loan() {
	}
	
	public Loan(Date loan, Date return_date, Date returned) {
		this.loan_date = loan;
		this.return_date = return_date;
		this.returned_date = returned;
		
		this.renovations = new ArrayList<Renovation>();
	}
	
	/** **/
	public Boolean register() {
		return null;
	}
	
	/** **/
	public Boolean returnCopy() {
		return null;
	}
	
	/** **/
	public Boolean renewCopy() {
		return null;
	}
	
	/** **/
	public Boolean verifyStatus() {
		return null;
	}

	public Date getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(Date loan_date) {
		this.loan_date = loan_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public Date getReturned_date() {
		return returned_date;
	}

	public void setReturned_date(Date returned_date) {
		this.returned_date = returned_date;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public ArrayList<Copy> getCopies() {
		return copies;
	}

	public void setCopies(ArrayList<Copy> copies) {
		this.copies = copies;
	}

	public ArrayList<Renovation> getRenovations() {
		return this.renovations;
	}

	public void setRenovations(ArrayList<Renovation> renovations) {
		this.renovations = renovations;
	}

	@Override
	public String toString() {
		return "Loan [loan_date=" + loan_date + ", return_date=" + return_date + ", returned_date=" + returned_date
				+ ", partner=" + partner + ", copies=" + copies + ", renovations=" + renovations + "]";
	}

}
