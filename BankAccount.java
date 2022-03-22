public class BankAccount {
    private String owner;
    private int balance;

    BankAccount(String owner)
    {
        this.owner = owner;
        this.balance = 0;
    }

    BankAccount(String owner,int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public String getOwner()
    {
        return owner;
    }

    public void withDraw(int amount)
    {
        if(amount <=0)
            System.out.println("invalid amount" );
        else if(balance-amount >0)
            balance = balance - amount;
        else
            System.out.println("don't have enough balance");
    }

    public void deposit(int amount)
    {
        if(amount <=0)
            System.out.println("invalid amount" );
        else
            balance = balance + amount;
    }

}
