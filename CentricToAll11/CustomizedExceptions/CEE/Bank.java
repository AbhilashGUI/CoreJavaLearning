package CentricToAll11.CustomizedExceptions.CEE;

public class Bank
{
      private String Currency;
      private Integer Amount;

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        this.Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        this.Amount = amount;
    }
    public Bank(String currency, Integer amount) {
        this.Currency = currency;
        this.Amount = amount;
    }
    public Integer add(Bank bankName) throws CustomException
    {
        if (!(bankName.Currency.equals("INR")))
        {
            throw new CustomException("USD to INR is not supported");
        }
        Integer sum=this.Amount+bankName.Amount;
        return  sum;
    }
}

