
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

        User [] users = new User[10];
        users[0] = new User(32, 56, 177);
        users[1] = new User(45, 50, 167);
        users[2] = new User(34, 57, 157);
        users[3] = new User(25, 90, 147);
        users[4] = new User(63, 56, 169);
        users[5] = new User(76, 45, 156);
        users[6] = new User(34, 34, 178);
        users[7] = new User(23, 78, 174);
        users[8] = new User(12, 66, 170);
        users[9] = new User(34, 65, 165);



        int sumAge = users[0].age+users[1].age+users[2].age+users[3].age+users[4].age+users[5].age+users[6].age+users[7].age+users[8].age+users[9].age;
        double sumWeight = users[0].weight+users[1].weight+users[2].weight+users[3].weight+users[4].weight+users[5].weight+users[6].weight+users[7].weight+users[8].weight+users[9].weight;
        double sumHeight = users[0].height+users[1].height+users[2].height+users[3].height+users[4].height+users[5].height+users[6].height+users[7].height+users[8].height+users[9].height;


        System.out.println(sumAge);
        System.out.println(sumWeight);
        System.out.println(sumHeight);




    }

    }
