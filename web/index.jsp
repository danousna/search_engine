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
    <title>Goolo17</title>

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
        padding-right: 6.5em;
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
      #search-button:hover {
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
      #search-button:hover svg path {
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
        margin: 10px 0;
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

      <div id="search-results" style="display: none">
        <code id="search-results-sql"></code>
        <div id="search-results-data">
        </div>
      </div>
    </div>

    <script type="application/javascript">
      const searchInput = document.getElementById("search-input");
      const searchButton = document.getElementById("search-button");

      const searchResults = document.getElementById("search-results");
      const searchResultsSQL = document.getElementById("search-results-sql");
      const searchResultsData = document.getElementById("search-results-data");

      if (searchInput) {
        searchInput.addEventListener("change", function (e) {
          //TODO: autocomplete, debounce
        });
      }

      if (searchButton) {
        searchButton.addEventListener("click", function () {
          fetch("/query?q=" + searchInput.value, {method: "GET"}).then(function(response) {
            const contentType = response.headers.get("Content-Type");
            if (contentType && contentType.indexOf("application/json") !== -1) {
              response.json().then(function(data) {
                console.log(data);

                searchResults.style.display = "block";

                if (data.sql) {
                  searchResultsSQL.innerHTML = data.sql;
                }
                if (data.results) {
                  for (var i = 0; i < data.results.length; i++) {
                    var item = document.createElement("div");
                    item.setAttribute("class", "item");
                    if (data.results[i].fichier) {
                      item.append(data.results[i].fichier);
                    }
                    searchResultsData.appendChild(item);
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
