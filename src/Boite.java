// ConcreteProduct
public class Boite implements IBoite {
    private EBoxType type;

    public Boite(EBoxType type) {
        this.type = type;
    }

    @Override
    public EBoxType getBoxType() {
        return this.type;
    }
    @Override
    public String getBoxTypeString() {
        switch(this.type) {
            case BOIS -> {
                return "bois";
            }
            case METAL -> {
                return "métal";
            }
            case CARTON -> {
                return "carton";
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "Boite: " + this.getBoxTypeString();
    }
}
