package com.escalab;

import com.escalab.model.Usuario;
import com.escalab.repo.IUsuarioRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MediappBackendApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Autowired
	private IUsuarioRepo repo;

	@Test
	public void crearUsuario() {
		Usuario us = new Usuario();
		us.setIdUsuario(0);
		us.setUsername("ingfelipe");
		us.setPassword(bcrypt.encode("123"));
		us.setEnabled(true);

		Usuario retorno = repo.save(us);

		Assert.assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
