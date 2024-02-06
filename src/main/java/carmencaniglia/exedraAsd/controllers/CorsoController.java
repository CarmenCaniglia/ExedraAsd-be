package carmencaniglia.exedraAsd.controllers;

import carmencaniglia.exedraAsd.entities.Corso;
import carmencaniglia.exedraAsd.entities.Utente;
import carmencaniglia.exedraAsd.services.CorsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corsi")
public class CorsoController {

    @Autowired
    private CorsoService corsoService;

    @GetMapping
    public List<Corso> getCorsi(){
        return corsoService.getCorsi();
    }

    @GetMapping("/{id}")
    public Corso getCorsiById(@PathVariable long id){
        return corsoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Corso saveCorso(@RequestBody Corso newCorsoPayload){
        return corsoService.save(newCorsoPayload);
    }

    @PutMapping("/{id}")
    public Corso findByIdAndUpdate(@PathVariable long id,@RequestBody Corso modifiedCorsoPayload){
        return corsoService.findByIdAndUpdate(id, modifiedCorsoPayload);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void findByIdAndDelete(@PathVariable long id){
        corsoService.findByIdAndDelete(id);
    }
}