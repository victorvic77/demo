const path = require("path");
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const devMode = process.env.NODE_ENV !== "production";

const babelOptions = preset => {
    const options = {
        presets: [
            '@babel/preset-env',

        ],
        plugins: [
            '@babel/plugin-proposal-class-properties'
        ]
    }

    if (preset) {
        options.presets.push(preset)
    }
    return options
};

module.exports = {
    entry: "./src/index.js",
    mode: "development",
    output: {
        filename: "./main.js",
        chunkFilename: "[name].bundle.js"
    },
    devServer: {
        contentBase: path.join(__dirname, "dist"),
        compress: true,
        port: 9000,
        watchContentBase: true,
        progress: true
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "[name].css",
            chunkFilename: "[id].css"
        })
    ],
    module: {
        rules: [
            {
                test: /\.m?js$/,
                exclude: /(node_modules|bower_components)/,
                use: {
                    loader: "babel-loader"
                }
            },
            {
                test: /\.css$/,
                use: [
                    devMode ? "style-loader" : MiniCssExtractPlugin.loader,
                    {
                        loader: "css-loader",
                        options: {
                            modules: true
                        }
                    }
                ]
            },
            {
                test: /\.(png|svg|jpg|gif)$/,
                use: ["file-loader"]
            },
            {
                test: /\.jsx$/,
                exclude: /node_modules/,
                loader: {
                    loader: "babel-loader",
                    options: babelOptions('@babel/preset-react')
                }
            }
        ]

    }
};