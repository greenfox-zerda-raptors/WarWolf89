package com.greenfox.bx;

/**
 * Created by almasics on 2016.11.16..
 */
public class CreditCard implements CreditCardy {

    int sumCVV;
    String nameCardholder;
    String codeAccount;

    public CreditCard(){

    }

    public CreditCard (int sumCVV, String name, String cardnumber) {
    this.codeAccount = cardnumber;
        this.nameCardholder=name;
        if (sumCVV <=0){
            this.sumCVV = cumSumCVV(cardnumber);
        }
        else {
            this.sumCVV =sumCVV;
        }
    }
    @Override
    public void setSumCVV(int sumCVV) {
        this.sumCVV=sumCVV;
    }

    @Override
    public int getSumCVV() {
        return sumCVV;
    }

    @Override
    public void setNameCardholder(String nameCardholder) {
        this.nameCardholder=nameCardholder;

    }

    @Override
    public String getNameCardholder() {
        return nameCardholder;
    }

    @Override
    public void setCodeAccount(String codeAccount) {
        this.codeAccount=codeAccount;

    }

    @Override
    public String getCodeAccount() {
        return codeAccount;
    }

    @Override
    public int cumSumCVV(String codeAccount) {

            int sum = 0;
            char c;

            for (int i = 0; i < codeAccount.length()-1; i++) {
                c = codeAccount.charAt(i);
                sum += (c >= '0' && c <= '9') ? Character.getNumericValue(c) : 0;
            }

            return sum;

        }


    @Override
    public boolean ValidCard(String codeAccount, int sumCVV) {
        return (cumSumCVV(codeAccount)==sumCVV);
    }


    public String toString(){
        return String.format("Name=%s CC#=%s CVV=%d",nameCardholder, codeAccount, sumCVV);

    }
}
