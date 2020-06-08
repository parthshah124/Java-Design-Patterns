package info.parthshah.examples.abstractfactory;

public class AmexGoldCard extends CreditCard {
    protected AmexGoldCard(){
        setCardNumberLength(15);
        setCscNumber(1234);
        setType(CardType.GOLD);
    }
}
