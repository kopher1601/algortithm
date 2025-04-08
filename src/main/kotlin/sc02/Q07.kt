package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.util.*

/**
 * gooG
 *
 * YES
 */

fun main() {
    try {
        BufferedReader(System.`in`.reader()).use { reader ->
            val line = reader.readLine().lowercase(Locale.getDefault())
            for (i in 0..line.length / 2) {
                if (line[i] != line[line.length - 1 - i]) {
                    println("NO")
                    return
                }
            }
            println("YES")
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}