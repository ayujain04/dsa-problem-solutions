import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        List<Integer> cand = new ArrayList<>();
        for(int candle: candles) cand.add(candle);

        cand.sort(Comparator.reverseOrder());

        int nights = 0;

        while(burnCandles(nights + 1, cand)) {
            nights++;
        }

        return nights;

    }

    /**
     * @return whether you can still burn enough candles
     */
    private boolean burnCandles(int nights, List<Integer> cand) {

        if(nights > cand.size()) return false;

        for(int i = 0; i < nights; i++) {
            if(cand.get(i) == 0) {
                return false;
            } else {
                cand.set(i, cand.get(i) - 1);
            }
        }

        cand.sort(Comparator.reverseOrder());
        return true;
    }
}