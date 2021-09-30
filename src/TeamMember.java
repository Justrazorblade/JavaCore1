public class TeamMember {
    String name;
    int age;
    double speed;

    public TeamMember(String name, int age, double speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public void info() {
        System.out.println("Имя участника компанды:" + name);
        System.out.println("Возраст:" + age);
        System.out.println("Скорость:" + speed);
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}