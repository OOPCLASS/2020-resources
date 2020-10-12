package ro.utcluj;

import java.time.LocalDate;

public class Reservation {

  public static final String HOTEL_NAME = "UTCN-5*";

  private Client client;
  private Integer roomNumber;
  private Integer personsNumber;
  private LocalDate arrivalDate;
  private LocalDate exitDate;

  public Reservation() {
    client = null;
  }

  public Reservation(Client client, LocalDate exitDate) {
    this.client = client;
    this.arrivalDate = LocalDate.now();
    this.exitDate = exitDate;
  }

  public Reservation(LocalDate exitDate, Client client) {
    this.client = client;
    this.arrivalDate = LocalDate.now();
    this.exitDate = exitDate;
  }

  public Client getClient() {
    new Reservation(new Client(), LocalDate.EPOCH);
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Integer getPersonsNumber() {
    return personsNumber;
  }

  public void setPersonsNumber(Integer personsNumber) {
    this.personsNumber = personsNumber;
  }

  public LocalDate getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public LocalDate getExitDate() {
    return exitDate;
  }

  public void setExitDate(LocalDate exitDate) {
    this.exitDate = exitDate;
  }

  public static Integer getTotalNumberOfRooms() {
    return 10;
  }
}
