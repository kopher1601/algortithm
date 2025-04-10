package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

const val NUMERIC_START = 48.toChar()
const val NUMERIC_END = 57.toChar()

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val chars = br.readLine().toCharArray()
            val sb = StringBuilder()
            for (i in 0..<chars.size - 1) {
                if (chars[i] in NUMERIC_START..NUMERIC_END) {
                    sb.append(chars[i])
                }
            }
            println(sb.toString().toInt())
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}