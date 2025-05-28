package com.ats.ats_api.controller;

import com.ats.ats_api.service.AtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ats")
public class AtsController {

    @Autowired
    private AtsService atsService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadXmlFile(@RequestParam("file") MultipartFile file) {
        try {
            atsService.processXmlFile(file);
            return ResponseEntity.status(HttpStatus.OK).body("Archivo XML procesado exitosamente.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar el archivo: " + e.getMessage());
        }
    }
}