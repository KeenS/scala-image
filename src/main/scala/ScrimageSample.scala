import com.sksamuel.scrimage.Image
import com.sksamuel.scrimage.ImageMetadata
import com.sksamuel.scrimage.nio.JpegWriter
import com.sksamuel.scrimage.Position
import com.sksamuel.scrimage.ScaleMethod
import com.sksamuel.scrimage.filter.BlurFilter
import java.io.FileInputStream
import java.io.BufferedInputStream
import java.io.File

object ScrimageSample {
  def main(args: Array[String]):Unit = {
    val in = new FileInputStream(new File("./lena.jpg"))

//    Image.fromStream(in).cover(300, 300, ScaleMethod.FastScale , Position.Center).output("cover.jpg")(JpegWriter())
//    Image.fromStream(in).fit(300, 300).output("fit.jpg")(JpegWriter())
//    Image.fromStream(in).filter(BlurFilter).output("blur.jpg")(JpegWriter())
    in.close()
  }
}
