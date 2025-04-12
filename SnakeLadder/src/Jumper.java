public abstract class Jumper {
    private JumperType jumperType;
    private int start;
    private int end;
    public Jumper(JumperType jumperType, int start, int end) {
        this.jumperType = jumperType;
        this.start = start;
        this.end = end;
    }
    public JumperType getJumperType() {
        return jumperType;
    }
    public int getStart() {
        return start;
    }
    public int getEnd() {
        return end;
    }
}
