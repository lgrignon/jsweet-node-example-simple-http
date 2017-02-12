/* 
 * Copyright (C) 2015 Louis Grignon <louis.grignon@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package server;

import static def.dom.Globals.console;

import model.Message;

/**
 * Main class, Globals name ensures that the code will run in global context,
 * wrapping class will be erased at runtime.
 * 
 * @author Louis Grignon
 *
 */
class Globals {

	public static void main(String[] args) {

		console.log("running JSweet + Node.JS simple http server example");

		SimpleNodeHttpServer server = new SimpleNodeHttpServer();
		server.run();
	}

}
