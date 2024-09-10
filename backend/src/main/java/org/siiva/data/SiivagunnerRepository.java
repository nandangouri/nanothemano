package org.siiva.data;

import org.siiva.Model.Siivagunner;

import java.util.List;

public interface SiivagunnerRepository {
    public boolean setCurrent(int song);

    public String updateNew(String video_id, List<Siivagunner> songs);

    public Siivagunner add(Siivagunner siivagunner);

    public Siivagunner getById(int songId);

    public Siivagunner getByVideoId(String videoId);

    public boolean update(Siivagunner siivagunner);

    public boolean updateListened(int song, boolean listened);

    public boolean updateWorth(int song, boolean listened);


    public List<Siivagunner> getAll();

    public Siivagunner getNext();

    public Siivagunner getPrevious();
}
