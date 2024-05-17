package library.main.books;

import java.util.Scanner;

public class Editorials {

    Scanner sc = new Scanner(System.in);

    private int iDEditorial;
    private String nameEditorial;

    public Editorials(){}

    public Editorials(int iDEditorial, String nameEditorial) {
        this.iDEditorial = iDEditorial;
        this.nameEditorial = nameEditorial;
    }

    public int getiDEditorial() {
        return iDEditorial;
    }

    public void setiDEditorial(int iDEditorial) {
        this.iDEditorial = iDEditorial;
    }

    public String getNameEditorial() {
        return nameEditorial;
    }

    public void setNameEditorial(String nameEditorial) {
        this.nameEditorial = nameEditorial;
    }

    public void createEditorial(){
        System.out.println("Digite la ID del editorial: ");
        iDEditorial = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite el nombre de la editorial: ");
        nameEditorial = sc.nextLine();
    }

    public void selectEditorial(){
        System.out.println("El ID de la editorial es: " + iDEditorial);
        System.out.println("El nombre de la editorail es: " + nameEditorial);

    }
}
