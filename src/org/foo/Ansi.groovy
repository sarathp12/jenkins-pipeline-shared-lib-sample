package org.foo
import static Ansi.*

/*
println color("BOLD", Ansi.BOLD)
println color("ITALIC", Ansi.ITALIC)
println color("UNDERLINE", Ansi.UNDERLINE)
println color("BLINK", Ansi.BLINK)
println color("RAPID_BLINK", Ansi.RAPID_BLINK)
println color("REVERSE_VIDEO", Ansi.REVERSE_VIDEO)
println color("INVISIBLE_TEXT", Ansi.INVISIBLE_TEXT)

println color("RED", Ansi.RED)
println color("BLACK", Ansi.BLACK)
println color("BOLD", Ansi.BOLD)
println color("GREEN", Ansi.GREEN)
println color("YELLOW", Ansi.YELLOW)
println color("BLUE", Ansi.BLUE)
println color("MAGENTA", Ansi.MAGENTA)
println color("CYAN", Ansi.CYAN)
println color("WHITE", Ansi.WHITE)
println color("DARK_GRAY", Ansi.DARK_GRAY)
println color("LIGHT_BLUE", Ansi.LIGHT_BLUE)
println color("LIGHT_GREEN", Ansi.LIGHT_GREEN)
println color("LIGHT_CYAN", Ansi.LIGHT_CYAN)
println color("LIGHT_RED", Ansi.LIGHT_RED)
println color("LIGHT_PURPLE", Ansi.LIGHT_PURPLE)
println color("LIGHT_YELLOW", Ansi.LIGHT_YELLOW)

println(
    [
        'Look', Ansi.LIGHT_RED,
        'ma', Ansi.REVERSE_VIDEO,
        ',', Ansi.GREEN,
        'no ', Ansi.MAGENTA,
        'hands!', Ansi.LIGHT_YELLOW
    ]
    .collate(2)
    .collect { pair ->
        color(pair.first(), pair.last())
    }.join(' ')
)
*/

class Ansi {

    static final String NORMAL          = "\u001B[0m"

    static final String	BOLD            = "\u001B[1m"
    static final String	ITALIC	        = "\u001B[3m"
    static final String	UNDERLINE       = "\u001B[4m"
    static final String	BLINK           = "\u001B[5m"
    static final String	RAPID_BLINK	    = "\u001B[6m"
    static final String	REVERSE_VIDEO   = "\u001B[7m"
    static final String	INVISIBLE_TEXT  = "\u001B[8m"

    static final String	BLACK           = "\u001B[30m"
    static final String	RED             = "\u001B[31m"
    static final String	GREEN           = "\u001B[32m"
    static final String	YELLOW          = "\u001B[33m"
    static final String	BLUE            = "\u001B[34m"
    static final String	MAGENTA         = "\u001B[35m"
    static final String	CYAN            = "\u001B[36m"
    static final String	WHITE           = "\u001B[37m"

    static final String	DARK_GRAY       = "\u001B[1;30m"
    static final String	LIGHT_RED       = "\u001B[1;31m"
    static final String	LIGHT_GREEN     = "\u001B[1;32m"
    static final String LIGHT_YELLOW    = "\u001B[1;33m"
    static final String	LIGHT_BLUE      = "\u001B[1;34m"
    static final String	LIGHT_PURPLE    = "\u001B[1;35m"
    static final String	LIGHT_CYAN      = "\u001B[1;36m"

    def colors = [black: 30, red: 31, green: 32, yellow: 33, blue: 34, magenta: 35, cyan: 36, white: 37]

    static String color(String text, String color) {
        //return(ansiValue + text + NORMAL)
        return new String((char) 27) + "[" + colors[color] + 'm' + text + new String((char) 27) + "[0m"

    }

}