import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

class DefaultServlet extends ScalatraServlet with ScalateSupport {
  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
}
