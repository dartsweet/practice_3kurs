package Staya;


    public class Animal
    {
        private static int animalCount = 0;
        private String name;
        private int maxRunDistance;
        private int maxSwimDistance;

        public Animal(String name, int maxRunDistance, int maxSwimDistance)
        {
            this.name = name;
            this.maxRunDistance = maxRunDistance;
            this.maxSwimDistance = maxSwimDistance;
            animalCount++;
        }

        public void run(int distance)
        {
            if (distance < 0)
            {
            System.out.println(name + " дистанция бега не может быть отрицательной");
            return;
            }
            if (distance <= maxRunDistance)
            {
                System.out.println(name + " пробежал " + distance + " м");
            }
            else
            {
                System.out.println(name + " не смог пробежать " + distance + " м");
            }
        }

        public void swim(int distance)
        {
            if (distance < 0)
            {
            System.out.println(name + " дистанция плавания не может быть отрицательной");
            return;
            }
            if (maxSwimDistance == 0)
            {
                System.out.println(name + " не умеет плавать");
            }
            else if (distance <= maxSwimDistance)
            {
                System.out.println(name + " проплыл " + distance + " м");
            }
            else
            {
                System.out.println(name + " не смог проплыть " + distance + " м");
            }
        }

        public static int getAnimalCount()
        {
            return animalCount;
        }

        public String getName()
        {
            return name;
        }
    }

