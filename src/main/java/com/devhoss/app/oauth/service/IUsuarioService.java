package com.devhoss.app.oauth.service;

import com.devhoss.app.oauth.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
