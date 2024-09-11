package learn.jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args){
        JbdcInterface jbdcInterface=new OracleJdbcImp();
        jbdcInterface.getConnection();
        jbdcInterface.crud();
        jbdcInterface.close();
    }
}
