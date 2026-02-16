package JDBCPractice.com.jdbcQuestions.StudentDB;


import java.sql.Connection;
import java.sql.Statement;

import JDBCPractice.com.jdbcQuestions.DatabaseConnection;

public class CreateStudentDB {

    public static void main(String[] args) {

        String createDb = "CREATE DATABASE IF NOT EXISTS student_db";
        String useDb = "USE student_db";

        String createTable = """
                CREATE TABLE IF NOT EXISTS students (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    email VARCHAR(100) UNIQUE NOT NULL,
                    age INT,
                    grade VARCHAR(10),
                    enrollment_date DATE
                )
                """;

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(createDb);
            System.out.println("Database created");

            stmt.execute(useDb);
            System.out.println("Using student_db");

            stmt.executeUpdate(createTable);
            System.out.println("Table students created");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
