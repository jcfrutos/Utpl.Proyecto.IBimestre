package com.ats.ats_api.controller;

import com.ats.ats_api.model.AtsCompra;
import com.ats.ats_api.model.AtsVenta;
import com.ats.ats_api.model.AtsRendimiento;
import com.ats.ats_api.model.AtsAnulado;
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
    public List<AtsCompra> getAllAtsCompras() {
        return atsService.getAllAtsCompras();
    }

    @GetMapping("/ventas")
    public List<AtsVenta> getAllAtsVentas() {
        return atsService.getAllAtsVentas();
    }

    @GetMapping("/rendimientos")
    public List<AtsRendimiento> getAllAtsRendimientos() {
        return atsService.getAllAtsRendimientos();
    }

    @GetMapping("/anulados")
    public List<AtsAnulado> getAllAtsAnulados() {
        return atsService.getAllAtsAnulados();
    }
}