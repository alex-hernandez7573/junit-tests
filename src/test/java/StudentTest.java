import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {

    @Test
    public Void testStudentConstruct () {
        Student alex = new Student("Alex",1L);
        Student nullStudent = null;
        assertNotNull (alex);
        assertNull(nullStudent);
    }

    @Test
    public void


}
