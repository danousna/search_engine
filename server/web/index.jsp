<%--
  Created by IntelliJ IDEA.
  User: Natan
  Date: 15/12/2019
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Recherche BE</title>

    <style type="text/css">
      html, body {
        font-size: 100%;
      }

      body {
        width: 100%;
        height: 100vh;
        background: #f7f7f7;
        padding: 0;
        margin: 0;
        font-family: "Helvetica Neue","Helvetica",FreeSans,Arial,sans-serif;
      }

      h1 {
        font-family: "Helvetica Neue","Helvetica",FreeSans,Arial,sans-serif;
        font-size: 40px;
        font-weight: normal;
        text-align: center;
      }

      .btn-link {
        border: 0;
        padding: 0;
        background: none;
        font-size: initial;
        color: blue;
      }

      .btn-link:hover {
        color: darkblue;
        cursor: pointer;
      }

      .search__wrapper {
        padding: 1.3em .8em 1em;
        max-width: 590px;
        margin-left: auto;
        margin-right: auto;
        display: block;
        float: none;
        width: 70%;
      }

      .search__form {
        position: relative;
        padding-left: .75em;
        padding-right: 3.75em;
        border-radius: 4px;
        height: 2.8em;
        background: white;
        border: 1px solid rgba(0,0,0,0.15);
        box-shadow: 0 2px 3px rgba(0,0,0,0.06);
      }

      #search-input {
        display: block;
        width: 100%;
        height: 100%;
        background: none;
        outline: none;
        border: none;
        padding: 0;
        font-size: 1.1em;
        color: #222;
      }

      #search-button {
        position: absolute;
        top: 0;
        bottom: 0;
        right: 0;
        left: auto;
        outline: none;
        border: none;
        border-radius: 0 3px 3px 0;
        min-width: 26px;
        padding: 0 14px;
        height: auto;
      }
      #search-button:hover,
      #search-button.active {
        background: #68AC5B;
        cursor: pointer;
      }
      #search-button svg {
        width: 20px;
        height: 20px;
      }
      #search-button svg path {
        fill: #999;
      }
      #search-button:hover svg path,
      #search-button.active svg path {
        fill: white;
      }

      #search-results {
      }

      #search-results-sql {
        display: block;
        margin-top: 10px;
        font-size: 13px;
      }

      #search-results-data {
        margin-top: 20px;
      }

      #search-results-data .item {
        display: flex;
        width: 100%;
        margin: 10px 0;
      }

      #search-results-data .item.header {
        padding: 5px 0;
        font-weight: bold;
        text-transform: capitalize;
      }

      #search-results-data .cell {
        display: block;
        flex: 1;
      }
    </style>
  </head>
  <body>
    <div class="search__wrapper">
      <h1>Recherche BE</h1>
      <div class="search__form">
        <input id="search-input" type="text" autocomplete="off" name="q" tabindex="1" value="" autocapitalize="off" autocorrect="off" />
        <button id="search-button" tabindex="2">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20">
            <path d="M12.9 14.32a8 8 0 1 1 1.41-1.41l5.35 5.33-1.42 1.42-5.33-5.34zM8 14A6 6 0 1 0 8 2a6 6 0 0 0 0 12z"/>
          </svg>
        </button>
      </div>

      <div id="search-results">
        <div id="search-results-for"></div>
        <code id="search-results-sql"></code>
        <div id="search-results-data">
        </div>
      </div>
    </div>

    <script type="application/javascript">
      function debounce(func, wait, immediate) {
        var timeout;
        return function() {
          var context = this, args = arguments;
          var later = function() {
            timeout = null;
            if (!immediate) func.apply(context, args);
          };
          var callNow = immediate && !timeout;
          clearTimeout(timeout);
          timeout = setTimeout(later, wait);
          if (callNow) func.apply(context, args);
        };
      };

      const searchInput = document.getElementById("search-input");
      const searchButton = document.getElementById("search-button");

      const searchResultsFor = document.getElementById("search-results-for");
      const searchResultsSQL = document.getElementById("search-results-sql");
      const searchResultsData = document.getElementById("search-results-data");

      if (searchInput) {
        searchInput.addEventListener("keydown", debounce(function(e) {
          fetch("/sql?q=" + e.target.value, {method: "GET"}).then(function(response) {
            // Reset HTML
            searchResultsSQL.innerHTML = "";

            const contentType = response.headers.get("Content-Type");
            if (contentType && contentType.indexOf("application/json") !== -1) {
              response.json().then(function(data) {
                if (data.error) {
                  searchResultsSQL.innerHTML = "<span style=\"color: red;\">" + data.error + "</span>";
                } else {
                  if (data.sql) {
                    searchResultsSQL.innerHTML = data.sql;
                  }

                  if (searchInput.value !== "") {
                    searchButton.classList.add("active");
                  } else {
                    searchButton.classList.remove("active");
                  }
                }
              });
            } else {
              console.error("Response is not JSON.");
            }
          }).catch(function(error) {
            console.log(error);
          });
        }, 250));
      }

      if (searchButton) {
        searchButton.addEventListener("click", function () {
          fetch("/query?q=" + searchInput.value, {method: "GET"}).then(function(response) {
            // Reset HTML
            searchResultsSQL.innerHTML = "";
            searchResultsData.innerHTML = "";

            const contentType = response.headers.get("Content-Type");
            if (contentType && contentType.indexOf("application/json") !== -1) {
              response.json().then(function(data) {
                if (data.error) {
                  searchResultsSQL.innerHTML = "<span style=\"color: red;\">" + data.error + "</span>";
                } else {
                  if (data.query) {
                    const newURL = window.location.protocol + "//" +
                            window.location.host +
                            window.location.pathname +
                            '?q=' + data.query;
                    window.history.pushState({ path: newURL }, '', newURL);
                  }

                  if (data.sql) {
                    searchResultsSQL.innerHTML = data.sql;
                  }

                  if (data.suggestions) {
                    // On prend le premier mot qui a une orthographe suggérée.
                    const firstWord = Object.keys(data.suggestions)[0];
                    const suggestions = data.suggestions[firstWord];
                    var html = "Résultats pour <i>" + firstWord + "</i>";
                    html = html + "<br/>Essayez avec les orthographes suivantes :";
                    searchResultsFor.innerHTML = html;

                    // On ne prend pas le premier suggéré il est déjà choisit par défaut.
                    for (var i = 1; i < suggestions.length; i++) {
                      var button = document.createElement("button");
                      button.innerHTML = suggestions[i];
                      button.id = firstWord + "-" + suggestions[i];
                      button.classList.add("btn-link");
                      button.onclick = function(e) {
                        const idArr = e.target.id.split('-');
                        const newURL = window.location.protocol + "//" +
                                window.location.host +
                                window.location.pathname +
                                '?q=' + searchInput.value.replace(/idArr[0]/, idArr[1]);
                        window.location.replace(newURL);
                      };
                      searchResultsFor.appendChild(button);
                    }
                  }

                  if (data.results && data.results.length !== 0) {
                    // Display header
                    const header = Object.keys(data.results[0]);
                    var headerItem = document.createElement("div");
                    headerItem.setAttribute("class", "item header");
                    for (var h = 0; h < header.length; h++) {
                      headerItem.innerHTML += "<span class=\"cell\">" + header[h] + "</span>";
                    }
                    searchResultsData.appendChild(headerItem);

                    // Display data
                    for (var i = 0; i < data.results.length; i++) {
                      var item = document.createElement("div");
                      item.setAttribute("class", "item");

                      const cols = Object.keys(data.results[i]);
                      for (var j = 0; j < cols.length; j++) {
                        item.innerHTML += "<span class=\"cell\">" + data.results[i][cols[j]] + "</span>";
                      }
                      searchResultsData.appendChild(item);
                    }
                  } else {
                    searchResultsData.innerHTML = "Aucun résultat.";
                  }
                }
              });
            } else {
              console.error("Response is not JSON.");
            }
          }).catch(function(error) {
            console.log(error);
          });
        });
      }
    </script>
  </body>
</html>
