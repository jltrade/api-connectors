BitMEX API Connectors
=====================

A few simple connectors for connecting to the BitMEX API, which conforms to the
[Swagger](https://github.com/wordnik/swagger-spec/blob/master/versions/1.2.md) spec.

Connectors in the `clients` and `servers` directories are autogenerated. Connectors in the `experimental` directory
are written by BitMEX employees to showcase various features.

See the `swagger.*` file in the root directory or src directory of each client to start.

Official Examples
-----------------

* [Client-side JS](/official/client-js)
* [C#](/official/csharp)
* [mIRC](/official/mirc)
* [Node-Request](/official/node-request)
* [Node-Swagger](/official/node-swagger)
* [Node-WS (Websockets)](/official/node-ws)
* [Python-SwaggerPy](/official/python-swaggerpy)
* [VBA](/official/vba)

Auto-Generated Languages
------------------------

Clients:

* [C#](/clients/csharp)
* [Groovy](/clients/groovy)
* [Java (Android)](/clients/java/android)
* [Java (Jersey)](/clients/java/jersey)
* [Objective C](/clients/objc)
* [PHP](/clients/php)
* [Python 2](/clients/python)
* [Python 3](/clients/python3)
* [Ruby](/clients/ruby)
* [Scala](/clients/scala)

REST Server Examples:

* [Java (JAX-RS)](/servers/jax-rs)
* [Javascript (Node/Express)](/servers/node)
* [Ruby (Sinatra)](/servers/sinatra)
* [Scala (Scalatra)](/servers/scalatra)

WebSocket Adapters
------------------

The easiest way to get real-time data from BitMEX is via the
[BitMEX Delta Server](https://github.com/BitMEX/websocket-adapters/tree/master/server), a locally-runnable
HTTP server that subscribes to live data on your behalf. You can poll this local server as often as you want.

Other [WebSocket Adapters](https://github.com/BitMEX/websocket-adapters) are available in a separate repo.

