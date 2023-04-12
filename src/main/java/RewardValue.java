public class RewardValue {
    private Double cashValue;
    private int MilesValue;

    RewardValue(Double cashValue) {
        this.cashValue = cashValue;
       this.MilesValue= (int) (cashValue/.0035);
    }

    RewardValue(int MilesValue) {
        this.MilesValue = MilesValue;
        this.cashValue=this.MilesValue*.0035;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public void setCashValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public int getMilesValue() {
        return MilesValue;
    }

    public void setMilesValue(int milesValue) {
        MilesValue = milesValue;
    }
}