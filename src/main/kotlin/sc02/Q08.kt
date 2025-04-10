package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class Q08

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            var line = br.readLine().uppercase(Locale.getDefault())
            line = line.replace("[^A-Z]".toRegex(), "")
            for (i in 0..<line.length / 2) {
                if (line[i] != line[line.length - 1 - i]) {
                    println("NO")
                    return
                }
            }
            println("YES")
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}