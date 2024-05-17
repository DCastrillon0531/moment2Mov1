package library.main.books;

import library.main.users.ReadersUsers;

public class Test {
    public static void main(String[] args) {
        Authors authors = new Authors();
        Books books = new Books();
        Category category = new Category();
        Editorials editorials = new Editorials();
        Rent rent = new Rent();

        

        authors.createAuthor();
        authors.selectAuthor();

        category.createCategory();
        category.selectCategory();

        editorials.createEditorial();
        editorials.selectEditorial();

        books.createBook();
        books.selectBook();

        rent.registrerBookRent();
        rent.printBookRent();
    }
}
