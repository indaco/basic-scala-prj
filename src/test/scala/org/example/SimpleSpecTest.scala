import org.scalatest.Spec
import org.scalatest.junit.JUnitRunner
import scala.collection.mutable.ListBuffer
import org.junit.runner.RunWith


@RunWith(classOf[JUnitRunner])
class SimpleSpecTest extends Spec {

	// create objects needed by tests and return as a tuple
	def createFixture = (new StringBuilder("ScalaTest is "),new ListBuffer[String])

	it("should get a fresh set of mutable fixture objects") {
		val (builder, lbuf) = createFixture
		builder.append("fun!")
		assert(builder.toString === "ScalaTest is fun!")
		assert(lbuf.isEmpty)
	}
}