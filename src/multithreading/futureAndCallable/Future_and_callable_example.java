package multithreading.futureAndCallable;

import java.util.concurrent.*;

public class Future_and_callable_example {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        System.out.println("Factorial Service called for 10!");
        Future<Long> result10 = executorService.submit(new FactorialService(10));

        System.out.println("Factorial Service called for 20!");
        Future<Long> result20 = executorService.submit(new FactorialService(20));

        //Long factorial10 = result10.get(10,TimeUnit.MILLISECONDS); // -> this gives timeout exception
        Long factorial10 = result10.get();
        System.out.println("10! = "+factorial10);

        Long factorial20 = result20.get();
        System.out.println("20! = "+factorial20);
    }

    static class FactorialService implements Callable<Long> {
        private int number;

        public FactorialService(int number)
        {
            this.number=number;
        }

        @Override
        public Long call() throws InterruptedException {
            return factorial();
        }

        public Long factorial() throws InterruptedException {
            long result = 1;
            while(number!=0)
            {
                result=result*number;
                number--;
                Thread.sleep(100);
            }
            return result;
        }

    }

}
