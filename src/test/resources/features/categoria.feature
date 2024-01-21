#language:pt
@categoria
Funcionalidade: Consulta Categoria


  Cenario: Realizar Consulta Categoria com Sucesso
    Dado que tenha relizado o login com dados validos
    E que tenha um payload da API de Categoria
    Quando realizo uma requisicao do tipo GET de Categoria
    Entao valido e recebo status 200 no response
    E valido que no campo "tipo[2]" possui o valor "Terror"

  Cenario: Realizar Consulta Categoria sem o Token
    Quando realizo uma requisicao do tipo GET de Categoria
    Entao valido e recebo status 403 no response
    E valido que no campo "message" possui o valor "Access Denied"

  Cenario: Realizar Consulta Categoria com o Token errado
    Dado que altero o campo "Authorization" para "invalido" do header de categoria
    Quando realizo uma requisicao do tipo GET de Categoria
    Entao valido e recebo status 403 no response
    E valido que no campo "message" possui o valor "Access Denied"