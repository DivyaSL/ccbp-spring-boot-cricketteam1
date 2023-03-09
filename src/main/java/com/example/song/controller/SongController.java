/*
 * 
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 *
 */

package com.example.song.controller;

import com.example.song.service.SongH2Service;
import com.example.song.model.*;
import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class SongController {

    @Autowired 
    public SongH2Service songService;
 
    @GetMapping("/songs")
    public ArrayList<Song> getPlayList(){
        return songService.getPlayList();
    }

}