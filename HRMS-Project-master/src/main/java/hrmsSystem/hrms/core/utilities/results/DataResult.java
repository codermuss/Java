package hrmsSystem.hrms.core.utilities.results;

//data result'a döndüreceği veri tipi söylebir - generic sınıftır
public class DataResult<T> extends Result {

    private T data;

    //this mevcut, super üst sınıfın constractorını çalıştırır
    public DataResult(T data, boolean success) {
        super(success);
        this.data=data;
    }

    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data=data;
    }

    public T getData() {
        return this.data;
    }
}
