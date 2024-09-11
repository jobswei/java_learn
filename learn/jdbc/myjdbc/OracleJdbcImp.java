package learn.jdbc.myjdbc;

public class OracleJdbcImp implements JbdcInterface{
    @Override
    public Object getConnection(){
        System.out.println("get oracle connection");
            return null;
    }
    @Override
    public void crud(){
        System.out.println("finish crud");

    }
    @Override
    public void close(){
        System.out.println("Already closed.");
    }
}
