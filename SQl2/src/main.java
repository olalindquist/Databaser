import java.sql.*;

public class main {

    public static void main(String[] args) {
        String ans ="";
        String q1 = "select * from tbl_main where id = ?";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mybase3", "root", "123ABCabc!");
            //Statement stm = con.createStatement();
            //ResultSet rs = stm.executeQuery("select * from tbl_main");
            PreparedStatement pstm = con.prepareStatement(q1);

            String input = "2 or 1=1;";

            pstm.setString(1,input);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                ans = rs.getInt(1) +" "+ rs.getString(2);
            }
            System.out.println(ans);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
