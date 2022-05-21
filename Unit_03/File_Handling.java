package Unit_03;

import java.io.*;
import java.util.*;

public class File_Handling {
    public static void main(String[] args) throws IOException {
        File f = new File(
                "C:\\Users\\ranvir singh rawat\\Dropbox\\My PC (LAPTOP-HJKRRIC2)\\Documents\\Java_4rthSem\\Unit_03\\abc.txt");
        if (f.createNewFile()) {
            System.out.println(f.getName());
        }
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(
                    "C:\\Users\\ranvir singh rawat\\Dropbox\\My PC (LAPTOP-HJKRRIC2)\\Documents\\Java_4rthSem\\Unit_03\\abc.txt"));
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an string :");
            s = sc.nextLine();
            br.write(s);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fr = new FileReader(
                "C:\\Users\\ranvir singh rawat\\Dropbox\\My PC (LAPTOP-HJKRRIC2)\\Documents\\Java_4rthSem\\Unit_03\\abc.txt");

        BufferedReader bb = new BufferedReader(fr);
        String r;
        while ((r = bb.readLine()) != null) {
            System.out.print(r);
        }

    }
}
