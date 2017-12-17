1) If you don't use @XmlRootElement in Project2.java and run it in browser

http://localhost:8899/rest/project-services2/projects

You will get an error 

HTTP Status 500 - Servlet execution threw an exception

Bcz we are returning java object in the form of XML.

Marshalling -> To make XML from Java Objects.Rest Services uses JAXB.

