package Assignment08OCtober;


public class NatualNumber {

    public synchronized static void naturalNumbers() {
        System.out.println("Natural numbers between 20 and 30: ");
        for (int i = 20; i <= 30; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    
    
    

    public synchronized static void sumOfPrimes() {
        int count = 0, num = 2, sum = 0;

        while (count < 10) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of the first 10 prime numbers: " + sum);
    }
    
    public static void main(String[] args) {
     
        Thread thread1 = new Thread(() -> sumOfPrimes());
        Thread thread2 = new Thread(() -> naturalNumbers());

        thread1.start();
        thread2.start();

     
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   

   
}
