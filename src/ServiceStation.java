public class ServiceStation {

    class Semaphore {
        private int freePumps;

        public Semaphore(int value) {
            freePumps = value;
        }

        public synchronized void waitFreePump() throws InterruptedException {
            freePumps--;
            if (freePumps < 0) {
                wait();
            }
        }

        public synchronized void notifyFreePump() throws InterruptedException {
            freePumps++;
            if (freePumps <= 0) {
                notify();
            }
        }
    }

}