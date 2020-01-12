import React, { Component } from 'react';

import { debounce } from './utils.js';
import './App.css';

const API_URL = "http://localhost:8080";

/**
 * App Component.
 */
export default class App extends Component {
    /**
     * Creates an instance of App.
     * @param {Object} props Component props
     */
    constructor(props) {
        super(props);

        this.state = {
            query: "",
            data: null,
            fetching: false
        };
    }

    /**
     * React lifecycle.
     */
    componentDidMount() {
        const search = new URLSearchParams(window.location.search);
        const query = search.get("q");
        if (query) {
            this.setState({query});
            this.fetchResults(query);
        }
    }

    fetchSQL = debounce((query) => {
        if (query && query !== "") {
            fetch(API_URL + "/sql?q=" + query, {method: "GET"}).then((res) => {
                const contentType = res.headers.get("Content-Type");

                if (contentType && contentType.indexOf("application/json") !== -1) {
                    res.json().then((data) => this.setState({data}));
                } else {
                    console.error("Response is not JSON.");
                }
            });
        }
    }, 250);

    fetchResults(query) {
        this.setState({fetching: true});

        fetch(API_URL + "/query?q=" + query, {method: "GET"}).then(res => {
            const contentType = res.headers.get("Content-Type");
            
            this.setState({fetching: false});

            if (contentType && contentType.indexOf("application/json") !== -1) {
                res.json().then((data) => {
                    this.setState({data});

                    const newURL = window.location.protocol + "//" +
                        window.location.host +
                        window.location.pathname +
                        '?q=' + query;
                    window.history.replaceState({ path: newURL }, '', newURL);
                });
            } else {
                console.error("Response is not JSON.");
            }
        });
    }

    renderSuggestions() {
        const { query, data } = this.state;

        const firstWord = Object.keys(data.suggestions)[0];

        if (!firstWord) {
            return null;
        }

        const suggestions = data.suggestions[firstWord];

        return (
            <div className="suggestions">
                Résultats pour <i>{firstWord}</i>.<br />
                Essayez avec les orthographes suivantes :
                {suggestions.map(suggestion => (
                    <React.Fragment key={suggestion}>
                        &nbsp;
                        <a href={
                            window.location.protocol + "//" +
                            window.location.host +
                            window.location.pathname + '?q=' + 
                            query.replace(firstWord, suggestion)
                        }>
                            {suggestion}
                        </a>
                    </React.Fragment>
                ))}
            </div>
        );
    }

    /**
     * React lifecycle.
     */
    render() {
        const { query, data, fetching } = this.state;

        return (
            <div className="search__wrapper">
                <h1>Recherche BE</h1>
                <div className="search__form">
                    <input 
                        className="search-input" 
                        type="text" 
                        value={query}
                        tabIndex="1"
                        autoComplete="off"  
                        autoCapitalize="off" 
                        autoCorrect="off"
                        onChange={(e) => this.setState({query: e.target.value})}
                        onKeyDown={(e) => this.fetchSQL(e.target.value)}
                    />
                    <button 
                        className={query !== "" ? "search-button active" : "search-button"}
                        tabIndex="2"
                        onClick={() => this.fetchResults(query)}
                    >
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20">
                            <path d="M12.9 14.32a8 8 0 1 1 1.41-1.41l5.35 5.33-1.42 1.42-5.33-5.34zM8 14A6 6 0 1 0 8 2a6 6 0 0 0 0 12z"/>
                        </svg>
                    </button>
                </div>

                {fetching && <div className="search-results-data">Chargement...</div>}

                {data && !fetching && (
                    <div>
                        {data.suggestions && this.renderSuggestions()}

                        <div className="search-results-meta">
                            <div className="mb-1">
                                Requête simplifiée :<br />
                                {data.corrected && <code>{data.corrected}</code>}
                            </div>

                            <div className="mb-1">
                                Requête avant post-traitement :<br />
                                {data.tree && <code>{data.tree}</code>}
                            </div>

                            <div className="mb-1">
                                Requête SQL :<br />
                                {data.sql && <code>{data.sql}</code>}
                            </div>

                            {data.error && (
                                <div>
                                    Erreur :<br />
                                    <code style={{color: "red"}}>{data.error}</code>
                                </div>
                            )}
                        </div>
                        
                        {data.results && data.results.length === 0 && (
                            <div className="search-results-data">
                                Aucun résultat.
                            </div>
                        )}
                        {data.results && data.results.length !== 0 && (
                            <div className="search-results-data">
                                <div className="item header">
                                    {Object.keys(data.results[0]).map(key => (
                                        <span key={key} className="cell">
                                            {key}
                                        </span>
                                    ))}
                                </div>
                                {data.results.map((item, index) => (
                                    <div key={index} className="item">
                                        {Object.keys(item).map(cell => (
                                            cell === "fichier" ? (
                                                <a 
                                                    key={cell} 
                                                    className="cell"
                                                    href={API_URL + "/" + item[cell]}
                                                >
                                                    {item[cell]}
                                                </a>
                                            ) : (
                                                <span key={cell} className="cell">
                                                    {item[cell]}
                                                </span>
                                            )
                                        ))}
                                    </div>
                                ))}
                            </div>
                        )}
                    </div>
                )}
            </div>
        );
    }
}
