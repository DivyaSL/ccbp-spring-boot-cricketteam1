/*
 * 
 * You can use the following import statements
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * 
 */

package com.example.song.service;

import com.example.song.repository.SongRepository;
import com.example.song.model.Song;
import com.example.song.model.SongRowMapper;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SongH2Service implements SongRepository {

    @Autowired 
    public JdbcTemplate db;

    @Override 
    public ArrayList<Song> getPlayList(){
        List<Song> songList =  db.query("SELECT * FROM playlist", new SongRowMapper());
        ArrayList<Song> songs = new ArrayList<>(songList);
        return songs;
    }
}