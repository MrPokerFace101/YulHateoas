package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.models.Place;
import ru.itis.repositories.PlaceRepository;

import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public Place updatePlaceRating(Long id, Integer rating) {
        Place place = placeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        place.updateRating(rating);
        return placeRepository.updatePlaceRating(place);
    }
}
