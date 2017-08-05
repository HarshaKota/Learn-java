import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int totalNumbers = 0;
		int counter = 0;
		int searchNumber;
		
		System.out.println("Alright, Let's do a Binary Search");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of items you want to search through");
		totalNumbers = scan.nextInt();
		
		int num[] = new int[totalNumbers];
		
		System.out.println("Enter "+totalNumbers+" numbers");
		while(counter<totalNumbers) {
			num[counter] = scan.nextInt();
			counter++;
		}
		Arrays.sort(num);
		
		System.out.println("Enter the number you want to find");
		searchNumber = scan.nextInt();
		System.out.println();
		
		int first = 0;
		int last = totalNumbers-1;
		int middle = (first+last)/2;
		
		if (searchNumber == num[middle]) {
			System.out.println("Found your number "+searchNumber+" at location "+middle);
		}else if (searchNumber < num[middle]) {
			for (int x=0;x<middle;x++) {
				if (searchNumber == num[x]) {
					System.out.println("Found your number "+searchNumber+" at location "+num[x]);
					System.out.println(num);
				}
			}
		}else if (searchNumber > num[middle]) {
			for (int y=middle+1;y<last;y++) {
				if (searchNumber == num[y]) {
					System.out.println("Found your number "+searchNumber+" at location "+num[y]);
					System.out.println(num);
				}
			}
		}
		
	}

}
