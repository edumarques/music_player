/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tharles
 */
public class Repository {
    public void write(String path, ArrayList<String> list, boolean append) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter f = new FileWriter(file, append);
        BufferedWriter b = new BufferedWriter(f);
        for (String s : list) {
            b.write(s);
            b.newLine();
        }
        b.close();
        f.close();
    }

    public ArrayList<String> read(String path) throws IOException {
        File file = new File(path);
        ArrayList<String> r = new ArrayList<String>();
        if (file.exists()) {
            FileReader f = new FileReader(file);
            BufferedReader b = new BufferedReader(f);
            while (b.ready()) {
                r.add(b.readLine());
            }
            b.close();
            f.close();
        } else {
            file.createNewFile();
        }

        return r;
    }
    public ArrayList<File> listFiles (String path) {
        File folder = new File(path);
        ArrayList<File> files = new ArrayList<File>();
        if (folder.exists()) {
            File[] a = folder.listFiles();
            for (File f : a)
                files.add(f);
        } else {
            folder.mkdir();
        }
        return files;
    }
}
