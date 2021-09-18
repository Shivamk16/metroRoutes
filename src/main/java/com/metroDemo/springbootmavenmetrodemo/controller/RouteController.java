package com.metroDemo.springbootmavenmetrodemo.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import com.metroDemo.springbootmavenmetrodemo.entity.SourceDestStations;
import com.metroDemo.springbootmavenmetrodemo.service.StationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RouteController {

    private StationService stationService;

    public RouteController(StationService stationService){
        super();
        this.stationService=stationService;
    }

    @GetMapping("/sample")
    public String sample() {
        return "sample";
    }

    @GetMapping("/form")
    public String form(Model model) {
        List<String> stationList = Arrays.asList("Baiyappanhalli Metro Station",
                "Swamy Vivekananda Road Metro Station",
                "Indiranagar Metro Station",
                "Halasuru Metro Station",
                "Trinity Metro Station",
                "MG Road Metro Station",
                "Cubbon Park Metro Station",
                "Vidhana Soudha Metro Station",
                "Sir M. Visveshwarya Station",
                "City Railway Metro Station",
                "Magadi Road Metro Station",
                "Hosahalli Metro Station",
                "Vijaynagar Metro Station",
                "Attiguppe Metro Station",
                "Deepanjali Nagar Metro Station",
                "Mysore Road Metro Station",
                "Silk Institute Metro Station",
                "Thalagattapura Metro Station",
                "Vajarahalli Metro Station",
                "Doddakallasandra Metro Station",
                "Konanakunte Cross Metro Station",
                "Yelachenahalli Metro Station",
                "Jayaprakash Nagar Metro Station",
                "Banashankari Metro Station",
                "Rashtreeya Vidyalaya Road Metro Station",
                "Jayanagar Metro Station",
                "Southend Circle Metro Station",
                "Lalbagh Metro Station",
                "National College Metro Station",
                "Krishna Rajendra Market Metro Station",
                "Chickpete Metro Station",
                "Majestic Metro Station",
                "Sampige Road Metro Station",
                "Srirampura Metro Station"
                );
        model.addAttribute("stationList",stationList);
        model.addAttribute("student",stationService.getAllStations());
        return "form";
    }

    @PostMapping("/data")
    public String data(@ModelAttribute("SourceDestStations")SourceDestStations object) {
        return "data";
    }

}
