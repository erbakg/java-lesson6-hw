public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setName("Разрушитель");
        bossWeapon.setWeaponType(WeaponType.PHYSICAL);
        Boss bigBoss = new Boss("Boss", 500, 100, bossWeapon);
        bigBoss.printInfo();

        Weapon scWeapon = new Weapon();
        scWeapon.setName("Ultra Bow");
        scWeapon.setWeaponType(WeaponType.PHYSICAL);
        Skeleton sc1 = new Skeleton("sc1", 150, 50, scWeapon, 20);
        sc1.printInfo();
        Skeleton sc2 = new Skeleton("sc2", 120, 70, scWeapon, 30);
        sc2.printInfo();

    }
}