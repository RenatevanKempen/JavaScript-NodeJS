const path = require("path");
// import path from 'path';
// import webpack from 'webpack';
const webpack = require("webpack");
// import { WDS_PORT } from './src/shared/config';
// const WDS_PORT = require("./src/shared/config");
// import { isProd } from './src/shared/util';
// const isProd = require(" ./src/shared/util");

module.exports = {
  // this is relative path. iw we do not specify default location is:./src/main.js
  entry: {
    main: [
      "@babel/register",
      "@babel/polyfill",
      "@babel/runtime/regenerator",

      "./src/client"
    ]
  },
  mode: "development",
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname, "dist"),
    publicPath: "/"
  },
  devServer: {
    contentBase: "dist",
    overlay: true,
    hot: true,
    stats: { colors: true }
  },

  devtool: "source-map",
  module: {
    rules: [
      {
        test: /\.css$/,
        use: [
          { loader: "style-loader" },
          { loader: "css-loader", options: { sourceMap: true } }
        ]
      },
      {
        test: /\.(js|jsx)$/,
        use: [{ loader: "babel-loader" }],
        include: path.resolve(__dirname, "src"),
        exclude: /node_modules/
      },
      {
        test: /\.s?css$/,
        use: ["style-loader", "css-loader", "postcss-loader", "sass-loader"]
      },
      //   {
      //     test: /\.html$/,
      //     use: [
      //       {
      //         loader: 'html-loader',
      //         options: { attrs: ['img:src', 'link:href'] }
      //       }
      //     ]
      //   },
      {
        test: /\.(jpg|gif|png)$/,
        use: [
          {
            loader: "file-loader",
            options: { name: "images/[name].[ext]" }
          }
        ]
      }
    ]
  },
  plugins: [
    // new webpack.optimize.OccurrenceOrderPlugin(),
    // new webpack.HotModuleReplacementPlugin()
    // new webpack.NamedModulesPlugin()
    // new webpack.NoEmitOnErrorsPlugin()
  ]
};