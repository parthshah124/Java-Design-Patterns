package info.parthshah.examples.abstractfactory;

public class VisaGoldCard extends CreditCard{
    protected VisaGoldCard(){
        setCardNumberLength(16);
        setCscNumber(123);
        setType(CardType.GOLD);
    }
}
