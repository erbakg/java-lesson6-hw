public class Boss extends GameEntity{
    private WeaponType weaponType;

    public Boss(String name, int health, int damage, WeaponType weaponType){
        super(name, health, damage);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void printInfo(){
        System.out.println(this.getName() + " info:\n Health: " + this.getHealth() + " WeaponType: "+ this.weaponType);
    }
}
