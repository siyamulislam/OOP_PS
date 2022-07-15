/**
 * Level ex 6. Write a program that computes the total ticket sales of a concert. There are
 * three types of seating s: A, B, and C. The program accepts the number of
 * tickets sold and the price of a ticket for each of the three types of seats. The
 * total sales are computed as follows:
 * totalSales = numberOfA_Seats * pricePerA_Seat +
 * numberOfB_Seats * pricePerB_Seat +
 * numberOfC_Seats * pricePerC_Seat;
 *
 * @author Siam_PC
 */
package Chapter_4;

import java.util.Scanner; 
public class L1Ex6TicketSales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfASeats, numberOfBSeats, numberOfCSeats;
        double pricePerASeat, pricePerBSeat, pricePerCSeat, totalSales;

        System.out.print("Ticket sold of A: ");
        numberOfASeats = scanner.nextInt();
        System.out.print("Ticket sold of B: ");
        numberOfBSeats = scanner.nextInt();
        System.out.print("Ticket sold of C: ");
        numberOfCSeats = scanner.nextInt();

        System.out.print("price of ticket A: ");
        pricePerASeat = scanner.nextDouble();
        System.out.print("price of ticket B: ");
        pricePerBSeat = scanner.nextDouble();
        System.out.print("price of ticket C: ");
        pricePerCSeat = scanner.nextDouble();

        totalSales = (numberOfASeats * pricePerASeat) + (numberOfBSeats * pricePerBSeat) + (numberOfCSeats * pricePerCSeat);
        System.out.println("Total Sales: " + totalSales);
    }
}
