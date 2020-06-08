package info.parthshah.examples.abstractfactory;

public class AmexPlatinumCard extends CreditCard {
    protected AmexPlatinumCard(){
        setCardNumberLength(15);
        setCscNumber(1234);
        setType(CardType.PLATINUM);
    }
}
