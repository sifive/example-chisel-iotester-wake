package syntax

import chisel3._
import chisel3.experimental._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class NullTester2 extends FreeSpec with ChiselScalatestTester {
  println ("hello world")

  println(System.getProperty("java.version"))
  println(System.getProperty("java.runtime.version"))

  "Basic test in chisel3.iotesters2" in {
    test(new Null) { dut =>
      dut.io.a.poke(2.U)
      dut.io.b.poke(1.U)
      dut.clock.step()
      dut.io.c.expect(3.U)

      dut.io.a.poke(2.U)
      dut.io.b.poke(2.U)
      dut.clock.step()
      dut.io.c.expect(0.U)

      dut.io.a.poke(7.U)
      dut.io.b.poke(5.U)
      dut.clock.step()
      dut.io.c.expect(24.U)
    }
  }
}
