package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val line = br.readLine()
            val sb = StringBuilder()
            for (i in line.indices) {
                if (line.indexOf(line[i]) == i) {
                    sb.append(line[i])
                }
            }
            println(sb.toString())
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}