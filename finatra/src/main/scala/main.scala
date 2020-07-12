import com.twitter.finagle.Http
import com.twitter.finagle.http.Request
import com.twitter.finagle.stats.NullStatsReceiver
import com.twitter.finagle.tracing.NullTracer
import com.twitter.finatra.http.filters.HttpResponseFilter
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.http.{Controller, HttpServer}

object Main extends FinatraBenchmarkServer

class FinatraBenchmarkServer extends HttpServer {
  override def defaultFinatraHttpPort: String = ":9000"
  override def defaultHttpServerName: String = "0.0.0.0"
  override def configureHttpServer(server: Http.Server) = {
    server
      .withCompressionLevel(0)
      .withStatsReceiver(NullStatsReceiver)
      .withTracer(NullTracer)
  }
  
  override def configureHttp(router: HttpRouter): Unit = {
    router
      .filter[HttpResponseFilter[Request]]
      .add[FinatraBenchmarkController]
  }
}


class FinatraBenchmarkController extends Controller {
  private[this] val helloWorldResponseText = "Hello, World!"

  get("/") { request: Request =>
    "Hello"
  }
}
