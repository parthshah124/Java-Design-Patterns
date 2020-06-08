package info.parthshah.examples.abstractfactory;

public class VisaPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard card) {
        return card.getType() == CardType.PLATINUM && card.cardNumberLength == 16;
    }
}
