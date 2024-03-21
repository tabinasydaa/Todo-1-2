class Kucing{
    String name;
    String skinColor;
    int age;
    String type;

    public Kucing(String name,  String skinColor, int age, String type){
        this.name = name;
        this.skinColor = skinColor;
        this.age = age;
        this.type = type;
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void sleep(){
        System.out.println(name + " is sleeping.");
    }

    void play(){
        System.out.println(name + " is playing.");
    }

    void walk(){
        System.out.println(name + " is walking.");
    }
}

public class Main{
    public static void main(String[] args){
        Kucing Ciko = new Kucing("Ciko", "White and Brown", 8, "Persia");
        Kucing Kiko = new Kucing("Kiko", "Black", 5, "Anggora");
        Kucing Coco = new Kucing("Coco", "Yellow and White", 7, "Sphynx");
        Kucing Koko = new Kucing("Koko", "White", 6, "Persia");

        Ciko.sleep();
        Kiko.eat();
        Coco.walk();
        Koko.play();
    }
}