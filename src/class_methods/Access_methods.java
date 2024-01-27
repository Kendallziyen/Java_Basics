package class_methods;

public class Access_methods {

    public void fastRunner() {
        System.out.println("I run as fast as possible");
    }

    public void speed(int maxSpeed) {
        System.out.println("Your speed is " + maxSpeed);
    }
}

class codeExecution {

    public static void main(String[] args) {

        Access_methods myRunner = new Access_methods();
        Access_methods mySpeed = new Access_methods();

        myRunner.fastRunner();
        mySpeed.speed(100);
    }
}