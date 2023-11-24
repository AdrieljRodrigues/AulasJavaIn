package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn; 
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// static para nao ser instaciado outro simpledateformat em outra subclasse
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		if(!checkOut.after(checkIn)) {// vê se o checkout é posterior ao checkin
			throw new DomainExceptions("Check-out date must be after check-in date ");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	
	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	/*public void setCheckIn(Date checkIn) {         Não permitir mudar as datas arbitrariamente
		this.checkIn = checkIn;							sendo necessario o metodo updateDates
	}*/


	public Date getCheckOut() {
		return checkOut;
	}


	/*public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}*/
	
	
	//calculando em dias as duas datas
	public long duration() { //metodo retorna um tipo Long, sendo mais long que o integer 
		long diff = checkOut.getTime() - checkIn.getTime(); // recebe a diferença das datas em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //a classe timeunit é um tipo enumerado 
	}			//convertendo o diff que estava em milisegundos para dias
	
	public void updateDates(Date checkIn, Date checkOut){ //Atualizando a reserva
		Date now = new Date(); //cria uma data com horario atual
		if(checkIn.before(now) || checkOut.before(now)) { //vê se é uma data antes o depois da atual
			throw new DomainExceptions("Reservation dates for update must be future dates"); //new IllegalArgumentException é uma exceção ja criada que trata os argumentos invalidos
		}				
		if(!checkOut.after(checkIn)) {// vê se o checkout é posterior ao checkin
			throw new DomainExceptions("Check-out date must be after check-in date ");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}
