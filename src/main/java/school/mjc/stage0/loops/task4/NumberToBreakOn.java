package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            int i = 1;
            while (i <= numberToGoUntil) {
                System.out.println(i);
                i++;
            }
        } else {
            int i = 1;
            while (i <= toBreakWith) {
                System.out.println(i);
                i++;
            }

        }
    }
}
