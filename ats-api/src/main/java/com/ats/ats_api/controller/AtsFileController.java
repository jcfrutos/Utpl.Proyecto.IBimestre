package com.ats.ats_api.controller;

import com.ats.ats_api.service.AtsService;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/ats")
public class AtsFileController {

    @Autowired
    private AtsService atsService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadXmlFile(@RequestParam("file") MultipartFile file) {
        try {
            String month = atsService.processXmlFile(file);
            return ResponseEntity.ok("File processed successfully for month: " + month);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing file: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid file format: " + e.getMessage());
        }
    }
}