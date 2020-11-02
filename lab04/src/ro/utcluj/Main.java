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

  // create clients
  // create airline companies
  // create planes/pilots
  // create flights
  // assign client to flight
  // list flights for a specific day
  // list flights by from/to

//  class Filter {
//
//    private String from;
//    private String to;
//    private LocalDate date;
//  }

  // public Flight[] getFlights(Filter filter) {
  //  for (Flight flight: flights) {
  //    if (flight.getFrom().equals(filter.getFrom()) {
  //    }
  //  }
  // }
  // public Flight[] getFlightsByFromAndToAndDate(String from, String to, LocalDate date) {
  //  for (Flight flight: flights) {
  //    if (flight.getFrom().equals(from) {
  //    }
  //  }
  // }

  public static void main(String[] args) {
    User user = new User();
    user.setName("Adi");

    System.out.println(user.getName());
  }
}
