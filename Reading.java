import java.io.FileInputStream;
import java.io.IOException;
public class Reading {
    public static void main(String[] args) {
        FileInputStream f = null;
        FileInputStream g = null;
        try{
            f = new FileInputStream("Playlist.java");
            int data;
            while((data = f.read())!=-1){
                System.out.print((char)data);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(f!=null){
                    f.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        try{
            g = new FileInputStream("Stack.java");
            int data;
            while((data = g.read())!=-1){
                System.out.print((char)data);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(g!=null){
                    g.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}