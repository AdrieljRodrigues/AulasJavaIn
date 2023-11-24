package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next()); //converte em data
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			//instanciando a reserva
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next()); //converte em data
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
					
			reservation.updateDates(checkIn, checkOut); //a String vai informar se aconteceu algum erro
			System.out.println("Reservation: " + reservation);
		} //se ouver uma exceção no programa o try é interrompido e os blocos cacth vao mostrar qual foi
		catch(ParseException e){
			System.out.println("Invalid date format");									
		}
		catch(DomainExceptions e) {
			System.out.println("Error in reservation: " + e.getMessage()); //mostra a mensagem da exceção na classe reservation
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error"); // qualquer outra exceção 
		}
		sc.close();
	}
}
