public interface Participant
{
    void run(int distance);
    void jump(int height);
    boolean isActive();
    String getName();
}