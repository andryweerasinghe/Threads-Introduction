package lk.ijse.ThreadsIntroduction;

class One{
    public void whichThread(){
        for (int i = 1; i<=5; i++){
            System.out.println("One");
        }
    }
}

class Two{
    public void whichThread(){
        for (int i = 1; i<=5; i++){
            System.out.println("Two");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

        one.whichThread();
        two.whichThread();
    }
}