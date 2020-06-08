package info.parthshah.examples.abstractfactory;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard card) {
        return card.getType() == CardType.PLATINUM && card.cardNumberLength == 15;
    }
}
