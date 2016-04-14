# MyOffers GAE

Essa aplicação faz parte do Backend da aplicação **MYOffers**.
Foi implementada seguindo o padrão de aplicações **Spring MVC** e **RestFul**.


## Funcionalidade

* Disponível através da a api **"api/v1/offer/"**
* Buscar uma lista de ofertas: [**uri** = "/", **method** = GET, **produces** = "application/json"]
* Buscar uma oferta pelo código do produto: [**uri** = "/product/{codeProduct}", **method** = GET, **produces** = "application/json"]
* Criar um nova oferta: [**uri** = "/", **method** = POST, **produces** = "application/json", **consumes** = "application/json"]
* Editar um nova oferta: [**uri** = "/", **method** = PUT, **produces** = "application/json", **consumes** = "application/json"]


## Frameworks

* maven
* appengine
* springframework
* aspectj
* objectify
* hibernate
* jackson
* junit
* mockito
* hamcrest
* guava
* logback

### Versão

1.0.0

## Como usar

Fazer o clone do reposítório git e baixar as dependências
```sh
$ git clone [git-repo-url] myoffers-gae
$ cd myoffers-gae
$ mvn clean install
```
Executar o GAE local
```sh
$ mvn appengine:devserver
```
Fazer upload da app para GAE
```sh
$ mvn appengine:update
```

## Contatos

- **Nome:** Rafael Alessandro Batista de Souza
- **E-mail:** rabsouza@gmail.com

## License

MIT

**Free Source Code, Hell Yeah!**
