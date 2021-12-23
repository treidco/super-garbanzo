import mill._, scalalib._

object core extends ScalaModule {
  def scalaVersion = "2.13.6"

  object test extends Tests with TestModule.ScalaTest {
    def ivyDeps = Agg(ivy"org.scalatest::scalatest:3.2.10")
  }
}
