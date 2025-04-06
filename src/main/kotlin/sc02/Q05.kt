package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val input = br.readLine()
            val chars = input.toCharArray()
            var lp = 0
            var rp = chars.size - 1

            while (lp < rp) {
                when {
                    !Character.isAlphabetic(chars[lp].code) -> {
                        lp++
                    }

                    !Character.isAlphabetic(chars[rp].code) -> {
                        rp--
                    }

                    else -> {
                        // swap
                        val tmp = chars[lp]
                        chars[lp] = chars[rp]
                        chars[rp] = tmp
                        lp++
                        rp--
                    }
                }
            }
            println(String(chars))
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}