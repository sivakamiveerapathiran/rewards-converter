import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
Double MilesValue=7142.0;
Double cash=25.0;
var rewardValue=new RewardValue(cash);
assertEquals(MilesValue,rewardValue.getMilesValue());


    }

    @Test
    void convert_from_miles_to_cash() {

        int MilesValue=7142;
        Double cash=24.997;
        var rewardValue=new RewardValue(MilesValue);
        assertEquals(cash,rewardValue.getCashValue());

    }
}
