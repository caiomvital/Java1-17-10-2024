package controller;

public final class Menu {
	
	private final static String MENU_PRINCIPAL = """
			Opção 1: Consulta de Livros
			Opção 2: Consulta de Categorias
			Opção 3: Administração de Cadastro
			Opção 4: Sair
			""";
	
	public static void exibirMenuPrincipal() {
		System.out.println(MENU_PRINCIPAL);
	}
	
	private final static String MENU_LIVROS = """
			1. Consultar Livros por Título
			2. Consultar Livros por Autor
			3. Listar Livros por Categoria
			4. Localizar Livro por ISBN
			5. Voltar para o menu anterior
			""";
	
	public static void exibirMenuLivros() {
		System.out.println(MENU_LIVROS);
	}
	
	private final static String MENU_CADASTRO_LIVROS = 
			"""
			Opção 1. Cadastrar Livro
			Opção 2. Listar Livros
			Opção 3. Atualizar Livro
			Opção 4. Remover Livro
			Opção 5. Voltar ao menu anterior
			"""
			;
	
	public static void exibirMenuCadastroLivros() {
		System.out.println(MENU_CADASTRO_LIVROS);
	}
	
	private final static String MENU_CADASTRO_CATEGORIAS = """
			Opção 1. Cadastrar Categoria
			Opção 2. Listar Categorias
			Opção 3. Atualizar Categoria
			Opção 4. Remover Categoria
			Opção 5. Voltar ao menu anterior
			""";
	
	public static void exibirMenuCadastroCategorias() {
		System.out.println(MENU_CADASTRO_CATEGORIAS);
		
	}

}
