package dao;

import com.cursojava_final.curso_final.Models.Usuario;
import dao.UsuarioDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

@Repository //hace referencia a la conexion a la referencia de la tabla de base de datos
@Service
@Transactional //le da la funcionalidad a la clase de poder armar la consultas sql en la base de datos
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
     EntityManager entityManager; //sirve para hacer la conexion con la base de datos

    @Override
    @Transactional
    public List<Usuario> getUsuarios(){
        //con esto hago la consulta a la base de datos
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

}
