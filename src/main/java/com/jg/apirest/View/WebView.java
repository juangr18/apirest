package com.jg.apirest.View;

import com.jg.apirest.Controller.FundacionMascotas;
import com.jg.apirest.Model.Mascota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class WebView {
    private final FundacionMascotas fundacionMascotas;

    public WebView(FundacionMascotas fundacionMascotas) {
        this.fundacionMascotas = fundacionMascotas;
    }

    @GetMapping("/propietario")
    public List<Mascota> getPropietarios(){
        return fundacionMascotas.listDB();
    }
}
