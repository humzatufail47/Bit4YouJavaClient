package Bit4You.Client;

import Bit4You.Client.Models.Market.Request.MarketHistory;
import Bit4You.Client.Models.Market.Request.MarketListResponse;
import Bit4You.Client.Models.Market.Request.MarketOrderBook;
import Bit4You.Client.Models.Market.Request.MarketTicks;
import Bit4You.Client.Models.Market.Response.MarketOrderBookResponse;
import Bit4You.Client.Models.Market.Response.MarketSummrie;
import Bit4You.Client.Models.Market.Response.MarketTicksResponse;
import Bit4You.Client.Models.OAuthRequest;
import Bit4You.Client.Models.OAuthResult;
import Bit4You.Client.Models.Orders.Request.*;
import Bit4You.Client.Models.Orders.Response.CancelOrderResponse;
import Bit4You.Client.Models.Orders.Response.OrderInfoResponse;
import Bit4You.Client.Models.Orders.Response.OrderListResponse;
import Bit4You.Client.Models.Orders.Response.OrderPendingResponse;
import Bit4You.Client.Models.Portfolio.Request.CancelPortfolioOrder;
import Bit4You.Client.Models.Portfolio.Request.ClosePortfolioPosition;
import Bit4You.Client.Models.Portfolio.Request.PortfolioCreateOrder;
import Bit4You.Client.Models.Portfolio.Response.*;
import Bit4You.Client.Models.Simulations;
import Bit4You.Client.Models.UserInfo;
import Bit4You.Client.Models.Wallet.Request.WalletFunds;
import Bit4You.Client.Models.Wallet.Request.WalletTransaction;
import Bit4You.Client.Models.Wallet.Response.WalletBalanceResponse;
import Bit4You.Client.Models.Wallet.Response.WalletTransactionResponse;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bit4YouClient {

    private ClientSettings clientSettings;
    private OAuthRequest oAuthRequest;
    private IBaseBit4YouService baseBit4YouService;
    private IBit4YouService bit4YouService;
    private Cache<String, OAuthResult> cache = Caffeine.newBuilder()
            .maximumSize(10)
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .build();

    public Bit4YouClient(ClientSettings clientSettings) {
        this.clientSettings = clientSettings;
        oAuthRequest = new OAuthRequest();
        oAuthRequest.setScope(clientSettings.getOAuthScopes());
        oAuthRequest.setUserName(clientSettings.getClientId());
        oAuthRequest.setPassword(clientSettings.getClientSecret());
        oAuthRequest.setGrantType("password");
        baseBit4YouService = GetBaseBit64YouService();
        bit4YouService = GetBit64YouService();
    }

    public OAuthResult GetAccessToken() {

        var token = cache.getIfPresent(clientSettings.getClientSecret());
        if (token != null) {
            return token;
        }
        try {
            Response<OAuthResult> oAuthResultResponse = baseBit4YouService.getAccessToken(oAuthRequest).execute();
            if (oAuthResultResponse.isSuccessful()) {
                cache.put(clientSettings.getClientSecret(), oAuthResultResponse.body());
                return oAuthResultResponse.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserInfo GetUserInfo() {
        var token = GetAccessToken();
        try {
            Response<UserInfo> oAuthResultResponse = baseBit4YouService.getUserInfo("Bearer " + token.getAccessToken()).execute();
            if (oAuthResultResponse.isSuccessful()) {
                return oAuthResultResponse.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<WalletBalanceResponse> WalletBalance(Simulations simulations) {
        var token = GetAccessToken();
        try {
            Response<List<WalletBalanceResponse>> result = bit4YouService.WalletBalance("Bearer " + token.getAccessToken(), simulations).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public WalletTransactionResponse WalletTransaction(WalletTransaction walletTransaction) {
        var token = GetAccessToken();
        try {
            Response<WalletTransactionResponse> result = bit4YouService.WalletTransaction("Bearer " + token.getAccessToken(), walletTransaction).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void WalletWithdrawFunds(WalletFunds walletFunds) {
        var token = GetAccessToken();
        try {
            Response<Void> result = bit4YouService.WalletWithdrawFunds("Bearer " + token.getAccessToken(), walletFunds).execute();
            if (result.isSuccessful()) {
                //Throw 401
            }
            System.out.println("Need to Look at it: WalletWithdrawFunds");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<OrderListResponse> OrderList(OrderListRequest listRequest) {
        var token = GetAccessToken();
        try {
            Response<List<OrderListResponse>> result = bit4YouService.OrderList("Bearer " + token.getAccessToken(), listRequest).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public OrderInfoResponse OrderInfo(OrderInfo orderInfo) {
        var token = GetAccessToken();
        try {
            Response<OrderInfoResponse> result = bit4YouService.OrderInfo("Bearer " + token.getAccessToken(), orderInfo).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<OrderPendingResponse> OrderPending(OrderPending orderPending) {
        var token = GetAccessToken();
        try {
            Response<List<OrderPendingResponse>> result = bit4YouService.OrderPending("Bearer " + token.getAccessToken(), orderPending).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void OrderCreate(CreateOrder createOrder) {
        var token = GetAccessToken();
        try {
            Response<Void> result = bit4YouService.OrderCreate("Bearer " + token.getAccessToken(), createOrder).execute();
            if (result.isSuccessful()) {
            }
            System.out.println("Need to Look at it: OrderCreate");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public CancelOrderResponse OrderCancel(CancelOrder cancelOrder) {
        var token = GetAccessToken();
        try {
            Response<CancelOrderResponse> result = bit4YouService.OrderCancel("Bearer " + token.getAccessToken(), cancelOrder).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public PortfolioListResponse PortfolioSummary(Simulations simulations) {
        var token = GetAccessToken();
        try {
            Response<PortfolioListResponse> result = bit4YouService.PortfolioSummary("Bearer " + token.getAccessToken(), simulations).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<PortfolioOpenOrderResponse> PortfolioOpenOrder(Simulations simulations) {
        var token = GetAccessToken();
        try {
            Response<List<PortfolioOpenOrderResponse>> result = bit4YouService.PortfolioOpenOrder("Bearer " + token.getAccessToken(), simulations).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<PortfolioHistoryResponse> PortfolioHistory(Simulations simulations) {
        var token = GetAccessToken();
        try {
            Response<List<PortfolioHistoryResponse>> result = bit4YouService.PortfolioHistory("Bearer " + token.getAccessToken(), simulations).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public CreatePortfolioResponse PortfolioCreateOrder(PortfolioCreateOrder portfolioCreateOrder) {
        var token = GetAccessToken();
        try {
            Response<CreatePortfolioResponse> result = bit4YouService.PortfolioCreateOrder("Bearer " + token.getAccessToken(), portfolioCreateOrder).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public CancelPortfolioResponse PortfolioCancelOrder(CancelPortfolioOrder cancelPortfolioOrder) {
        var token = GetAccessToken();
        try {
            Response<CancelPortfolioResponse> result = bit4YouService.PortfolioCancelOrder("Bearer " + token.getAccessToken(), cancelPortfolioOrder).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public CancelPortfolioResponse PortfolioCloseOrder(ClosePortfolioPosition closePosition) {
        var token = GetAccessToken();
        try {
            Response<Void> result = bit4YouService.PortfolioCloseOrder("Bearer " + token.getAccessToken(), closePosition).execute();
            if (result.isSuccessful()) {
               // return result.body();
            }
            System.out.println("Need to Look at it: PortfolioCloseOrder");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<MarketListResponse> MarketList() {
        var token = GetAccessToken();
        try {
            Response<List<MarketListResponse>> result = bit4YouService.MarketList().execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<MarketSummrie> MarketSummaries() {
        var token = GetAccessToken();
        try {
            Response<List<MarketSummrie>> result = bit4YouService.MarketSummaries().execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<MarketTicksResponse> MarketTicks(MarketTicks marketTicks) {
        var token = GetAccessToken();
        try {
            Response<List<MarketTicksResponse>> result = bit4YouService.MarketTicks(marketTicks).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public MarketOrderBookResponse MarketOrderBook(MarketOrderBook marketOrderBook) {
        var token = GetAccessToken();
        try {
            Response<MarketOrderBookResponse> result = bit4YouService.MarketOrderBook(marketOrderBook).execute();
            if (result.isSuccessful()) {
                return result.body();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void MarketHistory(MarketHistory marketHistory) {
        var token = GetAccessToken();
        try {
            Response<Void> result = bit4YouService.MarketHistory(marketHistory).execute();
            if (result.isSuccessful()) {

            }
            System.out.println("Need to Look at it: PortfolioCloseOrder");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    private IBaseBit4YouService GetBaseBit64YouService() {
        var token = clientSettings.getAccessTokenUrl();
        var builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(token)
                .build();
        return builder.create(IBaseBit4YouService.class);
    }

    private IBit4YouService GetBit64YouService() {
        var builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(clientSettings.getApiUrl())
                .build();
        return builder.create(IBit4YouService.class);
    }
}
