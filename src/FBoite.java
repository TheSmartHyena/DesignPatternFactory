// ConcreteCreator
public class FBoite implements IFBoite {
    public static Boite creerBoite(EBoxType type) {
        switch(type) {
            case BOIS -> {
                return new Boite(EBoxType.BOIS);
            }
            case METAL -> {
                return new Boite(EBoxType.METAL);
            }
            case CARTON -> {
                return new Boite(EBoxType.CARTON);
            }
        }
        return null;
    }
}
