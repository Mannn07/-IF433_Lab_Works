package oop_00000066420_ImanuelGilland.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.4, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -12.7, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 4.8, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 5, 2.3, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 10, -2.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 11.2, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: ${String.format(java.util.Locale.US, "%+.1f", it.roe)}% ROE (Lev: ${it.leverage}x)"
        }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${String.format(java.util.Locale.US, "%+.1f", it.roe)}% ROE (Lev: ${it.leverage}x)"
        }
}
