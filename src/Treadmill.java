public class Treadmill implements Obstacle
{
    private int length;

    public Treadmill(int length)
    {
        this.length = length;
    }

    @Override
    public void overcome(Participant participant)
    {
        participant.run(length);
    }
}