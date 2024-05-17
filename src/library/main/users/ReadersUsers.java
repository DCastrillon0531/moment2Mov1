package library.main.users;

import java.io.Reader;
import java.util.Scanner;

public abstract class ReadersUsers implements UtilReadersUsers {

    Scanner sc = new Scanner(System.in);

    protected int idReaders;
    private String nameUser;
    private int cellphone;
    private String email;
    private String address;
    private int postalCode;
    private String observations;

    public ReadersUsers(){}

    public ReadersUsers(int idReaders, String nameUser, int cellphone, String email, String address, int postalCode, String observations) {
        this.idReaders = idReaders;
        this.nameUser = nameUser;
        this.cellphone = cellphone;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.observations = observations;
    }

    public int getIdReaders() {
        return idReaders;
    }

    public void setIdReaders(int idReaders) {
        this.idReaders = idReaders;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public void createReaderUser(){
        System.out.println("Digite el ID del lector: ");
        idReaders = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite el nombre del lector: ");
        nameUser = sc.nextLine();
        System.out.println("Digite el telefono del lector: ");
        cellphone = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite la direccion del lector: ");
        address = sc.nextLine();
        System.out.println("Digite el codigo postal: ");
        postalCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite las observasiones o comentarios: ");
        observations = sc.nextLine();
    }

    public void updateReaderUser(){}

    public void selectReaderUser(){
        System.out.println("ID Lector: " + idReaders);
        System.out.println("Nombre del usuario: " + nameUser);
        System.out.println("Telefono del usuario: " + cellphone);
        System.out.println("Direccion: " + address);
        System.out.println("Codigo postal: " + postalCode);
        System.out.println("Observaciones: " + observations);
    }

    public void deleteReaderUser(){}
}
