# centralized_swagger_api_static

How to host Swagger documentation using yaml/json configuration files?

Maintain the swagger documentation by Swagger Editor and then you can use the yaml files to generate online swagger documentation easily with Spring boot.
Workflow for Swagger documentation

    Update swagger documentation with Swagger Editor, export the yaml files
    Update the yaml files in Spring boot project
    Redeploy the Spring boot project
    The static yaml file is fetched from Swagger Editor, put it under the resources directory.
                  swagger: "2.0"
          info:
            description: "This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters."
            version: "1.0.0"
            title: "Swagger Petstore"
            termsOfService: "http://swagger.io/terms/"
            contact:
              email: "apiteam@swagger.io"
            license:
              name: "Apache 2.0"
              url: "http://www.apache.org/licenses/LICENSE-2.0.html"
              
              
              
              Run the spring boot server and access <hostname>/swagger-ui.html to see the documentation.
