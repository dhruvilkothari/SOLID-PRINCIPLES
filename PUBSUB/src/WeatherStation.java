import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers;
    int temperature;

    WeatherStation(){
        temperature = 23;
        observers = new ArrayList<>();
    }
    public void setTemperature(int temp){
        notifyObservers(temp);
    }

    @Override
    public void addObserver(Observer observer) {
        boolean flag = observers.stream().anyMatch(o -> o.equals(observer));
        if(flag==false){
            observers.add(observer);
        }
        return;

    }

    @Override
    public void removeObserver(Observer observer) {
        boolean flag = observers.stream().anyMatch(o -> o.equals(observer));
        if(flag==true){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(int temp) {
        observers.forEach(observer -> observer.update(temp));
    }
}
