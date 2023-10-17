public class Main {
    public static void main(String[] args) {
        Boss bigBoss = new Boss("Boss",500, 100, WeaponType.PHYSICAL);
        bigBoss.printInfo();

        Skeleton sc1 = new Skeleton("sc1",150, 50, WeaponType.PHYSICAL, 20);
        sc1.printInfo();
        Skeleton sc2 = new Skeleton("sc2",120, 70, WeaponType.PHYSICAL, 30);
        sc2.printInfo();

    }
}