package hw_8;

import java.util.Objects;

public abstract class MassMedia {
    private String name = "No name";

    public MassMedia() {
    }

    public MassMedia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null&& !name.isBlank())
        this.name = name;
    }

    @Override
    public String toString() {
        return "MassMedia{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MassMedia massMedia = (MassMedia) o;
        return Objects.equals(name, massMedia.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
