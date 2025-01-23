package HW6;

public class Main {
    public static void main(String[] args) {

        // СОЗДАНИЯ БОССА
        Boss boss = new Boss();

        // Создание оружия для босса
        Weapon bossWeapon = new Weapon();
        // Устанавливаем значения для атрибутов оружия
        bossWeapon.setType(WeaponType.COLD_STEEL);
        bossWeapon.setName("Boss Sword");

        // Устанавливаем значения босса
        boss.setWeapon(bossWeapon);
        boss.setDamage(50);
        boss.setHealth(1000);

        //  Вывод информации о боссе
        System.out.println("Boss {");
        boss.printInfo();
        System.out.println("}\n");

        // СОЗДАНИЕ СКЕЛЕТА 1
        Skeleton skeleton1 = new Skeleton();

        // Создания оружия для скелета 1
        Weapon skeleton1Weapon = new Weapon();
        // Устанавливаем значения для атрибутов оружия
        skeleton1Weapon.setType(WeaponType.THROWING_WEAPON);
        skeleton1Weapon.setName("Skeleton1 Bow");

        // Устанавливаем значения скелета 1
        skeleton1.setWeapon(skeleton1Weapon);
        skeleton1.setDamage(75);
        skeleton1.setHealth(700);
        skeleton1.setNumberOfArrows(50);

        // Вывод информации о скелете 1
        System.out.println("Skeleton1 {");
        skeleton1.printInfo();
        System.out.println("}\n");

        // СОЗДАНИЕ СКЕЛЕТА 2
        Skeleton skeleton2 = new Skeleton();

        // Создания оружия для скелета 2
        Weapon skeleton2Weapon = new Weapon();
        // Устанавливаем значения для атрибутов оружия
        skeleton2Weapon.setType(WeaponType.FIREARM);
        skeleton2Weapon.setName("Skeleton2 AK-47");

        // Устанавливаем значения скелета 2
        skeleton2.setWeapon(skeleton2Weapon);
        skeleton2.setDamage(100);
        skeleton2.setHealth(600);
        skeleton2.setNumberOfArrows(45);

        // Вывод информации о скелете 2
        System.out.println("Skeleton2 {");
        skeleton2.printInfo();
        System.out.println("}");

    }
}
