public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.setNickName("Ferdinant");
        cow.setAge(5);
        cow.setGender("male");
        cow.setWeight(150);

        System.out.println("nickName: "+cow.getNickName()+",   age: "+cow.getAge()+", gender: "+cow.getGender()+",   weight: "+cow.getWeight());

        Cow cow2 = new Cow();
        cow2.setNickName("Ferdi");
        cow2.setAge(3);
        cow2.setGender("male");
        cow2.setWeight(130);

        System.out.println("nickName: "+cow2.getNickName()+",       age: "+cow2.getAge()+", gender: "+cow2.getGender()+",   weight: "+cow2.getWeight());

        Cow cow3 = new Cow();
        cow3.setNickName("Ferdinan");
        cow3.setAge(2);
        cow3.setGender("male");
        cow3.setWeight(90.5);
        System.out.println("nickName: "+cow3.getNickName()+",    age: "+cow3.getAge()+", gender: "+cow3.getGender()+",   weight: "+cow3.getWeight());

        Cow cow4 = new Cow();
        cow4.setNickName("Ferdina");
        cow4.setAge(5);
        cow4.setGender("female");
        cow4.setWeight(130);
        System.out.println("nickName: "+cow4.getNickName()+",     age: "+cow4.getAge()+", gender: "+cow4.getGender()+", weight: "+cow4.getWeight());

        Cow cow5 = new Cow();
        cow5.setNickName("Ferdinari");
        cow5.setAge(3);
        cow5.setGender("female");
        cow5.setWeight(110);
        System.out.println("nickName: "+cow5.getNickName()+",   age: "+cow5.getAge()+", gender: "+cow5.getGender()+", weight: "+cow5.getWeight());

        Cow cow6 = new Cow();
        cow6.setNickName("Ferdinario");
        cow6.setAge(4);
        cow6.setGender("female");
        cow6.setWeight(140);
        System.out.println("nickName: "+cow6.getNickName()+",  age: "+cow6.getAge()+", gender: "+cow6.getGender()+", weight: "+cow6.getWeight());

        Sheep sheep = new Sheep();
        sheep.setNickName("Maydan");
        sheep.setAge(3);
        sheep.setGender("male");
        sheep.setWeight(50);
        System.out.println("\nnickName: "+sheep.getNickName()+",    age: "+sheep.getAge()+", gender: "+sheep.getGender()+",   weight: "+sheep.getWeight());

        Sheep sheep2 = new Sheep();
        sheep2.setNickName("Maydanak");
        sheep2.setAge(2);
        sheep2.setGender("male");
        sheep2.setWeight(30);
        System.out.println("nickName: "+sheep2.getNickName()+",  age: "+sheep2.getAge()+", gender: "+sheep2.getGender()+",   weight: "+sheep2.getWeight());

        Sheep sheep3 = new Sheep();
        sheep3.setNickName("Maydana");
        sheep3.setAge(1);
        sheep3.setGender("female");
        sheep3.setWeight(20);
        System.out.println("nickName: "+sheep3.getNickName()+",   age: "+sheep3.getAge()+", gender: "+sheep3.getGender()+", weight: "+sheep3.getWeight());

        Sheep sheep4 = new Sheep();
        sheep4.setNickName("Maydani");
        sheep4.setAge(5);
        sheep4.setGender("female");
        sheep4.setWeight(60);
        System.out.println("nickName: "+sheep4.getNickName()+",   age: "+sheep4.getAge()+", gender: "+sheep4.getGender()+", weight: "+sheep4.getWeight());


        Horse horse = new Horse(150,6,"male","Taytoru");
        System.out.println("\nnickName: "+horse.getNickName()+",  age: "+horse.getAge()+", gender: "+horse.getGender()+",   weight: "+horse.getWeight());
        Horse horse2 = new Horse(200,7,"male","Jalyn");
        System.out.println("nickName: "+horse2.getNickName()+",    age: "+horse2.getAge()+", gender: "+horse2.getGender()+",   weight: "+horse2.getWeight());
        Horse horse3 = new Horse(140,5,"female","Shamal");
        System.out.println("nickName: "+horse3.getNickName()+",   age: "+horse3.getAge()+", gender: "+horse3.getGender()+", weight: "+horse3.getWeight());

        Farm farm = new Farm("Osh/Kyrgyzstan",new Cow[]{cow,cow2,cow3,cow4,cow5},new Horse[]{horse,horse2},new Sheep[]{sheep,sheep2,sheep3},"Farmer");
        System.out.println("\nFarm-1:");
        System.out.println("\n"+farm);
        System.out.println("\nFarm-2:");
        Farm farm2 = new Farm("Bishkek/Kyrgyzstan",new Cow[]{cow6},new Horse[]{horse3},new Sheep[]{sheep4},"Farmerbek");
        System.out.println("\n"+farm2);
    }
}