package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa uma Editora **/

public class Publisher {
	
	private String name;
	private String city;
	private ArrayList<Book> books;
	
	public Publisher(String name, String city) {
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", city=" + city + ", books=" + books + "]";
	}

}
