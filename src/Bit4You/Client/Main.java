package Bit4You.Client;

import Bit4You.Client.Models.Market.Request.MarketHistory;
import Bit4You.Client.Models.Market.Request.MarketOrderBook;
import Bit4You.Client.Models.Market.Request.MarketTicks;
import Bit4You.Client.Models.Orders.Request.*;
import Bit4You.Client.Models.Portfolio.Request.PortfolioCancelOrder;
import Bit4You.Client.Models.Portfolio.Request.PortfolioClosePosition;
import Bit4You.Client.Models.Portfolio.Request.PortfolioCreateOrder;
import Bit4You.Client.Models.Simulations;
import Bit4You.Client.Models.Wallet.Request.WalletFunds;
import Bit4You.Client.Models.Wallet.Request.WalletTransaction;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {

        ClientSettings clientSettings = new ClientSettings();
        clientSettings.setClientId("F2Ogxo11KTBvnDn6DsN3nkHyvuMexyBb");
        clientSettings.setClientSecret("af85bfd876f3f0ccc9652205bb48cbd80b2cf556");
        clientSettings.setAccessTokenUrl("https://auth.bit4you.io/");
        clientSettings.setApiUrl("https://www.bit4you.io");
        clientSettings.setOAuthScopes("openid,profile,portfolio:read,wallets:read,portfolio:write");
        ObjectMapper mapper = new ObjectMapper();

        //Bit Client
        Bit4YouClient bit4YouClient = new Bit4YouClient(clientSettings);


        //Access Token
        var authResult = bit4YouClient.GetAccessToken();
        System.out.println("-----------------Printing Access token object--------------------");
        System.out.println(mapper.writeValueAsString(authResult));

        //User Info
        var info = bit4YouClient.GetUserInfo();
        System.out.println("-----------------Printing User info object--------------------");
        System.out.println(mapper.writeValueAsString(info));

        //Wallet

        //WalletBalance
        var simulation = new Simulations();
        simulation.setSimulation(true);
        var walletBalanceResponses = bit4YouClient.WalletBalance(simulation);
        System.out.println("-----------------Printing Wallet Balance object--------------------");
        System.out.println(mapper.writeValueAsString(walletBalanceResponses));

        //WalletTransaction
        var transaction = new WalletTransaction();
        transaction.setSimulation(true);
        transaction.setIso("BTC");
        var walletTransactionResponse = bit4YouClient.WalletTransaction(transaction);
        System.out.println("-----------------Printing Wallet Transaction object--------------------");
        System.out.println(mapper.writeValueAsString(walletTransactionResponse));

        //Wallet Funds
        var funds = new WalletFunds();
        funds.setIso("BTC");
        funds.setAddress("1CK6KHY6MHgYvmRQ4PAafKYDrg1eaaaaaa");
        funds.setQuantity(1.05);
        System.out.println("-----------------Printing Wallet Funds object--------------------");
        bit4YouClient.WalletWithdrawFunds(funds);

        //Order

        //List
        var orderList = new OrderListRequest();
        orderList.setSimulation(true);
        orderList.setLimit(10);
        orderList.setMarket("USDT-BTC");
        orderList.setPage(0);

        var orderListResponse = bit4YouClient.OrderList(orderList);
        System.out.println("-----------------Printing Order List object--------------------");
        System.out.println(mapper.writeValueAsString(orderListResponse));

        //OrderInfo
        var orderInfo = new OrderInfo();
        orderInfo.setSimulation(true);
        orderInfo.setTxid("db78faa89f08062bfebeacb51365fadb08b63da6");
        var orderInfoResponse = bit4YouClient.OrderInfo(orderInfo);
        System.out.println("-----------------Printing Order Info object--------------------");
        System.out.println(mapper.writeValueAsString(orderInfoResponse));

        //OrderPending
        var pending = new OrderPending();
        pending.setSimulation(true);
        var orderPendingResponse = bit4YouClient.OrderPending(pending);
        System.out.println("-----------------Printing Order Pending object--------------------");
        System.out.println(mapper.writeValueAsString(orderPendingResponse));

        //Create Order
        var order = new OrderCreate();
        order.setMarket("USDT-BTC");
        order.setQuantity(10);
        order.setQuantityIso("BTC");
        order.setRate(1.5);
        order.setType("buy");
        order.setSimulation(true);
        System.out.println("-----------------Printing order create object--------------------");
        var orderCreateResponse=bit4YouClient.OrderCreate(order);
        System.out.println(mapper.writeValueAsString(orderCreateResponse));

        //Cancel order
        var cancelOrder = new OrderCancel();
        cancelOrder.setTxid(orderCreateResponse.getTxid());
        cancelOrder.setSimulation(true);
        var orderCancelResponse = bit4YouClient.OrderCancel(cancelOrder);
        System.out.println("-----------------Printing cancel order  object--------------------");
        System.out.println(mapper.writeValueAsString(orderCancelResponse));

        //Portfolio

        //PortfolioSummary
        var pfSimulation = new Simulations();
        pfSimulation.setSimulation(true);
        var PortfolioListSummaryResponse = bit4YouClient.PortfolioSummary(pfSimulation);
        System.out.println("-----------------Printing Portfolio Summary object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioListSummaryResponse));

        //PortfolioOpenOrder
        var pfOpenOrderSimulation = new Simulations();
        pfOpenOrderSimulation.setSimulation(true);
        var PortfolioOpenOrderResponse = bit4YouClient.PortfolioOpenOrder(pfOpenOrderSimulation);
        System.out.println("-----------------Printing Portfolio Open Order object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioOpenOrderResponse));

        //PortfolioHistory
        var pfHistorySimulation = new Simulations();
        pfHistorySimulation.setSimulation(true);
        var PortfolioHistoryResponse = bit4YouClient.PortfolioHistory(pfHistorySimulation);
        System.out.println("-----------------Printing Portfolio History object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioHistoryResponse));

        //PortfolioCreateOrder
        var Porder = new PortfolioCreateOrder();
        Porder.setMarket("USDT-BTC");
        Porder.setSimulation(true);
        Porder.setSimulation(true);
        Porder.setQuantity(0.55);
        Porder.setRate(355.36);
        var PortfolioCreateOrderResponse = bit4YouClient.PortfolioCreateOrder(Porder);
        System.out.println("-----------------Printing Portfolio Create Order object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioCreateOrderResponse));

        //PortfolioCancelOrder
        var cancelportOrder = new PortfolioCancelOrder();
        cancelportOrder.setSimulation(true);
        cancelportOrder.setId(1);

        var PortfolioCancelOrderResponse = bit4YouClient.PortfolioCancelOrder(cancelportOrder);
        System.out.println("-----------------Printing Portfolio Cancel Order object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioCancelOrderResponse));

        //PortfolioCloseOrder
        var closePort = new PortfolioClosePosition();
        closePort.setId(1);
        closePort.setSimulation(true);
        var PortfolioCloseOrderResponse = bit4YouClient.PortfolioCloseOrder(closePort);
        System.out.println("-----------------Printing Portfolio Close Order object--------------------");
        System.out.println(mapper.writeValueAsString(PortfolioCloseOrderResponse));


        //Market

        //MarketList
        var MarketListResponse = bit4YouClient.MarketList();
        System.out.println("-----------------Printing Market List object--------------------");
        System.out.println(mapper.writeValueAsString(MarketListResponse));

        //MarketSummaries
        var MarketSummariesResponse = bit4YouClient.MarketSummaries();
        System.out.println("-----------------Printing Market Summaries object--------------------");
        System.out.println(mapper.writeValueAsString(MarketSummariesResponse.get(10)));

        //MarketTicks
        var ticks = new MarketTicks();
        ticks.setMarket("USDT-BTC");
        ticks.setInterval(60);
        var MarketTicksResponse = bit4YouClient.MarketTicks(ticks);
        System.out.println("-----------------Printing Market Ticks object--------------------");
        System.out.println(mapper.writeValueAsString(MarketTicksResponse));

        //MarketOrderBooks
        var orderBook = new MarketOrderBook();
        orderBook.setMarket("USDT-BTC");
        orderBook.setLimit(50);
        orderBook.setState(true);
        var MarketOrderBookResponse = bit4YouClient.MarketOrderBook(orderBook);
        System.out.println("-----------------Printing Market Order Books object--------------------");
        System.out.println(mapper.writeValueAsString(MarketOrderBookResponse));

        //MarketHistory
        var mhistory = new MarketHistory();
        mhistory.setMarket("USDT-BTC");
        mhistory.setLimit(50);
        mhistory.setFrom("string");
        mhistory.setTo("string");
        System.out.println("-----------------Printing Market History object--------------------");
        var resp=bit4YouClient.MarketOrderBook(orderBook);
        System.out.println(mapper.writeValueAsString(resp));


    }

}
