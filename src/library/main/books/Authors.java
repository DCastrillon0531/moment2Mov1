package library.main.books;

import java.util.Scanner;

public class Authors {

    Scanner sc = new Scanner(System.in);

    private int iDAuthor;
    private String nameAuthor;

    public Authors(){}

    public Authors(int iDAuthor, String nameAuthor) {
        this.iDAuthor = iDAuthor;
        this.nameAuthor = nameAuthor;
    }

    public int getiDAuthor() {
        return iDAuthor;
    }

    public void setiDAuthor(int iDAuthor) {
        this.iDAuthor = iDAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void createAuthor(){
        System.out.println("Digite el ID del autor: ");
        iDAuthor = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite el nombre del autor: ");
        nameAuthor = sc.nextLine();
    }

    public void selectAuthor(){
        System.out.println("ID del autor: " + iDAuthor);
        System.out.println("Nombre del autor: " + nameAuthor);
    }
}
