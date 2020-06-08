package info.parthshah.examples.abstractfactory;

public class VisaPlatinumCard extends CreditCard{
    protected VisaPlatinumCard(){
        setCardNumberLength(16);
        setCscNumber(123);
        setType(CardType.PLATINUM);
    }
}
