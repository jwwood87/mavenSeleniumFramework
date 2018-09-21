$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DuckDuckNavigation.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate the DuckDuckGo website",
  "description": "",
  "id": "navigate-the-duckduckgo-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3766524653,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Go to the main URL and main elements are displayed",
  "description": "",
  "id": "navigate-the-duckduckgo-website;go-to-the-main-url-and-main-elements-are-displayed",
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
  "name": "I close the Ad Track Popup",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the Duck Duck Logo is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the Privacy Dropdown Popout button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the Social Networking button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the hamburger icon is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DuckGo.navigateToDuckDuckGo()"
});
formatter.result({
  "duration": 1006503536,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.closeTheAdTrackPopup()"
});
formatter.result({
  "duration": 197441935,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.the_Duck_Duck_Logo_is_displayed()"
});
formatter.result({
  "duration": 56556073,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.the_Privacy_Dropdown_Popout_button_is_displayed()"
});
formatter.result({
  "duration": 46486173,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.the_Social_Networking_button_is_displayed()"
});
formatter.result({
  "duration": 27876,
  "status": "passed"
});
formatter.match({
  "location": "DuckGo.the_hamburger_icon_is_displayed()"
});
formatter.result({
  "duration": 38685,
  "status": "passed"
});
formatter.after({
  "duration": 969880755,
  "status": "passed"
});
});