import java.lang.Integer;
import java.util.*;
 
class PriceKey { 
    private final String customerId; 
    private final String region; 
    private final String currency; 
 
    public PriceKey(String customerId, String region, String currency) { 
        this.customerId = customerId; 
        this.region = region; 
        this.currency = currency; 
    } 
 
    public String getCustomerId() { return customerId; } 
    public String getRegion() { return region; } 
    public String getCurrency() { return currency; } 
 
    @Override 
    public boolean equals(Object obj) { 
        if (this == obj) return true; 
        if (!(obj instanceof PriceKey)) return false; 
        PriceKey other = (PriceKey) obj; 
        return Objects.equals(this.customerId, other.customerId) && Objects.equals(this.region, other.region) && Objects.equals(this.currency, other.currency);
    } 
 
    @Override 
    public int hashCode() { 
       
        return Objects.hash(customerId); 
    } 
} 
 
class PricingRepository { 
    private final Map<PriceKey, Integer> prices = new HashMap<>();
 
    public void putPrice(String customerId, String region, String currency, int price) {
        prices.put(new PriceKey(customerId, region, currency), price);
    }
 
    public Integer getPrice(String customerId, String region, String currency) { 
        return prices.get(new PriceKey(customerId, region, currency)); 
    } 
 
    public int size() { 
        return prices.size(); 
    } 
} 
 
public class Program1Buggy { 
    public static void main(String[] args) { 
        testIndependentPricesShouldNotOverwrite(); 
        testLookupByExactCompositeKey(); 
    } 
 
    static void testIndependentPricesShouldNotOverwrite() { 
        PricingRepository repo = new PricingRepository(); 
 
        repo.putPrice("C1", "US", "USD", 100); 
        repo.putPrice("C1", "EU", "EUR", 200); 
 
        assertEquals(2, repo.size(), "Different region/currency must produce distinct entries"); 
    } 
 
    static void testLookupByExactCompositeKey() { 
        PricingRepository repo = new PricingRepository();

        repo.putPrice("C1", "US", "USD",100);
        repo.putPrice("C1", "EU", "EUR", 200); 
 
        assertEquals(Integer.valueOf(100), repo.getPrice("C1", "US", "USD"),
                "Should return US price"); 
        assertEquals(Integer.valueOf(200), repo.getPrice("C1", "EU", "EUR"),
                "Should return EU price"); 
    } 
 
    static void assertEquals(Object expected, Object actual, String message) { 
        if (!Objects.equals(expected, actual)) { 
            throw new RuntimeException(message + " | expected=" + expected + ", actual=" + actual); 
        } 
    } 
} 