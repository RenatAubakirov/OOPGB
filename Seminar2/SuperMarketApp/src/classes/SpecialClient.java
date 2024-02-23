package classes;

public class SpecialClient extends BaseClient {
    private int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

}