package TP_9.Ejercicio8;

import TP_9.Ejercicio8.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class PlaylistPatrocinada extends Playlist{
    private Video v;

    public PlaylistPatrocinada(String titulo, int demora, Video v) {
        super(titulo, demora);
        this.v = v;
    }

    @Override
    public List<Video> buscarVideos(Condicion c) {
        List<Video>videos=new ArrayList<>();
        videos.add(v);
        videos.addAll(super.buscarVideos(c));
        return videos;
    }
}
