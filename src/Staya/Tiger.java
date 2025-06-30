package Staya;


    public class Tiger extends Animal
    {
        private static int tigerCount = 0;

        public Tiger(String name)
        {
            super(name, 1000, 50);
            tigerCount++;
        }

        public static int getTigerCount()
        {
            return tigerCount;
        }
    }

