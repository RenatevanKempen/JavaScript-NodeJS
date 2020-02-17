// @flow

require("@babel/register"); // to get es6 import working

import React from "react";
import ReactDOM from "react-dom";
// import { AppContainer } from "react-hot-loader";
import { Provider } from "react-redux";
import { createStore, combineReducers } from "redux";

import App from "./app.jsx";
import helloReducer from "./reducer/hello";
import { APP_CONTAINER_SELECTOR } from "../shared/config";
import { isProd } from "../shared/util";

const store = createStore(
  combineReducers({ hello: helloReducer })
  // eslint-disable-next-line no-underscore-dangle
  // isProd
  //   ? undefined
  //   : window.__REDUX_DEVTOOLS_EXTENSION__ &&
  //       window.__REDUX_DEVTOOLS_EXTENSION__()
);

// const rootEl = document.querySelector(APP_CONTAINER_SELECTOR);

// const wrapApp = (AppComponent, reduxStore) => (
//   <Provider store={reduxStore}>
//     <AppComponent />
//   </Provider>
// );

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.querySelector(APP_CONTAINER_SELECTOR)
);

// if (module.hot) {
//   // flow-disable-next-line
//   module.hot.accept("./app", () => {
//     // eslint-disable-next-line global-require
//     const NextApp = require("./app").default;
//     ReactDOM.render(wrapApp(NextApp, store), rootEl);
//   });
// }
