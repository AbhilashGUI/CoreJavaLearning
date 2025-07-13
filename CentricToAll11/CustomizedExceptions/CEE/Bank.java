package CentricToAll11.CustomizedExceptions.CEE;

public class Bank
{
    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Bank(String currency, Integer amount) {
        Currency = currency;
        Amount = amount;
    }

      private String Currency;
      private Integer Amount;


      public Integer add(Bank otherbank) throws CustomException
      {
          if (!(otherbank.Currency.equals("INR")))
          {
              throw new CustomException("USD to INR is not supported");
          }
          Integer sum=this.Amount+ otherbank.Amount;
          return sum;
      }
    }


