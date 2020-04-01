package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.models.Place;
import ru.itis.services.PlaceService;

@RepositoryRestController
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping(value = "/api/places/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity<Place> updatePlaceRating(@PathVariable Long id, Integer rating) {
        return ResponseEntity.ok(placeService.updatePlaceRating(id, rating));
    }
}
