package br.edu.ifpi.library.main;

import java.util.ArrayList;
import java.util.Date;

import br.edu.ifpi.library.models.Author;
import br.edu.ifpi.library.models.Book;
import br.edu.ifpi.library.models.Copy;
import br.edu.ifpi.library.models.Genre;
import br.edu.ifpi.library.models.Loan;
import br.edu.ifpi.library.models.Partner;
import br.edu.ifpi.library.models.PartnerType;
import br.edu.ifpi.library.models.Publisher;
import br.edu.ifpi.library.models.Renovation;
import br.edu.ifpi.library.models.Status;

public class Main {

	public static void main(String[] args) {
		
		Book livro = new Book("Jogos Vorazes: Em Chamas", 2008, 1, 342, 439023483l);
		System.out.println(livro.toString());
		System.out.println(livro.consult());
		
		Genre genero = new Genre("Ficção Científica");
		Genre genero2 = new Genre("Ação");
		Author autor = new Author("Suzanne Collins");
		Publisher editora = new Publisher("Rocco", "Rio de Janeiro");
		Date data = new Date();
		Copy exemplar = new Copy(data, Status.AVAILABLE);
		Copy exemplar2 = new Copy(data, Status.BORROWED);
		
		Status status = Status.LOCAL_CONSULTATION;
		System.out.println(status.getStatus());
		
		ArrayList<Genre> generos = new  ArrayList<Genre>();
		generos.add(genero);
		generos.add(genero2);
		ArrayList<Author> autores = new ArrayList<Author>();
		autores.add(autor);
		ArrayList<Copy> exemplares = new ArrayList<Copy>();
		exemplares.add(exemplar);
		exemplares.add(exemplar2);
		
		livro.setAuthors(autores);
		livro.setGenres(generos);
		livro.setPublisher(editora);
		livro.setCopies(exemplares);
		
		System.out.println(livro);
		
		ArrayList<Book> livros = new ArrayList<Book>();
		livros.add(livro);
		autor.setBooks(livros);
		System.out.println(autor + " " + autor.getBooks());
		
		Loan emprestimo = new Loan(data, data, null);
		emprestimo.setCopies(exemplares);
		emprestimo.setPartner(null);
		emprestimo.setRenovations(null);
		System.out.println(emprestimo);
		
		Renovation renovacao = new Renovation(data);
		ArrayList<Renovation> renovacoes = new ArrayList<Renovation>();
		renovacoes.add(renovacao);
		emprestimo.setRenovations(renovacoes);
		System.out.println(emprestimo);
		Renovation renovacao2 = new Renovation(data);
		renovacoes.add(renovacao2);
		emprestimo.setRenovations(renovacoes);
		System.out.println(emprestimo);
		
		PartnerType tipo = new PartnerType("Vip", 10, 4);
		Partner socio = new Partner("Luis Wellington", "Rua Entrega Tudo", "Centro", "64980000", "89 999999999", "luis@gmail.com");
		socio.setType(tipo);
		System.out.println(socio.toString());	
		
		emprestimo.setPartner(socio);
		System.out.println(emprestimo);
		

	}

}
