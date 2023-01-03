package com.cursojava_final.curso_final.controllers;
import com.cursojava_final.curso_final.Models.Usuario;
import dao.UsuarioDao;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setApellido("Ramirez");
        usuario.setContrasena("nose");
        usuario.setNombre("Ignacio");
        usuario.setEmail("ignacio.uni@gmail.com");
        usuario.setTelefono("12345678");
        usuario.setId(id);
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        Usuario usuario1 = new Usuario();
        usuario1.setApellido("Ramirez");
        usuario1.setContrasena("nose");
        usuario1.setNombre("Ignacio");
        usuario1.setEmail("ignacio.uni@gmail.com");
        usuario1.setTelefono("12345678");
        usuario1.setId(23L);

        Usuario usuario2 = new Usuario();
        usuario2.setApellido("Tota");
        usuario2.setContrasena("nose");
        usuario2.setNombre("Maria");
        usuario2.setEmail("ignacio.uni@gmail.com");
        usuario2.setTelefono("12323278");
        usuario2.setId(45L);

        Usuario usuario3 = new Usuario();
        usuario3.setApellido("sosa");
        usuario3.setContrasena("nose");
        usuario3.setNombre("Jose");
        usuario3.setEmail("ignacio.uni@gmail.com");
        usuario3.setTelefono("1223678");
        usuario3.setId(50L);

        List<Usuario> lista_usuarios = new ArrayList<>();
        lista_usuarios.add(usuario1);
        lista_usuarios.add(usuario2);
        lista_usuarios.add(usuario3);

        return lista_usuarios;
    }

    @RequestMapping(value = "edicion")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setApellido("Ramirez");
        usuario.setContrasena("nose");
        usuario.setNombre("Ignacio");
        usuario.setEmail("ignacio.uni@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }


    @RequestMapping(value = "borrado")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setApellido("Ramirez");
        usuario.setContrasena("nose");
        usuario.setNombre("Ignacio");
        usuario.setEmail("ignacio.uni@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }

    @RequestMapping(value = "busqueda")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setApellido("Ramirez");
        usuario.setContrasena("nose");
        usuario.setNombre("Ignacio");
        usuario.setEmail("ignacio.uni@gmail.com");
        usuario.setTelefono("12345678");
        return usuario;
    }




}
