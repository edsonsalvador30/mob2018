package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Autenticar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.VAR_TRUE;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Incio_sist() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Sistema foi iniciado").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Senha() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("senha foi alterada\n").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var grupo_acesso() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.valueOf("Administrators");
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var login() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Autenticado com sucesso").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var logout() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("saindo da aplicacao").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var sessao_criada() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Sessao foi criada").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var sessao_destruida() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Sessao foi finalizada").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
