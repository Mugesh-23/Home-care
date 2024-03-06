package com.elderly.elderly.controller;

import com.elderly.elderly.dto.Servicedto;
import com.elderly.elderly.service.Serviceservice;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/services")
public class Servicecontroller {

    private final Serviceservice serviceservice;

    public Servicecontroller(Serviceservice serviceservice) {
        this.serviceservice = serviceservice;
    }
    @Tag(name="Get Services",description="Get Services endpoint")
    @GetMapping
    public ResponseEntity<List<Servicedto>> getAllServices() {
        List<Servicedto> services = serviceservice.getAllServices();
        return new ResponseEntity<>(services, HttpStatus.OK);
    }
    @Tag(name="Get Services By Name",description="Get Services By Name endpoint")
    @GetMapping("/{name}")
    public ResponseEntity<Servicedto> getServiceByName(@PathVariable String name) {
        Servicedto service = serviceservice.getServiceByName(name);
        if (service != null) {
            return new ResponseEntity<>(service, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @Tag(name="Post Services",description="Post Services endpoint")
    @PostMapping
    public ResponseEntity<Servicedto> createService(@RequestBody Servicedto service) {
        Servicedto createdService = serviceservice.createService(service);
        return new ResponseEntity<>(createdService, HttpStatus.CREATED);
    }
    @Tag(name="Update Services By Name",description="Update Services By Name endpoint")
    @PutMapping("/{name}")
    public ResponseEntity<Servicedto> updateServiceByName(@PathVariable String name, @RequestBody Servicedto updatedService) {
        Servicedto updatedServiceDto = serviceservice.updateServiceByName(name, updatedService);
        if (updatedServiceDto != null) {
            return new ResponseEntity<>(updatedServiceDto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @Tag(name="Delete Services By Name",description="Delete Services By Name endpoint")
    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteServiceByName(@PathVariable String name) {
        serviceservice.deleteServiceByName(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
