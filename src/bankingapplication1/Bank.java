/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication1;




/**
 *
 * @author Student
 */
public class Bank {
    private String name;
    
    public Bank() {
    
}
    
    public Bank(String name){
        this.name = name;
    }
    
    public void listAccount() {
        Connect connect = BankingConnection.connect();
        Statement styatement;
        
        
        String sql = "SELECT * FROM account ";
    }
    
    
    public void openAccount(Account account) {
        BankingConnection.connect();
        String sql = "INSERT INTO account (accNumber,accName,accBalance) VALUE(?,?,?)";
        PreparedStatement preparedStatemant;
        
        
        preparedStatemant = connection.prepare
    }
    
    public void closeAccount(int accountNumber) {
        Connect connect = BankingConnection.connect();
        String sql  = "DELETE FROM account WHERE accNumber=?";
        PrepareStatement prepareStatement;
        
    }
    
     public void depositMoney(int number, double amount) {
        Account account = getAccount(number);
        System.out.println("Hello");
        Connect connect = BankingConnection.connect();
        String sql = "UPDATE account SET accBalance "
    }
     
     public void  withdrawMoney(int number,double amount){
        Account account = getAccount(number);
        System.out.println("Hello");
     }
         
     
     public Account getAccount(int number) {
         Connect connect = BankingConnection.connect();
         String sql = "SELECT * FROM account WHERE accNumber=?";
         PreparedStatement preparedStatement;
         
         
         
         
         
         String acctName = "aaaa";
         double balance = 1000;
         Account account = new Account(number,acctName, balance);
         return account;
     }

}
