package com.devhoss.app.oauth.services;

import com.devhoss.app.oauth.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
