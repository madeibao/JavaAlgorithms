package com.BasicThreadTest.www;

/**
 * @ClassName ThreadThree
 * @Author：Mayuan
 * @Date 2021/3/26/0026 14:44
 * @Description TODO
 * @Version 1.0
 *
 * 三个线程交替的打印程序。
 *
 **/
public class ThreadThree {

    public static void main(String[] args) {
        ThreadThree demo1 = new ThreadThree();
        PrintLetter printLetter = demo1.new PrintLetter();
        new Thread(demo1.new PrintThread(printLetter, 'B')).start();
        new Thread(demo1.new PrintThread(printLetter, 'A')).start();
        new Thread(demo1.new PrintThread(printLetter, 'C')).start();
//        Collections.synchronizedList()
    }

    private class PrintLetter {
        private char letter = 'A';

        public char getLetter() {
            return letter;
        }

        public void print() {
            System.out.print(letter);
            if('C' == letter) {
                System.out.println();
            }
        }

        public void nextLetter() {
            switch (letter) {
                case 'A': {
                    letter = 'B';
                    break;
                }
                case 'B': {
                    letter = 'C';
                    break;
                }
                case 'C': {
                    letter = 'A';
                    break;
                }
            }
        }
    }

    private class PrintThread implements Runnable {
        private PrintLetter printLetter;
        private char letter;

        public PrintThread(PrintLetter printLetter, char letter) {
            this.printLetter = printLetter;
            this.letter = letter;
        }

        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                synchronized (printLetter) {
                    while(letter != printLetter.getLetter()) {
                        try {
                            printLetter.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    printLetter.print();
                    printLetter.nextLetter();
                    printLetter.notifyAll();
                }
            }
        }
    }
}
