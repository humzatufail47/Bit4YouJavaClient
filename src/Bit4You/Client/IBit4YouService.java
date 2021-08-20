package Bit4You.Client;

import Bit4You.Client.Models.Market.Request.MarketHistory;
import Bit4You.Client.Models.Market.Request.MarketListResponse;
import Bit4You.Client.Models.Market.Request.MarketOrderBook;
import Bit4You.Client.Models.Market.Request.MarketTicks;
import Bit4You.Client.Models.Market.Response.MarketOrderBookResponse;
import Bit4You.Client.Models.Market.Response.MarketSummrieResponse;
import Bit4You.Client.Models.Market.Response.MarketTicksResponse;
import Bit4You.Client.Models.Orders.Request.*;
import Bit4You.Client.Models.Orders.Response.*;
import Bit4You.Client.Models.Portfolio.Request.PortfolioCancelOrder;
import Bit4You.Client.Models.Portfolio.Request.PortfolioClosePosition;
import Bit4You.Client.Models.Portfolio.Request.PortfolioCreateOrder;
import Bit4You.Client.Models.Portfolio.Response.*;
import Bit4You.Client.Models.Simulations;
import Bit4You.Client.Models.Wallet.Request.WalletFunds;
import Bit4You.Client.Models.Wallet.Request.WalletTransaction;
import Bit4You.Client.Models.Wallet.Response.WalletBalanceResponse;
import Bit4You.Client.Models.Wallet.Response.WalletTransactionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.util.List;

public interface IBit4YouService extends IBaseBit4YouService
{

    //Wallet
    @POST("/api/wallet/balances")
    Call<List<WalletBalanceResponse>> WalletBalance(@Header("Authorization") String authHeader,@Body Simulations simulations);

    @POST("/api/wallet/transactions")
    Call<WalletTransactionResponse> WalletTransaction(@Header("Authorization") String authHeader,@Body WalletTransaction walletTransaction);

    @POST("/api/wallet/send")
    Call<Void> WalletWithdrawFunds(@Header("Authorization") String authHeader, @Body WalletFunds walletFunds);

    //PortFolio
    @POST("/api/portfolio/list")
    Call<PortfolioListResponse> PortfolioSummary(@Header("Authorization") String authHeader,@Body Simulations simulations);

    @POST("/api/portfolio/open-orders")
    Call<List<PortfolioOpenOrderResponse>> PortfolioOpenOrder(@Header("Authorization") String authHeader,@Body Simulations simulations);

    @POST("/api/portfolio/history")
    Call<List<PortfolioHistoryResponse>> PortfolioHistory(@Header("Authorization") String authHeader,@Body Simulations simulations);

    @POST("/api/portfolio/create-order")
    Call<PortfolioCreateResponse> PortfolioCreateOrder(@Header("Authorization") String authHeader,@Body PortfolioCreateOrder portfolioCreateOrder);

    @POST("/api/portfolio/cancel-order")
    Call<PortfolioCancelResponse> PortfolioCancelOrder(@Header("Authorization") String authHeader, @Body PortfolioCancelOrder portfolioCancelOrder);

    @POST("/api/portfolio/close")
    Call<Void> PortfolioCloseOrder(@Header("Authorization") String authHeader,@Body PortfolioClosePosition closePosition);

    //Order
    @POST("/api/order/list")
    Call<List<OrderListResponse>> OrderList(@Header("Authorization") String authHeader,@Body OrderListRequest listRequest);

    @POST("/api/order/info")
    Call<OrderInfoResponse> OrderInfo(@Header("Authorization") String authHeader,@Body OrderInfo orderInfo);

    @POST("/api/order/pending")
    Call<List<OrderPendingResponse>> OrderPending(@Header("Authorization") String authHeader,@Body OrderPending orderPending);

    @POST("/api/order/create")
    Call<OrderCreateResponse> OrderCreate(@Header("Authorization") String authHeader, @Body OrderCreate orderCreate);

    @POST("/api/order/cancel")
    Call<OrderCancelResponse> OrderCancel(@Header("Authorization") String authHeader, @Body OrderCancel orderCancel);


    //Market
    @GET("/api/market/list")
    Call<List<MarketListResponse>> MarketList();
    @GET("/api/market/summaries")
    Call<List<MarketSummrieResponse>> MarketSummaries();

    @POST("/api/market/ticks")
    Call<List<MarketTicksResponse>> MarketTicks(@Body MarketTicks marketTicks);

    @POST("/api/market/orderbook")
    Call<MarketOrderBookResponse> MarketOrderBook(@Body MarketOrderBook marketOrderBook);

    @POST("/api/market/history")
    Call<Void> MarketHistory(@Body MarketHistory marketHistory);

}
