package learn.file.simulation;

// 处理流
public class BufferedReader_  extends Reader_{
    private Reader_ reader_; //属性是Reader_类型
    public BufferedReader_(Reader_ reader_){
       this.reader_=reader_; 
    }

    @Override
    public void readFile(){
        reader_.readFile();
    }
    // 扩展他的功能
    public void readFile(int num){
        for(int i=0;i<num;i++){
            reader_.readFile();
        }
    }
}
