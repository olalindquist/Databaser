import java.sql.*;
import java.util.Scanner;

class Main{

    public static void main(String args[]){
        Gui gui = new Gui();

        Scanner in = new Scanner(System.in);
String input = "-1";
while(!input.equals("q")) {

    if (input.equals("-1")) {
        input = gui.getVal();


        try {

            //   Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mybase", "root", "xxx");

            //con = DriverManager.getConnection(, user, pass);
            //here sonoo is database name, root is username and password

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from Persons where PersonID = " + input + ";");// +person);

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        input = "-1";
    }
}
    }

}