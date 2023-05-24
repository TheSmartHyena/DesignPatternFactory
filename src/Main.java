public class Main {
    public static void main(String[] args) {
        Boite metal = FBoite.creerBoite(EBoxType.METAL);
        Boite carton = FBoite.creerBoite(EBoxType.CARTON);
        Boite bois = FBoite.creerBoite(EBoxType.BOIS);

        System.out.println(bois.toString());
        System.out.println(metal.toString());
        System.out.println(carton.toString());
    }
}