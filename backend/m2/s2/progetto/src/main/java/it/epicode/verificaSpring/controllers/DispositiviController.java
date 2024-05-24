package it.epicode.verificaSpring.controllers;
import it.epicode.verificaSpring.controllers.records.DispositiviRequest;
import it.epicode.verificaSpring.entities.Dispositivi;
import it.epicode.verificaSpring.services.DispositiviService;
import it.epicode.verificaSpring.services.exceptions.BadRequestException;
import it.epicode.verificaSpring.services.exceptions.DispositivoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispositivi")
public class DispositiviController {

    @Autowired
    private DispositiviService dispositivi;

    @PostMapping
    public ResponseEntity<Dispositivi> saveDispositivi(@Validated @RequestBody DispositiviRequest request, BindingResult validator){
        if(validator.hasErrors()){
            throw new BadRequestException(validator.getAllErrors());
        }
        Dispositivi salva = dispositivi.save(request);
        return ResponseEntity.ok(salva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dispositivi> updateDispositivi(@PathVariable Long id, @Validated @RequestBody DispositiviRequest request, BindingResult validator){
        if(validator.hasErrors()){
            throw new DispositivoNotFoundException(validator.getAllErrors());
        }
        Dispositivi update = dispositivi.update(id,request);
        return ResponseEntity.ok(update);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dispositivi> getDispositiviById(@PathVariable Long id){
        Dispositivi dispositivi1 = dispositivi.findById(id);
        if(dispositivi1 != null){
            return ResponseEntity.ok(dispositivi1);
        }else{
            return ResponseEntity.notFound().build();
        }


    }

    @GetMapping
    public ResponseEntity<List<Dispositivi>>getAllDispositivo(){
        List<Dispositivi> dipendentis = dispositivi.getAll();
        return ResponseEntity.ok(dipendentis);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void>deleteDispositivoById(@PathVariable Long id){
        dispositivi.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{idDipendente}/{idDispositivo}")
    public ResponseEntity<Dispositivi>aggiungiDipendente(@PathVariable Long idDipendente, @PathVariable Long idDispositivo){
        try {
            Dispositivi dispositivo = dispositivi.assegnaDispositivo(idDipendente, idDispositivo);
            return ResponseEntity.ok(dispositivo);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

}
