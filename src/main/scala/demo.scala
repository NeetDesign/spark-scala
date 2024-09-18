import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{col, dense_rank}

case class Person(name: String)

object demo {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setAppName("demoApp").setMaster("local").set("spark.adaptive.query.enable","true")
    val spark = SparkSession.builder().config(sparkConf).getOrCreate()

    import spark.implicits._

    val df = Seq(Person("A"), Person("B"), Person("C")).toDF()

    val windowSpec = Window.partitionBy("name").orderBy(col("name").desc)

    df.withColumn("rnk", dense_rank().over(windowSpec)).filter(col("name") === "test").select("name").show


  }

}
