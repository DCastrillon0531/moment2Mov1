package library.main.books;

import library.main.books.Editorials;
import library.main.books.Category;
import library.main.books.Authors;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Books {

    Scanner sc = new Scanner(System.in);

    private int iDBooks;
    private String titleBook;
    private String releaseDateBook;
    Authors authors;
    Category category;
    Editorials editorials;
    private String languageBook;
    private int pagesBook;
    private String description;

    public Books(){}

    public Books(int iDBooks, String titleBook, String releaseDateBook, Authors authors, Category category, Editorials editorials, String languageBook, int pagesBook, String description) {
        this.iDBooks = iDBooks;
        this.titleBook = titleBook;
        this.releaseDateBook = releaseDateBook;
        this.authors = authors;
        this.category = category;
        this.editorials = editorials;
        this.languageBook = languageBook;
        this.pagesBook = pagesBook;
        this.description = description;
    }

    public int getiDBooks() {
        return iDBooks;
    }

    public void setiDBooks(int iDBooks) {
        this.iDBooks = iDBooks;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getReleaseDateBook() {
        return releaseDateBook;
    }

    public void setReleaseDateBook(String releaseDateBook) {
        this.releaseDateBook = releaseDateBook;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Editorials getEditorials() {
        return editorials;
    }

    public void setEditorials(Editorials editorials) {
        this.editorials = editorials;
    }

    public String getLanguageBook() {
        return languageBook;
    }

    public void setLanguageBook(String languageBook) {
        this.languageBook = languageBook;
    }

    public int getPagesBook() {
        return pagesBook;
    }

    public void setPagesBook(int pagesBook) {
        this.pagesBook = pagesBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    LinkedHashSet<Object> book = new LinkedHashSet<>();

    public void createBook(){
        System.out.println("Digite el ID del libro es: ");
        iDBooks = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite el titulo del libro: ");
        titleBook = sc.nextLine();
        System.out.println("Digite la fecha de lanzamiento: ");
        releaseDateBook = sc.nextLine();
        book.add(authors);
        book.add(category);
        book.add(editorials);
        System.out.println("Digite el idioma del libro: ");
        languageBook = sc.nextLine();
        System.out.println("Digite la cantidad de paginas del libro: ");
        pagesBook = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite una descripcion sobre el libro: ");
        description = sc.nextLine();
    }

    public void printBooks(){
        for (Object item: book){
            System.out.println(item);
        }
    }

    public  void selectBook(){
        System.out.println("El ID del libro es: " + iDBooks);
        System.out.println("El titulo del libro es: " + titleBook);
        System.out.println("La fecha de lanzamiento es: " + releaseDateBook);
        System.out.println("El autor es: " + authors);
        System.out.println("La categoria es: " + category);
        System.out.println("La editorial es: " + editorials);
        System.out.println("El idioma del libro es: " + languageBook);
        System.out.println("La cantidad de paginas es de: " + pagesBook);
        System.out.println("Descripcion: " + description);
    }
}
