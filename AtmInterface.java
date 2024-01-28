import java.util.Scanner;


    class atm{
        float balance;
        int pin=5678;


        public void checkpin(){
            System.out.println("please entred a pin number:");
            Scanner sc=new Scanner(System.in);
            int grabpin=sc.nextInt();

            if(grabpin==pin){
                 
                menu();


            }
            else{
                System.out.println("invalid pin please try again:");
                checkpin();
            }

        }
        public void menu(){
            System.out.println("Enter option you wnat you choose:");
            System.out.println("1.checkbalance");
             System.out.println("2.withdrawMoney:");
              System.out.println("3.Depositbalance:");
               System.out.println("4.Exit");

                Scanner sc=new Scanner(System.in);
               int opt = sc.nextInt();

               if(opt==1){
                  checkbalance();
                   
               }
               else if(opt==2){
                withdraw();
               }
               else if(opt==3){
                  Depositbalance();
               }
               else if(opt==4){
                return;
               }
               else{
                System.out.println("enter a option is invalid:");
               }
               

         }

         public void checkbalance(){
            System.out.println("balance:" +balance);
            menu();
         }
         public void withdraw(){
            System.out.println("enter amount withdraw:");
              Scanner sc=new Scanner(System.in);
              float amount=sc.nextFloat();

              if(amount>balance){
                System.out.println("insufficent balance:");
              }
            else{
                balance=balance-amount;
                System.out.println("Amount withdrawl sucessfully:");

            }
            menu();
         }
         public void Depositbalance(){
            System.out.println("enter a balance you want to depost:");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
             balance=balance+amount;
             System.out.println("balance deposit successfully:");
              menu();

         }
         

        }  

    public class AtmInterface {
    public static void main(String[] args)
    {
        atm obj=new atm();
        obj.checkpin();


        
       
    }


    
    }
