package com.abkottadminbackendspring.service;

import com.abkottadminbackendspring.model.Video;
import com.abkottadminbackendspring.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;

    public Video addVideo(Video video){
        Video newVideo=videoRepository.save(video);
        return newVideo;
    }

    public Video getVideo(Long videoId){
        Video video=videoRepository.findById(videoId).orElse(null);
        return video;
    }

    public List<Video> getAllVideo(){
        List<Video> videos=videoRepository.findAll();
        return videos;
    }

    public Video updateVideo(Video video){
        if (video!=null) {
            Video existingVideo = new Video();
            existingVideo.setVideoId(video.getVideoId());
            existingVideo.setVideoTitle(video.getVideoTitle());
            existingVideo.setVideoInformation(video.getVideoInformation());
//            existingVideo.setVideoFile(video.getVideoFile());
            existingVideo.setLanguages(video.getLanguages());
            existingVideo.setGenres(video.getGenres());

            videoRepository.save(existingVideo);
            return existingVideo;
        }
        else {
            return null;
        }
    }

    public void deleteVideo(long videoId){
        videoRepository.deleteById(videoId);
    }



}
