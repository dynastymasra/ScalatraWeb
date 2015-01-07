
import javax.servlet.ServletContext
import com.squarecode.app.ScalatraWebServlet
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new ScalatraWebServlet, "/*")
  }
}
