package com.josemar.spotifykeyextractor.service;

import com.josemar.spotifykeyextractor.model.SpotifyTokenVO;
import com.josemar.spotifykeyextractor.webclient.SpotifyWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class KeyServiceImpl implements  KeyService{

    @Autowired
    SpotifyWebClient spotifyWebClient;

    @Override
    public Mono<SpotifyTokenVO> retrieveKey() {
        return spotifyWebClient.retrieveKey();
    }

}
