/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

import Entities.CalculoRaio;
import Entities.Color;
import Entities.Comentarios;
import Entities.Conta;
import Entities.ContaEmpresa;
import Entities.ContaPoupanca;
import Entities.ContratoHora;
import Entities.Departamento;
import Entities.NivelTrab;
import Entities.Pedido;
import Entities.Post;
import Entities.Product;
import Entities.Shape;
import Entities.Status;
import Entities.Trabalhador;
import Entities.Retangle;
import Entities.Circle;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;

/**
 *
 * @author Eduardo
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
        
        
        
    }
            
}
