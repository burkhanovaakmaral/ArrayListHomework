import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(2);
        numbers.add(45);
        numbers.add(67);
        numbers.add(32);
        numbers.add(1);
        numbers.add(9);
        numbers.add(96);
        numbers.add(52);
        numbers.add(7);
        numbers.add(88);
        numbers.add(93);
        numbers.add(41);
        numbers.add(29);
        numbers.add(80);
        numbers.add(44);
        numbers.add(4);
        numbers.add(56);
        numbers.add(67);
        numbers.add(72);
        numbers.add(25);
        numbers.add(73);
        numbers.add(66);
        numbers.add(12);
        numbers.add(96);
        numbers.add(30);
        numbers.add(48);
        numbers.add(55);
        numbers.add(17);
        numbers.add(57);
        numbers.add(83);
        numbers.add(91);
        numbers.add(6);
        numbers.add(39);
        numbers.add(10);
        numbers.add(27);
        numbers.add(89);
        numbers.add(60);
        numbers.add(17);
        numbers.add(15);
        numbers.add(59);
        numbers.add(58);
        numbers.add(3);
        numbers.add(49);
        numbers.add(36);
        numbers.add(4);
        numbers.add(93);
        numbers.add(8);


        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int z = numbers.get(i);
            if (z % 2 == 0){
                evenNumbers.add(z);
            }
            else{
                oddNumbers.add(z);
            }

        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}