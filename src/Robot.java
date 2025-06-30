public class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean active;

    public Robot(String name, int maxRunDistance, int maxJumpHeight)
    {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    @Override
    public void run(int distance)
    {
        if (active)
        {
            if (distance < 0)
            {
                System.out.println(name + " дистанция бега не может быть отрицательной!");
                active = false;
                return;
            }
            if (distance <= maxRunDistance)
            {
                System.out.println(name + " успешно пробежал " + distance + " м");
            }
            else
            {
                System.out.println(name + " не смог пробежать " + distance + " м");
                active = false;
            }
        }
    }

    @Override
    public void jump(int height)
    {
        if (active)
        {
            if (height < 0)
            {
                System.out.println(name + " высота прыжка не может быть отрицательной!");
                active = false;
                return;
            }
            if (height <= maxJumpHeight)
            {
                System.out.println(name + " успешно перепрыгнул " + height + " м");
            }
            else
            {
                System.out.println(name + " не смог перепрыгнуть " + height + " м");
                active = false;
            }
        }
    }

    @Override
    public boolean isActive()
    {
        return active;
    }

    @Override
    public String getName()
    {
        return name;
    }
}