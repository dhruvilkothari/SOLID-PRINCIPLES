public class Display implements Observer{
    @Override
    public void update(int temp) {
        System.out.println("Display: " + temp);
    }
}
