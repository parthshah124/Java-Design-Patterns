package info.parthshah.examples.abstractfactory;

public class AmexFactory extends CreditCardFactory {
    public CreditCard getCreditCard(CardType type){
        switch(type){
            case PLATINUM:
                return new AmexPlatinumCard();
            case GOLD:
                return new AmexGoldCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType type) {
        switch(type){
            case PLATINUM:
                return new AmexPlatinumValidator();
            case GOLD:
                return new AmexGoldValidator();
            default:
                return null;
        }
    }
}
