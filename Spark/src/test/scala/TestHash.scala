/**
  * Created by root on 2016/5/18.
  */
object TestHash {

  def main(args: Array[String]) {
    val key = "net.itcast.cn"
    val mod = 3
    val rawMod = key.hashCode % mod
    val partNum = rawMod + (if (rawMod < 0) mod else 0)
    println(partNum)
  }

}
