package by.belhard.j2.lesson2;

public class main {


    public static void main(String[] args) {

        int x = 23;

        if (x == 20) {
            x--;
        } else if (x == 21) {
            x++;
         else {
                x /=2;
            }
        }

        int y = (x % 2== 0) ? (x / 2) : -x;


        System.out.println(x);

        System.out.println(y);
    }
}