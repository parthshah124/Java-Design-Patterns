package info.parthshah.examples.abstractfactory;

public class VisaGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard card) {
        return card.getType() == CardType.GOLD && card.cardNumberLength == 16;
    }
}
