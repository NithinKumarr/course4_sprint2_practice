import java.util.Scanner;

public class Account
{
    double newBalance;
    double accountBalance;
    void input() {

        System.out.println("Enter Account Balance :");
        Scanner sc = new Scanner(System.in);
        accountBalance = sc.nextInt();
    }

    public double withdraw(double amount) throws InsufficientFundException
    {
        if(accountBalance<amount)
        {
            InsufficientFundException obj =  new InsufficientFundException("Withdrawal Amount should be less than Account Balance");
            throw obj;
        }
        else
        {
            newBalance = accountBalance - amount;
            System.out.print("your Available Balance : ");
        }
        return  newBalance;
    }

    public static void main(String[] args) {
        Account obj =  new Account();
        obj.input();
        try
        {
            System.out.println(obj.withdraw(50000));
        }catch(InsufficientFundException e)
        {
            System.out.println(e);
        }
    }
}