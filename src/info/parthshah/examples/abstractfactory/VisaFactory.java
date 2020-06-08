package info.parthshah.examples.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType type){
        switch(type){
            case PLATINUM:
                return new VisaPlatinumCard();
            case GOLD:
                return new VisaGoldCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType type) {
        switch(type){
            case PLATINUM:
                return new VisaPlatinumValidator();
            case GOLD:
                return new VisaGoldValidator();
            default:
                return null;
        }
    }
}
