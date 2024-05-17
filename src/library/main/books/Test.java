package library.main.books;

public class Test {
    public static void main(String[] args) {
        Authors authors = new Authors();
        Books books = new Books();
        Category category = new Category();
        Editorials editorials = new Editorials();
        Rent rent = new Rent();

        System.out.println("-----------------------------");
        System.out.println("Bienvid@ a la libreria CESDE");
        System.out.println("-----------------------------");
        System.out.println("   ");



        authors.createAuthor();
        authors.selectAuthor();

        category.createCategory();
        category.selectCategory();

        editorials.createEditorial();
        editorials.selectEditorial();

        books.createBook();
        //books.selectBook();
        books.printBooks();
        rent.registrerBookRent();
        rent.printBookRent();
    }
}
