public class Client {
    private SaveToDb saveToDb;

    public Client(SaveToDb saveToDb) {
        this.saveToDb = saveToDb;
    }

    public void save(){
          saveToDb.saveToDb();
    }
}
