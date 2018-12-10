package sample;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * 
 * @author ernesto
 *
 */
public class controlador {

    @FXML
    private MediaView mediaView;

    public void initialize() {

        Media media1= new Media(getClass().getResource("media/nutrias.mp4").toExternalForm());
        MediaPlayer player=new MediaPlayer(media1);
        mediaView.setMediaPlayer(player);
        player.setVolume(0.5);
        player.play();

    }
}
