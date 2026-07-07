package threading;

public class Threading{

    static CustomThreads customThreads = new CustomThreads();

public static void main(String args[]) {


    Thread thread1 = new Thread(() -> {

        try {
            customThreads.printSync(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    });
    Thread thread2 = new Thread(() -> {

        try {
            customThreads.printSync(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    });
    Thread thread3 = new Thread(() -> {

        try {
            customThreads.printSync(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    });

    thread1.start();
    thread2.start();
    thread3.start();

}
}
