public class Cow extends Animals{

    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    public Cow() {

    }

    @Override
    public String toString() {
        return getNickName();
    }
}
