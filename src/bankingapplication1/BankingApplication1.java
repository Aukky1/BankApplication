/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankingApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        int number;
        String name;
        double balance,amount;
        Bank bank = new Bank();
        Account account;
        Scanner scan = new Scanner(System.in);
        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1. Display All Account");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Existing Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println();
            
            System.out.println("Enter your choice");
            option = scan.nextInt();
            scan.nextLine();
        }
        switch(option) {
            case 1:
                bank.listAccount();
                break;
            case 2:
                System.out.println("ENter Account Name: ");
                name = scan.nextLine();
                System.out.println("Enter Initial Balance");
                balance = scan.nextDouble();
                number = 111111;
                account = new Account(111111, "aaaa bbbb", 500);
                bank.openAccount(account);
                break;
                
            case 3:
                System.out.print("Enter Account Number: ");
                number = scan.nextInt();
                bank.closeAccount(number);
                break;
                
            case 4:
                System.out.print("Enter Amount: ");
                number = scan.nextInt();
                System.out.println("Enter Amount");
                amount = scan.nextDouble();
                bank.depositMoney(number, amount);
                break;
        }
        System.out.println();
    }
  public static int generateAccountNumber(){
        Random random = new Random();
        int accNumber = 100000 + random.nextInt(900000);
        return accNumber;
    }
}
