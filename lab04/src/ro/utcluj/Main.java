package ro.utcluj;

import ro.utcluj.model.User;

public class Main {

  // Management de info in cadrul unui aeroport
  //
  // Airport
  //  - flights: Flight[]
  //  - clients: Client[]
  // AirlineCompany (wizz, ryanair, blueair)
  //  - name: String
  //  - planes: Plane[]
  //  - pilots: Pilot[]
  // Plane
  //  - seatsNumber
  // Pilot
  //  - name
  //
  // Flight
  //  - from: String
  //  - to: String
  //  - departure: LocalDate
  //  - plane: Plane
  //  - clients: Client[]
  // InternalFlight
  //  -
  // ExternalFlight
  //  - requiresVisa: boolean
  //  - visaNumber: String
  //
  // Client
  //  - name

  public static void main(String[] args) {
    User user = new User();
    user.setName("Adi");

    System.out.println(user.getName());
  }
}
