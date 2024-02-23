package br.edu.ifpi.library.models;

import java.util.ArrayList;
import java.util.Date;

/** Classe que representa um Exemplar **/

public class Copy {
	
	private Date acquisition_date;
	private Status status;
	private ArrayList<Loan> loans;

	public Copy() {
	}
	
	public Copy(Date acquisition_date, Status status) {
		this.acquisition_date = acquisition_date;
		this.status = status;
	}
	
	/** **/
	public Boolean consult() {
		return null;
	}
	
	/** Altera a situação do livro **/
	public Boolean changeStatus() {
		return null;
	}

	public Date getAcquisition_date() {
		return acquisition_date;
	}

	public void setAcquisition_date(Date acquisition_date) {
		this.acquisition_date = acquisition_date;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ArrayList<Loan> getLoans() {
		return loans;
	}

	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}

	@Override
	public String toString() {
		return "Copy [acquisition_date=" + acquisition_date + ", status=" + status + "]";
	}

}
