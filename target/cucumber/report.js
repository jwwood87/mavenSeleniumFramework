$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DuckDuckNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate the DuckDuckGo website",
  "description": "",
  "id": "navigate-the-duckduckgo-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3672721160,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Go to the main URL",
  "description": "",
  "id": "navigate-the-duckduckgo-website;go-to-the-main-url",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to DuckDuckGo",
  "keyword": "Given "
});
formatter.match({
  "location": "DuckGo.navigateToDuckDuckGo()"
});
formatter.result({
  "duration": 951240547,
  "status": "passed"
});
formatter.after({
  "duration": 809263556,
  "status": "passed"
});
});