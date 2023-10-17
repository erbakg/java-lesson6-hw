public class Skeleton extends Boss {

    private int quantityOfArrows;

    public Skeleton(String name, int health, int damage, WeaponType weaponType, int quantityOfArrows) {
        super(name, health, damage, weaponType);
        this.quantityOfArrows = quantityOfArrows;
    }

    public int getQuantityOfArrows() {
        return quantityOfArrows;
    }

    public void setQuantityOfArrows(int quantityOfArrows) {
        this.quantityOfArrows = quantityOfArrows;
    }

    @Override
    public void printInfo() {
      super.printInfo();
        System.out.println("Arrows quantity: " + this.quantityOfArrows);
    }
}
