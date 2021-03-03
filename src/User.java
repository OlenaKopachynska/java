
public class User {

    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        User user1 = new User(32, 56, 177);
        User user2 = new User(45, 50, 167);
        User user3 = new User(34, 57, 157);
        User user4 = new User(25, 90, 147);
        User user5 = new User(63, 56, 169);
        User user6 = new User(76, 45, 156);
        User user7 = new User(34, 34, 178);
        User user8 = new User(23, 78, 174);
        User user9 = new User(12, 66, 170);
        User user10 = new User(34, 65, 165);

        int sumAge = user1.age+user2.age+user3.age+user4.age+user5.age+user6.age+user7.age+user8.age+user9.age+user10.age;
        double sumWeight = user1.weight+user2.weight+user3.weight+user4.weight+user5.weight+user6.weight+user7.weight+user8.weight+user9.weight+user10.weight;
        double sumHeight = user1.height+user2.height+user3.height+user4.height+user5.height+user6.height+user7.height+user8.height+user9.height+user10.height;


        System.out.println(sumAge);
        System.out.println(sumWeight);
        System.out.println(sumHeight);




    }

    }
