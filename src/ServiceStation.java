public class ServiceStation {

    class Semaphore {
        private int value;

        public Semaphore(int initial) {
            value = initial;
        }

        public synchronized void waitFreePump() throws InterruptedException {
            value--;
            if (value < 0) {
                wait();
            }
        }

        public synchronized void notifyFreePump() throws InterruptedException {
            value++;
            if (value <= 0) {
                notify();
            }
        }
    }

}