package org.ensias.springbootinit.modules;

import org.springframework.data.repository.CrudRepository;

import org.ensias.springbootinit.modules.Module;

public interface ModuleRepository extends CrudRepository<Module, Integer> {
}
