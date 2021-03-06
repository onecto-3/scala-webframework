import akka.actor.ActorSystem
import colossus.core.{IOSystem, InitContext, ServerContext}
import colossus.protocols.http.Http
import colossus.protocols.http.HttpMethod._
import colossus.protocols.http.UrlParsing._
import colossus.protocols.http.{HttpServer, Initializer, RequestHandler}
import colossus.service.Callback
import colossus.service.GenRequestHandler.PartialHandler

object HelloWorld2 extends App {

    implicit val actorSystem = ActorSystem()
    implicit val ioSystem    = IOSystem()

    HttpServer.start("hello-world", 9000) { context =>
      new HelloInitializer(context)
    }

}

class HelloInitializer(context: InitContext) extends Initializer(context) {

    override def onConnect: RequestHandlerFactory = context => new HelloRequestHandler(context)

}

class HelloRequestHandler(context: ServerContext) extends RequestHandler(context) {

    override def handle: PartialHandler[Http] = {
          case request @ Get on Root => {
                  Callback.successful(request.ok("Hello World!"))
          }
    }

}
