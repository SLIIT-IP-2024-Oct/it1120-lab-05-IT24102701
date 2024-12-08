import java.util.Scanner;

public class IT24102701Lab5Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double roomChargesPerDay = 48000.00;
		final int discount1 = 10;
		final int discount2 = 20;
		double totalAmount;
		double discountRate = 0.0;
		double discount;
		double finalAmount;

		System.out.print("Enter Start Date (1-31): ");
		int startDate = scanner.nextInt();

		System.out.print("Enter End Date (1-31): ");
		int endDate = scanner.nextInt();

		if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.println("Days must be between 1 and 31");
			return;
		}

		if(startDate > endDate) {
			System.out.println("Start Date must be less than End Date");
			return;
		}

		
		int numOfDays = endDate - startDate;
		
		if (numOfDays >= 3 && numOfDays <= 4) {
			discountRate = discount1;
		}
		else if (numOfDays >= 5) {
			discountRate = discount2;
		}

		totalAmount = numOfDays * roomChargesPerDay;
		discount = totalAmount * (discountRate/100);
		finalAmount = totalAmount - discount;

		System.out.println("Room Charges Per Day: Rs. " + roomChargesPerDay + "/=");
		System.out.println("Number of Days Reserved: " + numOfDays);
		System.out.println("Total Amount to be Paid: " + finalAmount);

		scanner.close();
	}

}
		