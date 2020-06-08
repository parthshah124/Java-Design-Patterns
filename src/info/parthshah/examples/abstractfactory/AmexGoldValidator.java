package info.parthshah.examples.abstractfactory;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard card) {
        return card.getType() == CardType.GOLD && card.cardNumberLength == 15;
    }
}
