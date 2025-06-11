package com.ats.ats_api.controller;

import com.ats.ats_api.dtos.AtsAnuladoDto;
import com.ats.ats_api.dtos.AtsCompraDto;
import com.ats.ats_api.dtos.AtsRendimientoDto;
import com.ats.ats_api.dtos.AtsVentaDto;
import com.ats.ats_api.service.AtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/ats")
public class AtsDataController {

    @Autowired
    private AtsService atsService;

    @GetMapping("/compras")
    public List<AtsCompraDto> getAllAtsCompras() {
        return atsService.getAllAtsCompras();
    }

    @GetMapping("/ventas")
    public List<AtsVentaDto> getAllAtsVentas() {
        return atsService.getAllAtsVentas();
    }

    @GetMapping("/rendimientos")
    public List<AtsRendimientoDto> getAllAtsRendimientos() {
        return atsService.getAllAtsRendimientos();
    }

    @GetMapping("/anulados")
    public List<AtsAnuladoDto> getAllAtsAnulados() {
        return atsService.getAllAtsAnulados();
    }
}