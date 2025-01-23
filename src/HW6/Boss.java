package HW6;

public class Boss extends GameEntity {

    // АТРИБУТЫ

    private Weapon weapon;

    // МЕТОДЫ ДОСТУПА

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // МЕТОДЫ

    public void printInfo() {
        System.out.println("    Health = " + this.getHealth());
        System.out.println("    Damage = " + this.getDamage());
        System.out.println("    Weapon = {type = " + this.weapon.getType() + ", name = " + this.weapon.getName() + "}");
    }

}
