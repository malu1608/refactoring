package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Client extends Worker {

    public Client(String name, String phone) {
        super(name, phone, null, null);
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
