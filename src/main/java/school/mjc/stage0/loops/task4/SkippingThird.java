package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int i = 0;
        while(lastPrinted>i){
            for (int j = i; j <=lastPrinted ; j++) {
                if (i%3!=0) System.out.println(j);
                i++;
            }
        }
    }
}
