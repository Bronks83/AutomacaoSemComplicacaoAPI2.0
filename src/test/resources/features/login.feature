#language:pt
@login
Funcionalidade: Realizar Login
  Testes da API de login

  @loginSucesso
  Cenario: Realizar Login com sucesso
    Dado que tenha um payload valido da API de Login
    Quando envio uma requisicao do tipo POST de Login
<<<<<<< HEAD
    Entao valido e recebo status 200 no response
=======
    Entao valido que recebo status 200 no response
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
    E armazeno o token que recebo do response de Login

  @loginInvalido
  Esquema do Cenario: Realizar Login com <cenario>
    Dado que tenha um payload da API de Login com as seguintes informacoes
      | email | <email> |
      | senha | <senha> |
    Quando envio uma requisicao do tipo POST de Login
<<<<<<< HEAD
    Entao valido e recebo status 400 no response

    @loginUsuarioInvalido
    Exemplos:
      | cenario          | email              | senha  |
      | usuario invalido | invalido@email.com | 123456 |
    @loginSenhaInvalida
    Exemplos:
      | cenario        | email           | senha    |
      | senha invalida | aluno@email.com | invalido |
=======
    Entao valido que recebo status 400 no response

    @loginUsuarioInvalido
    Exemplos:
      | cenario          | email              | senha    |
      | usuario invalido | invalido@email.com | 123456   |
    @loginEmailInvalido
    Exemplos:
      | cenario          | email              | senha    |
      | senha invalida   | aluno@email.com    | invalido |
>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
