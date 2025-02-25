package CentricToAll;

public class Lab007
{
    public static void main(String[] args)
    {
        //float is of 4bytes=32bits=2147483648
        //Approximate Tax debit for this year=2147483647
        float Taxdebitnextfy=1995840733f;
        //float ActualTaxdebit=2563584073; //Occurence of an  error due to not declaring f at the number
        System.out.println("Debited amount is shown less than the actual float value " +Taxdebitnextfy);
        //System.out.print(Taxdebitnextfy+ActualTaxdebit);


    }
}
