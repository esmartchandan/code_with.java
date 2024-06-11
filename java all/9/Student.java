import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lName = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter depertment name: ");
        String depertment = sc.nextLine();
        System.out.print("Enter section name: ");
        String sec = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO student (first_name, last_name, roll_no, depertment, section) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psmt = con.prepareStatement(sql);

            psmt.setString(1, fName);
            psmt.setString(2, lName);
            psmt.setString(3, roll);
            psmt.setString(4, depertment);
            psmt.setString(5, sec);

            int affectedRow = psmt.executeUpdate();

            System.out.println("Inserted " + affectedRow + " rows");
        } catch (Exception e) {
            System.out.println("Exception:: " + e.getMessage());
        }
    }
}
