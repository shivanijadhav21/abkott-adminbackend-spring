package com.abkottadminbackendspring.controller;

import com.abkottadminbackendspring.model.Languages;
import com.abkottadminbackendspring.model.Video;
import com.abkottadminbackendspring.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("video")
@RestController
public class VideoController {
    @Autowired
    VideoService videoService=new VideoService();

    @PostMapping("/add")
    public Video addVideo(@RequestBody Video video){
        videoService.addVideo(video);
        return video;
    }

    @GetMapping("/get/{videoId}")
    public Video getVideo(@PathVariable long videoId){
        Video video=videoService.getVideo(videoId);
        return video;
    }

    @GetMapping("/")
    public List<Video> getAllVideos(){
        List<Video> videos=videoService.getAllVideo();
        return videos;
    }

    @PostMapping("/update/{videoId}")
    public Video updateVideo(@PathVariable long videoId,@RequestBody Video video){
        video.setVideoId(videoId);
        Video newVideo=videoService.updateVideo(video);
        return newVideo;
    }


    @GetMapping("/delete/{videoId}")
    public void deleteVideo(@PathVariable long videoId){
        videoService.deleteVideo(videoId);
    }


}
