package useFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UseFile {

    private File file = null;
    private String filePath = "";
    public UseFile( String filePath ) {
        this.filePath = filePath;
        file = new File(filePath);
    }

    public void createNewFile() {
        try {
            if ( !file.exists() ) {
                file.createNewFile();
            }
        }catch (Exception ex) {
            System.err.println("File Create Error :" + ex);
        }
    }

    public void deleteFile() {
        try {
            if ( file.exists() ) {
                file.delete();
            }
        }catch (Exception ex) {
            System.err.println("File Create Error :" + ex);
        }
    }

    public void addData(String data) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(data);
            fileWriter.append( System.lineSeparator() );
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("addData Error :" + ex);
        }
    }

    public void readLine() {
        try {
            Scanner scanner = new Scanner(file);
            while ( scanner.hasNext() ) {
                String line = scanner.nextLine();
                System.out.println( line );
            }
            scanner.close();
        }catch (Exception ex) {
            System.err.println("readLine Error :" + ex);
        }
    }

    public void newReadFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            FileChannel fileChannel = fileInputStream.getChannel();
            long size = fileChannel.size();
            ByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            CharBuffer charBuffer = StandardCharsets.ISO_8859_1.decode(byteBuffer);
            Scanner scanner = new Scanner(charBuffer.toString());
            while ( scanner.hasNext() ) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            fileChannel.close();
            fileInputStream.close();
        }catch (Exception ex) {
            System.err.println("newReadFile Error :" + ex);
        }
    }


}
