package library.main.books;

import java.util.Scanner;

public class Category {

    Scanner sc = new Scanner(System.in);

    private int iDCategory;
    private String category;

    public Category(){}

    public Category(int iDCategory, String category) {
        this.iDCategory = iDCategory;
        this.category = category;
    }

    public int getiDCategory() {
        return iDCategory;
    }

    public void setiDCategory(int iDCategory) {
        this.iDCategory = iDCategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void createCategory(){
        System.out.println("Digite el ID de la categoria: ");
        iDCategory = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite la categoria: ");
        category = sc.nextLine();
    }

    public void selectCategory(){
        System.out.println("El ID de la categoria es: " + iDCategory);
        System.out.println("La categoria es: " + category);
    }
}
