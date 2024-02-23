package br.edu.ifpi.library.main;

/* package br.edu.ifpi.library.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		
		// Criando objetos para teste
        Genre genre = new Genre("Ficção Científica");
        Genre genre2 = new Genre("Ação");
        Author author = new Author("Suzanne Collins");
        Publisher publisher = new Publisher("Rocco", "Rio de Janeiro");
        Date date = new Date();
        Copy copy = new Copy(date, Status.AVAILABLE);
        Copy copy2 = new Copy(date, Status.BORROWED);

        // Criando uma lista de gêneros e autores
        ArrayList<Genre> genres = new ArrayList<>();
        genres.add(genre);
        genres.add(genre2);
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author);

        // Criando um livro e atribuindo gêneros, autores e editora
        Book book = new Book("Jogos Vorazes: Em Chamas", 2008, 1, 342, 439023483L);
        book.setAuthors(authors);
        book.setGenres(genres);
        book.setPublisher(publisher);

        // Criando uma lista de cópias e adicionando ao livro
        ArrayList<Copy> copies = new ArrayList<>();
        copies.add(copy);
        copies.add(copy2);
        book.setCopies(copies);

        // Mostrando informações do livro
        System.out.println("Detalhes do livro:");
        System.out.println(book);

        // Mostrando informações do autor e seus livros
        System.out.println("\nLivros do autor:");
        author.setBooks(new ArrayList<>(List.of(book)));
        System.out.println(author + " " + author.getBooks());

        // Simulando empréstimo de cópias
        Loan loan = new Loan(date, date, null);
        loan.setCopies(copies);
        loan.setPartner(null);
        loan.setRenovations(null);
        System.out.println("\nEmpréstimo:");
        System.out.println(loan);

        // Simulando renovações de empréstimo
        Renovation renovation = new Renovation(date);
        ArrayList<Renovation> renovations = new ArrayList<>();
        renovations.add(renovation);
        loan.setRenovations(renovations);
        System.out.println("\nEmpréstimo renovado:");
        System.out.println(loan);

        // Simulando mais uma renovação de empréstimo
        Renovation renovation2 = new Renovation(date);
        renovations.add(renovation2);
        loan.setRenovations(renovations);
        System.out.println("\nEmpréstimo renovado novamente:");
        System.out.println(loan);

        // Criando um tipo de parceiro e um parceiro
        PartnerType type = new PartnerType("Vip", 10, 4);
        Partner partner = new Partner("Luis Wellington", "Rua Entrega Tudo", "Centro", "64980000", "89 999999999", "luis@gmail.com");
        partner.setType(type);
        System.out.println("\nDetalhes do sócio:");
        System.out.println(partner);

        // Associando o parceiro ao empréstimo
        loan.setPartner(partner);
        System.out.println("\nEmpréstimo atualizado com o sócio:");
        System.out.println(loan);

	}

} */
