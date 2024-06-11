import java.sql.*;
import java.util.Scanner;

public class UpdateDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "");
            Statement stmt = con.createStatement();
            System.out.println("1. Update");
            System.out.println("2. Delete");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.print("Ente the current roll no you want to update: ");
                String old_roll = sc.nextLine();
                System.out.print("Enter new first name: ");
                String fName = sc.nextLine();
                System.out.print("Enter new last name: ");
                String lName = sc.nextLine();
                System.out.print("Enter new roll number: ");
                String roll = sc.nextLine();
                System.out.print("Enter new depertment name: ");
                String depertment = sc.nextLine();
                System.out.print("Enter new section name: ");
                String sec = sc.nextLine();
                String sql = "UPDATE student SET first_name = ?, last_name = ?, roll_no = ?, depertment = ?, section = ? WHERE roll_no = ?";
                PreparedStatement psmt = con.prepareStatement(sql);
                psmt.setString(1, fName);
                psmt.setString(2, lName);
                psmt.setString(3, roll);
                psmt.setString(4, depertment);
                psmt.setString(5, sec);
                psmt.setString(6, old_roll);

                int affectedRow = psmt.executeUpdate();
                System.out.println("Updated " + affectedRow + " rows");

            } else if (ch == 2) {
                System.out.print("Ente the current roll no you want to delete: ");
                String roll = sc.nextLine();
                String sql = "DELETE FROM student WHERE roll_no = ?";
                PreparedStatement psmt = con.prepareStatement(sql);
                psmt.setString(1, roll);
                int affectedRow = psmt.executeUpdate();
                System.out.println("Deleted " + affectedRow + " rows");
            } else {
                System.out.println("Invalid choice");
            }
        } catch (Exception e) {
            System.out.println("Error::" + e.getMessage());
        }
    }
}
