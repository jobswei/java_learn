package learn.jdbc.myjdbc;

public interface JbdcInterface {

    // 连接
    public Object getConnection();

    // crdu操作
    public void crud();

    // 关闭连接
    public void close();
}
