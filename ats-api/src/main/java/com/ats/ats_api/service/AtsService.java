package com.ats.ats_api.service;

import com.ats.ats_api.repository.AtsCompraRepository;
import com.ats.ats_api.repository.AtsVentaRepository;
import com.ats.ats_api.repository.AtsRendimientoRepository;
import com.ats.ats_api.dtos.AtsAnuladoDto;
import com.ats.ats_api.dtos.AtsCompraDto;
import com.ats.ats_api.dtos.AtsRecapDto;
import com.ats.ats_api.dtos.AtsRendimientoDto;
import com.ats.ats_api.dtos.AtsVentaDto;
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

    public List<AtsCompraDto> getAllAtsCompras() {
        return atsCompraRepository.findAll();
    }

    public List<AtsVentaDto> getAllAtsVentas() {
        return atsVentaRepository.findAll();
    }

    public List<AtsRendimientoDto> getAllAtsRendimientos() {
        return atsRendimientoRepository.findAll();
    }

    public List<AtsAnuladoDto> getAllAtsAnulados() {
        return atsAnuladoRepository.findAll();
    }

    public List<AtsRecapDto> getAllAtsRecaps() {
        return atsRecapRepository.findAll();
    }
}