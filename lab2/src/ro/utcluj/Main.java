package ro.utcluj;

public class Main {

    public static void main(String[] args) {
	      // write your code here

        // caiet in care inregistreaza clientii
        // - nume prenume
        // - CNP
        // - serie nr CI
        // - scopul vizitei

        // caiet in care inregistreaza rezervarile
        // - nume client
        // - numar camera
        // - numar persoane
        // - data intrare - data iesire

        Client firstClient = new Client("George", "Pop");
        firstClient.presentYourself();
        System.out.println(firstClient.firstName);

        Client secondClient = new Client();
        secondClient.firstName = "Mirela";
        secondClient.presentYourself();
        System.out.println(secondClient.firstName);
    }
}
