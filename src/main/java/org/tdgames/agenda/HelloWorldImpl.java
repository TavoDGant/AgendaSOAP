
package org.tdgames.agenda;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tdgames.agenda.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

