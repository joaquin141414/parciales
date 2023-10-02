package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import dataaccess.DBManager;
import model.User;
import model.LibraryItem;
import model.Loan;

public class LibraryController {
    private DBManager dbManager;


    public LibraryController() {
        try {
            dbManager = new DBManager("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/libraryDB", "postgres", "yourpassword");
            this.initialize();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    private void initialize() {
        //TODO : En base al enunciado decidir cual sera el hashmap.
//        users =
//        libraryItems =
//        loans =

        //TODO: completar las colecciones de usuarios, ítems de la biblioteca y préstamos con los datos recuperados desde la Base de Datos
    }

    public String getUserWithMostRentalsReport() {
        //TODO: Implementar la lógica para encontrar el usuario que más libros ha alquilado y generar el reporte correspondiente.
        return "Reporte de usuario que más libros ha alquilado.";
    }

    public String getMostRentedBookReport() {
        //TODO: Implementar la lógica para encontrar el libro más veces alquilado y generar el reporte correspondiente.
        return "Reporte de libro más veces alquilado.";
    }

    public String getUserWithMostExpensesReport() {
        //TODO: Implementar la lógica para encontrar el usuario que ha gastado más dinero y generar el reporte correspondiente.
        return "Reporte de usuario que ha gastado más dinero.";
    }

    public String getLoanReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("=============================================================================================================================================");
        sb.append("\n");
        sb.append("LOAN REPORT - LibraryDB");
        sb.append("\n");
        sb.append("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        sb.append("\n");
        sb.append("Username" + "\t" + "User Type" + "\t" + "Item Title" + "\t" + "Item Type" + "\t" + "Loan Date" + "\t" + "Return Date" + "\t" + "Price Total");
        sb.append("\n");
        sb.append("=============================================================================================================================================");
        sb.append("\n");

        //TODO: Completar el reporte a partir de los objetos en la lista de préstamos

        return sb.toString();
    }
}
