public class Members {

    private int numbObst;
    private int countMemb;
    public static int count = 0;

    public Members(int howmanyObst) {
        this.numbObst = howmanyObst;
        ++count;
        this.countMemb = count;
    }

    public int getNumbObst() {
        return numbObst;
    }

    public static int getCount() {
        return count;
    }
}
