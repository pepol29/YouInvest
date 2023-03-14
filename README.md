# YouInvest

Uma API para o app de gerenciamento de investimentos financeiros


## Endpoints
-Usuario
  -[Cadastrar](#cadastrar-usuario)
  -[Detalhar-usuario](#detalhar-usuario)
  -
  -
  -
  -

### Cadastrar usuario

`POST`/api/usuario

**Campos de requisição**

| campo | tipo dele| obrigatorio| descrição
|-------| ---------| -----------| ---------
|nome| texto| sim| deve ser o nome completo
|email| texto| sim| deve possuir o @ e ele deve confirmar o email
|saldo| numero decimal| sim| deve ser um valor com até duas casas decimais
|objetivo| numero decimal| sim| deve informar o objetivo financeiro, com até duas casas decimais



**Exemplo de corpo de requisição**
```js
{

    nome: 'Pedro Schezaro Poline',
    email: 'polinesp@gmail.com',
    saldo: 3000.00,
    objetivo: 9000.00;
    


}
```

**Códigos de Resposta**
|código|descrição
|-|-
|201| usuario cadastrado com sucesso
|400| os campos enviados são inválidos


---

### Detalhar Usuario

`GET` / api / usuario/{email}

**Exemplo de corpo de requisição**
```js
{

    nome: 'Pedro Schezaro Poline',
    email: 'polinesp@gmail.com',
    saldo: 3000.00,
    objetivo: 9000.00;
    
}
```

**Códigos de Resposta**
|código|descrição
|-|-
|201| usuario cadastrado com sucesso
|404| usuario não encontrado