package pt.up.fe.ldts.example4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Supervisor extends Worker {
    private final String username;
    private final String password;

    Set<Worker> supervisee;


    public Supervisor(String name, String phone, String username, String password) {
        super(name, phone);
        this.username = username;
        this.password = password;
        supervisee = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addSupervisee(Worker worker) {
        supervisee.add(worker);
    }

    public boolean isSupervisee(Worker worker) {
        return supervisee.contains(worker);
    }

    public boolean login(String username, String password) {
        return getUsername().equals(username) && getPassword().equals(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Worker)) return false;
        if (!(o instanceof Supervisor)) return false;
        Supervisor worker = (Supervisor) o;
        return Objects.equals(getName(), worker.getName()) &&
                Objects.equals(getPhone(), worker.getPhone()) &&
                Objects.equals(username, worker.username) &&
                Objects.equals(password, worker.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), username, password);
    }
}
