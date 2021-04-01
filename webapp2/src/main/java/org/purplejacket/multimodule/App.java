package org.purplejacket.multimodule;

import java.io.File;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;

/**
 * Hello world!
 *
 */
public class App 
{

    void writeZipEntry(ZipEntry entry, File destinationDir) {
        File file = new File(destinationDir, entry.getName());
        FileOutputStream fos = new FileOutputStream(file); // BAD
    }
    
    public static void main(String[] args) throws SQLException {

    }

}


