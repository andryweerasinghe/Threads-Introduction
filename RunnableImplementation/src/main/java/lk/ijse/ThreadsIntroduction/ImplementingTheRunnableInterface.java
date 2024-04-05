/*
 * Author  : Mr.electrix
 * Project : ThreadsIntroduction
 * Date    : 4/5/24

 */

package lk.ijse.ThreadsIntroduction;

public class ImplementingTheRunnableInterface {
    public static void main(String[] args) {
        //Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        //Create a Thread object, passing the instance of MyRunnable to its constructor
        Thread thread = new Thread(myRunnable);

        //Start the thread
        thread.start();
    }
}
