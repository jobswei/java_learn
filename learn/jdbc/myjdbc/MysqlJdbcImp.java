package learn.jdbc.myjdbc;

public class MysqlJdbcImp implements JbdcInterface {
    @Override
    public Object getConnection(){
        System.out.println("得到mysql连接");
            return null;
    }
    @Override
    public void crud(){
        System.out.println("完成crud");

    }
    @Override
    public void close(){
        System.out.println("Already closed.");
    }
    
}
