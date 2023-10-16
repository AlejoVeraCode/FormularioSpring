package ejemploformulario.formulario.controles;

import ejemploformulario.formulario.dominio.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class indexControlador {

    @GetMapping({"/","/index"})
    public String index (Model model){
        model.addAttribute("titulo", "formularioUsuarios");
        return "index";
    }

    @PostMapping ("/index")

    public String proceso (Usuario usuario, Model model){

        model.addAttribute("titulo", "resultadoFormulario");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
