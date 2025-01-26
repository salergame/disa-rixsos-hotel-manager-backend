package com.example.disa_rixos_backend.controller;

import com.example.disa_rixos_backend.model.Room;
import com.example.disa_rixos_backend.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping
    public List<Room> getRooms() {
        return roomRepository.findAll();
    }
}
