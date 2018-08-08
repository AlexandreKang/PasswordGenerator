import java.util.Scanner;

// -----------------------------------------------------
// Assignment 2
// File name: Password.java
// Written by: Alexandre Kang
// For Comp 248 - Fall 2016
// -----------------------------------------------------

// WHAT DOES THIS PROGRAM DO?
// ---------------------------
// This program prompts the user for a 5 letter string. It then reverses the order of the string and subtracts 15 from each characters.
// ASCII code to generate the password. If the user enters a string that does not contain exactly five characters, the application 
// displays an error message and exits.

public class Password {
	public static void main(String[] args) {
		// Declare variables
		// -----------------
		Scanner keyIn = new Scanner(System.in);  // keyboard input
		String inputString;
		String password = "";

		// Output welcome banner
		System.out.println("\t------------------------------\n" +
			 "\t Alex's Password Generator \n" +
			 "\t------------------------------\n");

		// Prompt user for 5-character string
		System.out.println( "Please enter a 5 character word which will be used to generate a password: ");
		inputString = keyIn.next();

		// Make sure is a 5-character word
		if (inputString.length() != 5)
			System.out.println( "Sorry, but that is not a 5-character string. Program will terminate.");
		else
		{
			int index = 0;
			char oneChar;
			while (index < inputString.length())
			{
				oneChar = (char)((int)inputString.charAt(index) - 7);
				password = oneChar + password;
				index += 1;
			}
			System.out.println("Your password is " + password);
		}
		// Closing message
		System.out.println( "\nThank you for using Alex's Password Generator program.");
		keyIn.close();

	}

}
