import Staya.Animal;
import Staya.Cat;
import Staya.Dog;
import Staya.Tiger;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Мурзик"),
                new Tiger("Полосатый"),
                new Dog("Тузик"),
                new Cat("Васька")
        };

        for (Animal animal : animals) {
            animal.run(300);
            animal.run(999);
            animal.swim(20);
            animal.swim(-5);
            System.out.println();
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Тигров: " + Tiger.getTigerCount());
    }
}