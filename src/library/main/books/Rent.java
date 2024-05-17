package library.main.books;

import library.main.users.ReadersUsers;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Rent {

    Scanner sc = new Scanner(System.in);
   // SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

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
        rent.add(iDRent);
        sc.nextLine();
        System.out.println("Ingrese el ID del cliente: ");
        int idReaders = readersUsers.getIdReaders();
        rent.add(idReaders);
        sc.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        String nameReader = readersUsers.getNameUser();
        rent.add(nameReader);
        System.out.println("Ingrese el numero de celular del cliente: ");
        int cellPhone = readersUsers.getCellphone();
        rent.add(cellPhone);
        sc.nextLine();
        System.out.println("Ingrese el correo del cliente: ");
        String email = readersUsers.getEmail();
        rent.add(email);
        System.out.println("Ingrese la direccion del cliente: ");
        String address = readersUsers.getAddress();
        rent.add(address);
        System.out.println("Ingrese el codigo postal: ");
        int postalCode = readersUsers.getPostalCode();
        rent.add(postalCode);
        System.out.println("Ingrese las observaciones o comentarios: ");
        String observations = readersUsers.getObservations();
        rent.add(observations);
        System.out.println("Ingrese el ID del libro: ");
        int idBook = books.getiDBooks();
        rent.add(idBook);
        System.out.println("Ingrese el titulo del libro: ");
        String titleBook = books.getTitleBook();
        rent.add(titleBook);
        System.out.println("Ingrese la fecha de lanzamiento del libro: ");
        String releaseDateBook = books.getReleaseDateBook();
        rent.add(releaseDateBook);
        System.out.println("Ingrese la fecha de salida de la renta: ");
        departureDate = sc.nextLine();
        rent.add(departureDate);
        System.out.println("Ingrese la fecha de entrada de la renta: ");
        entryDate = sc.nextLine();
        rent.add(entryDate);

    }

    public void printBookRent(){
        for(Object item: rent){
            System.out.println(item);
        }
    }
}


