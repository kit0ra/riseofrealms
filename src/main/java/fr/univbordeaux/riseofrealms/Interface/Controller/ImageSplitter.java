package fr.univbordeaux.riseofrealms.Interface.Controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;

public class ImageSplitter {
    public static Image[][] splitImages(Image image, int rows, int cols) {
//        Image resizedImage = resizeImage(image, rows, cols);
        Image[][] dividedImages = new Image[rows][cols];
        PixelReader pixelReader = image.getPixelReader();

        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                WritableImage writableImage = new WritableImage(
                        pixelReader,
                        row * 32,
                        col * 32,
                        32,
                        32
                );
                dividedImages[row][col] = writableImage;
            }
        }

        return dividedImages;
    }

//    private static Image resizeImage(Image image, int width, int height){
//        Canvas canvas = new Canvas(32 * width, 32 * height);
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.drawImage(image, 0, 0, width * 32, height * 32);
//
//        WritableImage resizedImage = new WritableImage(32 * width, 32 * height);
//        canvas.snapshot(null, resizedImage);
//
//        return resizedImage;
//    }
}
