public class HanoiTower{
    static void tower(int discs, char from, char temp, char to){
        if(discs == 1){
            System.out.println("move disc 1 from "+from+" to "+to);
            return;
        }
        else {
            tower(discs-1,from,to,temp);
            System.out.println("move disc "+ discs +" from "+from+" to "+to);
            tower(discs-1,temp,from,to);
        }
    }
    public static void main(String[] args) {
        System.out.println("----------------Hanoi tower----------------");
        int numberOfDiscs=3;
        tower(numberOfDiscs, 'a', 'b', 'c');

    }
    
}
