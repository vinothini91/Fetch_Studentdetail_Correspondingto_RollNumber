package hello;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Fetch_Student_Detail_Corresspondingto_Rollnumber1 {

	public static void main(String[] args) {

		try

		{

			boolean match = false;

			File file = new File("F:/vino--programs-2021/student4.txt");
			Path path = Paths.get(file.toString());

			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;

			System.out.println("Enter Roll Number:");
			Scanner scan = new Scanner(System.in);

			int student = scan.nextInt();
			String number = String.valueOf(student); // convert integer to string

			while ((line = reader.readLine()) != null) {

				String[] array1 = line.split(" ");

				for (int i = 0; i < array1.length; i++)

				{

					String words = array1[i];
					String position1 = words.substring(0, 1); // 0th index position
					String position2 = words.substring(0, 2);

					if (number.equals(position1)) {
						match = true;
						System.out.println("Roll number exist");
						System.out.println("Student detail:" + array1[i]);
						break;
					}

					if (number.equals(position2)) {
						match = true;
						System.out.println("Roll number exist");
						System.out.println("Student detail:" + array1[i]);
						break;
					}

				}

			}

			if (!match)
				System.out.println("Roll number does not  exist");

		}

		catch (Exception e) {

		}

	}

}
