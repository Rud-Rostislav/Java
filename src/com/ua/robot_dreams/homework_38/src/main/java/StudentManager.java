import java.sql.*;

public class StudentManager {
    private final Connection connection;

    public StudentManager(Connection connection) {
        this.connection = connection;
    }

    public void addStudent(Student student) throws SQLException {
        String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.executeUpdate();

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int studentId = generatedKeys.getInt(1);
                    student.setId(studentId);
                }
            }
        }
    }

    public Student getStudent(int id) throws SQLException {
        String selectQuery = "SELECT * FROM students WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    Student student = new Student(name, age);
                    student.setId(id);
                    return student;
                }
            }
        }

        return null;
    }
}