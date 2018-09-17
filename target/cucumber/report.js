$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DuckDuckNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate the DuckDuckGo website",
  "description": "",
  "id": "navigate-the-duckduckgo-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3613549905,
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
formatter.step({
  "line": 6,
  "name": "I click the Privacy Dropdown Popout",
  "keyword": "And "
});
formatter.match({
  "location": "DuckGo.navigateToDuckDuckGo()"
});
formatter.result({
  "duration": 970210142,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.clickThePrivacyDropdownPopout()"
});
formatter.result({
  "duration": 374935786,
  "status": "passed"
});
formatter.after({
  "duration": 807875468,
  "status": "passed"
});
});