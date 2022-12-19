package org.ensias.springbootinit.modules;

import org.ensias.springbootinit.modules.Module;
import org.ensias.springbootinit.modules.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

//    private List<Module> modules = new ArrayList<>( Arrays.asList(new Module(1, "Java SE", "la plateforme java Standard Edition"),
//            new Module(2, "Java ME", "La plateforme Java Mobile Edition")));

    public List<Module> getModules(){
        List<Module> modules = new ArrayList<>();
        moduleRepository.findAll().forEach(modules::add);
        return modules;
    }

    public Optional<Module> getModule(Integer id){
        return moduleRepository.findById(id);
    }

    public void postModule(Module module){
        moduleRepository.save(module);
    }

    public void updateModule(Integer id, Module module){
        moduleRepository.save(module);
    }

    public void deleteModule(Integer id){
        moduleRepository.deleteById(id);
    }
}
