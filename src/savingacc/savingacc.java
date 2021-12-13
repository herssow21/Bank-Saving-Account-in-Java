package savingacc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class savingacc {
  private static double balance=2000;
  private static Scanner ch;
  private static double interestRate=0.05;
  private static double operationalbalance=2000;
    private static double trans;
    private static double trans2;
    private static double overdraftlim=500;
    private static int months;
    private static String Accname;
    static double amount;
        static double fee=30;
     private static int option;

    public static void main(String[] args) {
       // new phase2();
            ch=new Scanner(System.in);
        System.out.println("Enter Account Name");
     Accname=ch.next();
      System.out.println("Enter Account Number");
                try
                {
                    long AccNum=ch.nextLong();
                }catch(InputMismatchException ex){
                System.out.print("Enter A valid Account Number! Please.\n");
                System.exit(0);
                }
System.out.println("Your balance is ksh"+balance+"\n");
  //wrongInput();
    transaction();
    }
     private static double transaction(){
     
System.out.println("Choose a transaction to carry out");
  System.out.println("=====================================================================================================");
  System.out.println("1. Deposit                               ==      PHASE 2:                    ");
  System.out.println("2. Withdraw                              ==    10.Divisified Account         ");
  System.out.println("3. Check Balance                         ==                                  ");                
  System.out.println("4. Add interest                          ==                                  ");
  System.out.println("6. Change Interest Rate                  ==                                  ");
  System.out.println("7. Change Operation Balance              ==                                  ");
  System.out.println("8. Show previous transactions            ==                                  ");
  System.out.println("9. Change Overdraft limit                ==    12. EXIT  ");

 System.out.println("======================================================================================================");
         int choice = ch.nextInt();
 switch(choice){
     case 1:
        deposit();
        transaction();
    break;
     case 2:
         withdraw();
         transaction();   
    break;
     case 3:
         System.out.println("Your Account has a standing balance of $"+balance+"\n");
         transaction();
         break;
     case 4:
         addInterest();
         transaction();
         break;    
     case 6: ChangeIntRate();
             transaction();
             break;
     case 7: ChangeOpBalance();
     transaction();
     break;
     case 8: statements();
            transaction();
            break;
     case 9:ChangeOverdraftlim();
     transaction();break;
     case 10:
       phase2();
         break;
          case 12: System.out.println("Thanks for choosing to bank with us.GOOD BYE \n ");
     return 0;
     default:      
         System.out.print("Invalid choice!\n\n");
              transaction();
 }   
    return 0;}
//Deposit function
    private  static void deposit()   {
double depoamount;
   System.out.println("Enter amount to deposit!");
   depoamount=ch.nextDouble();
   balance+=depoamount;
   System.out.println( "You deposited ksh "+depoamount +"Your new balance is ksh "+ balance+"\n");
   //record transaction carried
    trans=depoamount;
    }
    //withdrawal method 
    //deduct transaction of ksh 30 and balance must be atleast ksh2000
    private static void withdraw(){
        System.out.println("Withdraw Through:\n1.ATM\n2.Counter ");
         int option=ch.nextInt();
      switch(option){
            //withdrawal over counter
            case 2:
          double amount;
        System.out.println("Enter amount to withdraw!");
     amount = ch.nextDouble();
     double finalbalance=balance-(amount+fee);
    if(amount<balance&& finalbalance>operationalbalance){
       System.out.println("You have withdrawn " +amount+"\n"+"Your balance is ksh "+ finalbalance+"\n");
         balance=finalbalance;
       trans2=-amount;}
         else {
         System.out.println("Insufficient balance!");
                  System.out.println("do you want an overdraft?\n1:yes\n2:No");
                  int option2=ch.nextInt() ;
         //System.out.println("Enter the number of months to repay the overdraft:");
          //     months=ch.nextInt();
                 //create overdraft limit
                  
                  switch(option2){
                  case 1:    
                       double totalded=amount+fee;
                       double finalbal=balance-amount-fee;
                      if(finalbal<=operationalbalance-(overdraftlim)){
                         System.out.println("You have exceeded Your Overdraft Limit");
           //  transaction();
                          }
                  else{
                  balance-=amount+fee;
          System.out.println("You have withdrawn ksh "+amount+"You now have balance of "+balance); }
                      //phase2
                      
                  break;
                  case 2: transaction();break;
                  default:
                  System.out.println("Invalid Input!");

                  }
          }break;
            case 1:
       //ATM transactions
                System.out.println("enter amount to withdraw!");
                amount=ch.nextDouble();
                if(amount<balance&& balance>=0){
                    finalbalance=balance-(amount+fee);
       System.out.println("you have withdrawn"+amount+"\nYour balance is ksh "+finalbalance);
               balance=finalbalance;
                } 
           else if(amount>14000){
                       System.out.println("You can't withdraw ksh"+amount+".Daily withdrawal limit is ksh 140 000"); }
      
                else{System.out.println("Insufficient Balance!");}
                break;
                default:
                System.out.println("Invalid Input !");
              break;
                  }  
 }
    //interest Adding function
    private static void addInterest( ){
    balance+=(balance*interestRate);
    System.out.println("Balance after interest is $"+balance +"\n");
    }
    //change interest_rate as required
    private static void ChangeIntRate(){
    System.out.println("Enter the new Interest Rate");
     interestRate= ch.nextDouble();
    }
    //change operation balance
    private static void ChangeOpBalance(){
        System.out.println("Enter the new Operation Balance \n");
        operationalbalance=ch.nextDouble();
    }
    //show statements method
    private static void statements(){
    if(trans>0){
        System.out.println(Accname+" Deposited: ksh" +trans );
               }
   else if(trans2<0){
                System.out.println(Accname+" withdrawn: ksh"+ Math.abs(trans2) );
                    }
       else {System.out.print("No Transactions is carried out.\n");
                          }

    }
    //wrong inputs exception
     public static int GetInteger()
     {
         while(true)
        {
            try{
           return  ch.nextInt();
            }catch(InputMismatchException e){
            ch.nextInt();
            System.out.print("wrong format for account number");
            }
                 }
    }
     
    // private static void createoverdraftlim(){}
     private static void ChangeOverdraftlim(){
                 System.out.print("Enter the new overdraft limit");
                 double newoverdraft=ch.nextDouble();
                 overdraftlim=newoverdraft;

     }
     //phase2 implementation
    static void phase2(){
      operationalbalance=0;
      balance=0;
         overdraftlim=60000;
       fee=0;
         deposit();
          System.out.println("Withdraw Through:\n1.ATM\n2.Counter ");
        int option=ch.nextInt();
        switch(option){
            case 2:
          double amount;
        System.out.println("Enter amount to withdraw!");
     amount = ch.nextDouble();
     double finalbalance=balance-(amount+fee);
    if(amount<balance&& finalbalance>operationalbalance){
       System.out.println("You have withdrawn " +amount+"\n"+"Your balance is ksh "+ finalbalance+"\n");
         balance=finalbalance;
       trans2=-amount;}
         else {
         System.out.println("Insufficient balance!");
                  System.out.println("do you want an overdraft?\n1:yes\n2:No");
                  int option2=ch.nextInt() ;
         System.out.println("Enter the number of months to repay the overdraft:");
            months=ch.nextInt();
                 //create overdraft limit
                     
                  switch(option2){
                  case 1:    
                     //  double totalded=amount+fee;
                       double finalbal=balance-amount-fee;
                      if(finalbal<operationalbalance-(overdraftlim)){
                         System.out.println("You have exceeded Your Overdraft Limit");
                          }
                  else{
                  balance-=amount+fee;
          System.out.println("You have withdrawn ksh "+amount+"You now have balance of "+balance); 
                      //phase2
                       double interestch=0.05;
         balance=months*interestch*Math.abs(balance)+ Math.abs(balance);
         System.out.println("Overdraft after charge of 5% is ksh "+balance);}
                  break;
                  case 2: transaction();break;
                  }
          }break;
            case 1:
       //Atm withdrawal for diversified Account 
                System.out.println("enter amount to withdraw!");
                amount=ch.nextDouble();
                if(balance>amount&& amount<140000){
                    finalbalance=balance-(amount+fee);
       System.out.println("you have withdrawn"+amount+"\nYour balance is ksh "+finalbalance);
                balance=finalbalance;
                 if(balance<=0){         System.out.println("Insufficient balance!"); }}
         else {
                       System.out.println("You can't withdraw ksh"+amount+".Daily ATM withdrawal limit is ksh 140 000"); }
       
     }
    
    }
 //Exception handling
    public static void EXcepHandling(){
      try
                {
                 int option,AccNum;
                }
                 catch(InputMismatchException ex){
                System.out.print("Enter A valid Option! Please.\n");
                }
    }
               
}