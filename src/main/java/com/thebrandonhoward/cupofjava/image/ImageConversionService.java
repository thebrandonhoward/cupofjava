package com.thebrandonhoward.cupofjava.image;

import java.awt.image.BufferedImage;

import java.io.*;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

public class ImageConversionService {
    public static void main(String[] args) throws IOException {
        final String FILE_PATH = "src/main/java/com/thebrandonhoward/cupofjava/image/";
        final String FILE_NAME = "BlushedEmojis.png";

        File myFile = new File(Paths.get(FILE_PATH + FILE_NAME).toString());

        System.out.println("File Converted: " + convertToWebp(myFile));
    }

    public static boolean convertToWebp(File imageData) throws IOException {
        BufferedImage img = ImageIO.read(imageData);

        File file = new File("src/main/java/com/thebrandonhoward/cupofjava/image/BlushedEmojis.webp");

        return ImageIO.write(img, "webp", file);
    }
}