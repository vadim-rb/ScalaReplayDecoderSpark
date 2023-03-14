import control.BinRepParser
import java.io.{File, PrintWriter}
import model.Action

object Main {
  def main(args: Array[String]): Unit = {
    val replayName = "C:\\Users\\VPPopov\\IdeaProjects\\ScalaReplayDecoder\\replays\\BW\\ProtosRush-1.rep"
    val replay = BinRepParser.parseReplay(new File(replayName), true, false, true, true)
    val outFile: PrintWriter = new PrintWriter(System.out, true)
    //replay.replayHeader.printHeaderInformation(outFile)
    //println(replay.replayHeader.playerNames.mkString("Array(", ", ", ")"))
    println(replay.replayActions.players.mkString("Array(", ", ", ")"))
    for (player <- replay.replayActions.players) {
      println(player.playerName)
      //p.iteration кол-во фреймов - 1 фрейм 42 ms

      for (p <- player.actions) {
        println(s"$p --->Iteration ${p.iteration}," +
          s" ActionNameIndex ${Action.ACTION_ID_NAME_MAP.get(p.actionNameIndex)} ," +
          s" ${p.parameterBuildingNameIndex} ${p.posX} ${p.posY} "+
          s"Parameters ${p.parameters}"
        )
      }
    }
  }
}