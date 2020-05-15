package kz.beeline.my;

public class Person {
    private int iin;
    private String name;
    private Sex sex;

    public Person(int iin, String name, Sex sex) {
        this.iin = iin;
        this.name = name;
        this.sex = sex;
    }

    public int getIin(){
        return iin;
    }

    public Sex getSex(){
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return iin;
    }

    @Override
    public String toString() {
        String str = name + ", ";
        switch (sex){
            case FEMALE:
                str = str.concat("женский"); break;
            case MALE:
                str = str.concat("мужской"); break;
        }
        return str;
    }
}
