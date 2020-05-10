package HanoiTower;
public class HanoiTower{
    static void tower(int discs, char source, char temporary, char destination){
        if(discs == 1){
            System.out.println("move disc 1 from " + source + " to " + destination);
            return;
        }
        else {
            tower(discs-1, source, destination, temporary);
            System.out.println("move disc "+ discs +" from "+source+" to "+destination);
            tower(discs-1, temporary, source, destination);
        }
    }
    public static void main(String[] args) {
        System.out.println("----------------Hanoi tower----------------");
        int numberOfDiscs=3;
        tower(numberOfDiscs, 'a', 'b', 'c');

    }
    
}
