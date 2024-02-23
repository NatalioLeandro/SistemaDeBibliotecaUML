package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa um Gênero de Livro **/

public class Genre {
	
	private String description;
	private ArrayList<Book> books;

	public Genre() {
	}

	public Genre(String description) {
		this.description = description;
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

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Genre [description=" + description + ", books=" + books + "]";
	}

}
