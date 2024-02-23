package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa um Autor **/

public class Author {
	
	private String name;
	private ArrayList<Book> books;

	public Author() {
	}
	
	public Author(String name) {
		this.name = name;
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
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

}
