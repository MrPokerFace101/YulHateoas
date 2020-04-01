package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.models.Route;
import ru.itis.services.RouteService;

@RepositoryRestController
public class RouteController {

    @Autowired
    private RouteService routeService;

    @RequestMapping(value = "/api/routes/{id}", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity<Route> updateRouteRating(Integer rating, @PathVariable Long id) {
        return ResponseEntity.ok(routeService.updateRouteRating(id, rating));
    }
}
