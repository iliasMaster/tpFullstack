package org.ensias.springbootinit.cours;

import org.springframework.data.repository.CrudRepository;
import org.ensias.springbootinit.cours.Cours;

import java.util.List;

public interface CoursRepository extends CrudRepository<Cours,Integer> {

    public List<Cours> findByModuleId(Integer moduleId);
}
