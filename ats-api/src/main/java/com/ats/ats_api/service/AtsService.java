package com.ats.ats_api.service;

import com.ats.ats_api.model.AtsCompra;
import com.ats.ats_api.model.AtsVenta;
import com.ats.ats_api.model.AtsRendimiento;
import com.ats.ats_api.model.AtsAnulado;
import com.ats.ats_api.model.AtsRecap;
import com.ats.ats_api.repository.AtsCompraRepository;
import com.ats.ats_api.repository.AtsVentaRepository;
import com.ats.ats_api.repository.AtsRendimientoRepository;
import com.ats.ats_api.repository.AtsAnuladoRepository;
import com.ats.ats_api.repository.AtsRecapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Service
public class AtsService {

    @Autowired
    private AtsCompraRepository atsCompraRepository;

    @Autowired
    private AtsVentaRepository atsVentaRepository;

    @Autowired
    private AtsRendimientoRepository atsRendimientoRepository;

    @Autowired
    private AtsAnuladoRepository atsAnuladoRepository;

    @Autowired
    private AtsRecapRepository atsRecapRepository;

    public String processXmlFile(MultipartFile file)
            throws ParserConfigurationException, IOException, TransformerException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.parse(file.getInputStream());
            // Aquí se procesaría el documento XML y se separarían los datos
            // en las diferentes entidades (AtsCompra, AtsVenta, etc.)
            // Ejemplo de cómo guardar los datos:
            // List<AtsCompra> compras = parseCompras(document);
            // atsCompraRepository.saveAll(compras);
            return "Archivo procesado correctamente";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error al procesar el archivo: " + e.getMessage();
        }

    }

    public List<AtsCompra> getAllAtsCompras() {
        return atsCompraRepository.findAll();
    }

    public List<AtsVenta> getAllAtsVentas() {
        return atsVentaRepository.findAll();
    }

    public List<AtsRendimiento> getAllAtsRendimientos() {
        return atsRendimientoRepository.findAll();
    }

    public List<AtsAnulado> getAllAtsAnulados() {
        return atsAnuladoRepository.findAll();
    }

    public List<AtsRecap> getAllAtsRecaps() {
        return atsRecapRepository.findAll();
    }
}