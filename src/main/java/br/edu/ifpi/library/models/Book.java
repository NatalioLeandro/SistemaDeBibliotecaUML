package br.edu.ifpi.library.models;

import java.util.ArrayList;

/** Classe que representa um Livro **/

public class Book {

	private String title;
	private Integer year; 
	private Integer edition; 
	private Integer pages; 
	private Long isbn;
	
	// Relacionamentos: Associações
	private ArrayList<Genre> genres;
	private ArrayList<Author> authors;
	private Publisher publisher;
	
	// Relacionamentos: Agregação
	private ArrayList<Copy> copies = new ArrayList<Copy>();

	public Book() {
	}
	
	public Book(String title, Integer year, Integer edition, Integer pages, Long isbn) {
		this.title = title;
		this.year = year;
		this.edition = edition;
		this.pages = pages;
		this.isbn = isbn;
	}
	
	/** **/
	public Boolean consult() {
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public ArrayList<Genre> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public ArrayList<Copy> getCopies() {
		return copies;
	}

	public void setCopies(ArrayList<Copy> copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", year=" + year + ", edition=" + edition + ", pages=" + pages + ", isbn="
				+ isbn + ", genres=" + genres + ", authors=" + authors + ", publisher=" + publisher + ", copies="
				+ copies + "]";
	}
	
}
