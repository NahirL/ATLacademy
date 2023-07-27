package academy.atl.newsletters.controllers;

import academy.atl.newsletters.models.Lead;
import academy.atl.newsletters.repository.EmailRepository;
import academy.atl.newsletters.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
public class NewslettersController {

    @Autowired
    EmailRepository emailRepository;

    @PostMapping("/registeremail")
    public String register(@RequestBody Lead lead){

        String email = lead.getEmail();

        if(!EmailValidator.isValidEmail(email)){
            return "El email no es válido";
        }
        emailRepository.saveEmail(email);

        return "Email guardado: "+email;

    }

    @DeleteMapping("/unsuscribe")
    public String unsuscribe(@RequestBody Lead lead){

        String email = lead.getEmail();
        emailRepository.deleteEmail(email);

        return "Email eliminado: "+email;

    }

    @GetMapping("/getemails")
    public List<String> getEmailList(){

        return emailRepository.getEmails();
    }

}

