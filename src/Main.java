public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // monster
        Monster monster = new Monster();
        Hero hero = new Hero();

        monster.name = "Khal Drogo";
        hero.name = "Jon Snow";

        System.out.println(hero.name + " Walks thru the tall muntens and over the edge of the snowy top he meets " + monster.name + ". " + hero.name + " challenges "+ monster.name + " in a fight to the death!");

        System.out.println();
        System.out.println(hero.name + "has " + hero.hp + "hp");
        System.out.println();
        System.out.println(monster.name + "has " + monster.hp + "hp");

        System.out.println();
        System.out.println(hero.name + " slashes " + monster.name + " arm off.");

        monster.hp -= 50;

        System.out.println();
        System.out.println(hero.name + "has " + hero.hp + "hp");
        System.out.println();
        System.out.println(monster.name + "has " + monster.hp + "hp");

        System.out.println();
        System.out.println("As a fineshing move " + hero.name + "slashes " + monster.name + " HEAD OFF!!!");
        System.out.println();

        monster.hp -= 150;

        System.out.println(hero.name + "has " + hero.hp + "hp");
        System.out.println();
        System.out.println(monster.name + "has " + monster.hp + "hp");
        System.out.println();

        System.out.println(hero.name + " GG get reckt.");


    }
}