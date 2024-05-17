package library.main.books;

import library.main.users.ReadersUsers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Rent {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    private int iDRent;
    ReadersUsers readersUsers;
    Books books;
    private String departureDate;
    private String entryDate;

    public Rent(){}

    public Rent(int iDRent, ReadersUsers readersUsers, Books books, String departureDate, String entryDate) {
        this.iDRent = iDRent;
        this.readersUsers = readersUsers;
        this.books = books;
        this.departureDate = departureDate;
        this.entryDate = entryDate;
    }

    public int getiDRent() {
        return iDRent;
    }

    public void setiDRent(int iDRent) {
        this.iDRent = iDRent;
    }

    public ReadersUsers getReadersUsers() {
        return readersUsers;
    }

    public void setReadersUsers(ReadersUsers readersUsers) {
        this.readersUsers = readersUsers;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String  departureDate) {
        this.departureDate = departureDate;
    }

    public String  getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    LinkedHashSet<Object> rent = new LinkedHashSet<>();

    public void registrerBookRent(){
        System.out.println("Ingrese el codigo de la renta: ");
        iDRent = sc.nextInt();
        sc.nextLine();
        rent.add(readersUsers);
        rent.add(books);
        System.out.println("Ingrese la fecha de salida de la renta: ");
        departureDate = sc.nextLine();
        System.out.println("Ingrese la fecha de entrada de la renta: ");
        entryDate = sc.nextLine();

    }

    public void printBookRent(){
        for(Object item: rent){
            System.out.println(item);
        }
    }
}


