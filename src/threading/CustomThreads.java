package threading;

public class CustomThreads{

    int maxNumber = 10;
    int number = 1;

    public synchronized void printSync(int remainder) throws InterruptedException {

        while(number < maxNumber){
            if(number % 3 != remainder && number < maxNumber){
                this.wait();
            }else if(number < maxNumber){
                System.out.println(Thread.currentThread().getName()  +": " + number);
                this.notifyAll();
                number++;
            }
        }


    }
}
