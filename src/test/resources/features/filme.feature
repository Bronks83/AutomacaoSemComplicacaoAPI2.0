#language: pt
@filme
Funcionalidade: CRUD Filme

  Contexto:
    Dado que tenha relizado o login com dados validos
    E que tenha um payload valido da API de Filme

  @cadastroFilme
  Cenario: Cadastro Filme
    Quando envio uma requisicao do tipo POST de Filme
    Entao valido e recebo status 201 no response
    E valido que no campo "categorias.tipo[1]" possui o valor "Comedia"
    E armazeno o id que recebo do response de Filme

  Cenario: Consulta Filme
    Quando realizo uma requisicao do tipo GET de Filme atraves do nome
    Entao valido e recebo status 200 no response
    E valido que no campo "categorias[0].tipo[1]" possui o valor "Comedia"

  Cenario: Alteracao Filme
    E altero o indice 1 da lista de categorias do filme com os valores
      | tipo | Terror |
    Quando realizo uma requisicao do tipo PUT de filme
    Entao valido e recebo status 200 no response
    E valido que no campo "categorias.tipo[1]" possui o valor "Terror"

  Cenario: Consulta Filme Apos Alteracao
    Quando realizo uma requisicao do tipo GET de Filme atraves do nome
    Entao valido e recebo status 200 no response
    E valido que no campo "categorias[0].tipo[1]" possui o valor "Terror"

  Cenario: Exclusao Filme
    Quando realizo uma requisicao do tipo DELETE de Filme
    Entao valido e recebo status 200 no response

  Cenario: Consulta Filme Apos Exclusao
    Quando realizo uma requisicao do tipo GET de Filme atraves do nome
    Entao valido e recebo status 200 no response
    E valido que recebo uma lista vazia no response




