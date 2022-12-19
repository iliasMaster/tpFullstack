package org.ensias.springbootinit.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuleController {

    @Autowired
    private ModuleService  moduleService;

    @RequestMapping("/modules")
    public List<Module> getModules(){
        return moduleService.getModules();
    }


    @RequestMapping("/modules/{id}")
    public Optional<Module> getModule(@PathVariable Integer id){
        return moduleService.getModule(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/modules")
    public void postModule(@RequestBody Module module){
        moduleService.postModule(module);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/modules/{id}")
    public void updateModule(@RequestBody Module module, @PathVariable Integer id){
        moduleService.updateModule(id, module);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void deleteModule(@PathVariable Integer id){
        moduleService.deleteModule(id);
    }
}
