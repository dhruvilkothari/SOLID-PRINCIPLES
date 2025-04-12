public class Mobile implements Observer{
    @Override
    public void update(int temp) {
        System.out.println("Mobile: " + temp);
    }
}
