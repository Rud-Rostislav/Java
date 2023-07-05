import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String DB_URL = "jdbc:mysql://robot-do-user-1968994-0.b.db.ondigitalocean.com:25060/rrs_homework";
    private static final String DB_USER = "doadmin";
    private static final String DB_PASSWORD = "AVNS_I6wlDKjGszZn1wvLr9t";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            StudentManager studentManager = new StudentManager(connection);

            Student student = new Student("Євгеній", 25);
            studentManager.addStudent(student);

            // Отримати студента з бази даних за його ID
            int studentId = student.getId();
            Student loadedStudent = studentManager.getStudent(studentId);
            System.out.println("Студент, якого додали:\n" + loadedStudent);


            Student student2 = new Student("Іван", 30);
            studentManager.addStudent(student2);

            // Отримати студента з бази даних за всім ID
            Student loadedStudent2 = studentManager.getStudent(student2.getId());
            System.out.println("Студент, якого додали:\n" + loadedStudent2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}