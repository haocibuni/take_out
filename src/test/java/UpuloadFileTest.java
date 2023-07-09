import org.junit.jupiter.api.Test;

public class UpuloadFileTest {
    @Test
    public void test(){
        String filename = "abc.jpg";
        String suffixfileName = filename.substring(filename.lastIndexOf("."));
        System.out.println(suffixfileName);
    }
}
