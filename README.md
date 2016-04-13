# MyOffers GAE

Essa aplicação faz parte do Backend da aplicação MYOffers.

Foi implementada seguindo o padrão de aplicações RestFul.


## Funcionalidade

* Disponibiliza a api "api/v1/offer/"

** Buscar uma lista de ofertas: [uri = "/", method = GET, produces = "application/json"]

** Buscar uma oferta pelo código do produto: [uri = "/product/{codeProduct}", method = GET, produces = "application/json"]

** Criar um nova oferta: [uri = "/", method = POST, produces = "application/json", consumes = "application/json"]

** Editar um nova oferta: [uri = "/", method = PUT, produces = "application/json", consumes = "application/json"]


