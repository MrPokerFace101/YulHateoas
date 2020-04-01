package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.models.Route;
import ru.itis.repositories.RouteRepository;

@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route updateRouteRating(Long id, Integer rating) {
        Route route = routeRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        route.updateRating(rating);
        return routeRepository.updateRouteRating(route);
    }
}
