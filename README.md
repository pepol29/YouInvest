# YouInvest

Uma API para o app de gerenciamento de investimentos financeiros


## Endpoints
-Usuario
  -[Cadastrar](#cadastrar-usuario)
  -[Detalhar_usuario](#detalhar-usuario)
-Investimento
  -[Registrar](#salvar-investimento)
  -[Detalhar_Investimento](#detalhar-investimento)
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

### Salvar Investimento

`POST`/api/investimento

**Campos de requisição**

| campo | tipo dele| obrigatorio| descrição
|-------| ---------| -----------| ---------
|idInvestimento| numero inteiro| sim| deve informar o numero de identificação do investimento
|titulo| texto| sim| deve ser o nome do titulo, como CDB,LCA,LCI
|tipoTaxa| texto| sim| deve conter o tipo de taxa que é aplicada sobre o titulo
|juros| numero decimal| sim| deve ser um valor com até duas casas decimais
|diasSaque| numero inteiro| sim| deve informar a quantidade de dias a se esperar para sacar
|anos| numero inteiro| sim| deve informar quantos anos o dinheiro vai ficar aplicado
|sobPercentual| boolean| sim| deve informar se os juros são ou não aplicados sobre a taxa 
|quantidade| numero inteiro| sim| deve informar a quantidade de investimentos



**Exemplo de corpo de requisição**
```js
{
    idInvestimento:181183
    titulos:'CDB',
    tipoTaxa:'IPCA',
    juros: 1.1,
    Dias:30,
    anos:7,
    sobPercentual: true,
    quantidade: 0;
    
}
```

**Códigos de Resposta**
|código|descrição
|-|-
|201| investimento salvo com sucesso
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

### Detalhar Investimento

`GET` / api / usuario/{idInvestimento}

**Exemplo de corpo de requisição**
```js
{

    idInvestimento:181183
    titulos:'CDB',
    tipoTaxa:'IPCA',
    juros: 1.1,
    Dias:30,
    anos:7,
    sobPercentual: true,
    quantidade: 0;
    
}
```

**Códigos de Resposta**
|código|descrição
|-|-
|201| Investimento encontrado com sucesso
|404| Investimento não encontrado