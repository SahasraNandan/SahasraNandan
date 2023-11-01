import java.util.Objects;

// Record class used for only which class are create for store the data do not do any operation and get the values
// those class we are created record class
class ExamRecord{
    private final int id;
    private final String name;

    ExamRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ExamRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamRecord that = (ExamRecord) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
   /* record ExamRecord(int id ,String name){// update version it will work fine we need to create in side method also
   // we create the canonical constructor  means same paratemer we create constructor also
   // record class not extends normal class only record class only .we can implements the interfaces
   // we can create the static variable but instance variable we need to create class it self
     ExamRecord(int id ,String name){


     }

    }*/
public class ExampleOfRecordClassJava17 {
    public static void main(String[] args) {
        ExamRecord er= new ExamRecord(1,"abc");
        ExamRecord er2= new ExamRecord(1,"abc");
        System.out.println(er.toString());
        System.out.println(er.equals(er2));

    }
}
