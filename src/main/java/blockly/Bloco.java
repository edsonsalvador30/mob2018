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

			private Var item = Var.VAR_NULL;
			private Var x = Var.VAR_NULL;

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

			private Var item = Var.VAR_NULL;
			private Var x = Var.VAR_NULL;

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

	/**
	 *
	 * @param x
	 * @return Var
	 */
	// Descreva esta função...
	public static Var servidor(Var x) throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input1131Campo1"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("vars.input3002Campo2"), cronapi.math.Operations.sum(item, x));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
