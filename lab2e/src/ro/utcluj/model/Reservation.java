package ro.utcluj.model;

import java.time.LocalDate;

public class Reservation {

  public static String HOTEL_NAME = "UTCN-5*";

  private Client client;
  private Integer roomNumber;
  private Integer numberOfPeople;
  private LocalDate checkin;
  private LocalDate checkout;

  public Reservation() {
    client = null;
    roomNumber = 10;
    hello();
  }

  private void hello() {

  }

  public Reservation(Client client, LocalDate exitDate) {
    this.client = client;
    this.checkin = LocalDate.now();
    this.checkout = exitDate;
  }

  public Reservation(LocalDate exitDate, Client client) {
    this.client = client;
    this.checkin = LocalDate.now();
    this.checkout = exitDate;
  }

  public Client getClient() {
    new Reservation(new Client(), LocalDate.EPOCH);
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  // encapsulation
  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Integer getNumberOfPeople() {
    return numberOfPeople;
  }

  // access modifiers
  // private
  // protected
  // public
  public void setNumberOfPeople(Integer numberOfPeople) {
    this.numberOfPeople = numberOfPeople;
  }

  public LocalDate getCheckin() {
    return checkin;
  }

  public void setCheckin(LocalDate checkin) {
    this.checkin = checkin;
  }

  public LocalDate getCheckout() {
    return checkout;
  }

  public void setCheckout(LocalDate checkout) {
    this.checkout = checkout;
  }

  public static Integer getTotalNumberOfRooms() {
    return 10;
  }
}
