import java.util.Objects;

public class Family extends Person {

    private Person name;
    private Person mama;
    private Person papa;

    public Family(Person name, Person mama, Person papa) {
        this.name = name;
        this.mama = mama;
        this.papa = papa;
    }

    public Person getName() {
        return name;
    }

    public void setName(Person name) {
        this.name = name;
    }

    public Person getMama() {
        return mama;
    }

    public void setMama(Person mama) {
        this.mama = mama;
    }

    public Person getPapa() {
        return papa;
    }

    public void setPapa(Person papa) {
        this.papa = papa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family fanmlie = (Family) o;
        return Objects.equals(name, fanmlie.name) && Objects.equals(mama, fanmlie.mama) && Objects.equals(papa, fanmlie.papa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mama, papa);
    }

    @Override
    public String toString() {
        return "Fanmlie{" +
                "name=" + name +
                ", Mama=" + mama +
                ", Papa=" + papa +
                '}';
    }
}
