public class Sheep extends Animals{
    public Sheep(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return getNickName();
    }
}
