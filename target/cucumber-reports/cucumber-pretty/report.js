$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Seu-Nome-Projeto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Funcionalidade Template",
  "description": "Descrição breve da funcionalidade\r\nEu como \u003coperador\u003e devo ser capaz de fazer algo",
  "id": "funcionalidade-template",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 23323597521,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Cenario Template",
  "description": "",
  "id": "funcionalidade-template;cenario-template",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@CIELO"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Precondicao",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "Acao",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "Validacao",
  "keyword": "Entao "
});
formatter.match({
  "location": "BaseSteps.precondicao()"
});
formatter.result({
  "duration": 46008713447,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.acao()"
});
formatter.result({
  "duration": 26912495493,
  "status": "passed"
});
formatter.match({
  "location": "BaseSteps.validacao()"
});
formatter.result({
  "duration": 2746030769,
  "status": "passed"
});
formatter.after({
  "duration": 1532196183,
  "status": "passed"
});
});