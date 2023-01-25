public class Horse extends Animals{
    public Horse(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    public Horse() {
    }

    @Override
    public String toString() {
        return getNickName();
    }
}
